package test;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.button.Button;
import hardware.led.DualColorLed;

public class ButtonTest {

    private GpioPinDigitalInput gpioPinDigitalInput;

    public ButtonTest(Pin buttonPinNo) {
        GpioController gpioController = GpioFactory.getInstance();
        gpioPinDigitalInput = gpioController.provisionDigitalInputPin(buttonPinNo);
        gpioPinDigitalInput.setShutdownOptions(true);
    }

    public void setGpioPinListenerDigital(
            GpioPinListenerDigital gpioPinListenerDigital) {
        gpioPinDigitalInput.addListener(gpioPinListenerDigital);
    }

    public static void main(String[] args) throws Exception {
        DualColorLed dualColorLed
                = new DualColorLed(RaspiPin.GPIO_01, RaspiPin.GPIO_02);
        dualColorLed.green();
        Button button = new Button(RaspiPin.GPIO_00);
        button.setGpioPinListenerDigital(new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                System.out.println(event.getState());
                if (event.getState() == PinState.HIGH) {
                    dualColorLed.green();
                } else if (event.getState() == PinState.LOW) {
                    dualColorLed.red();
                }
            }
        });
        System.out.println("Ready...");
        Thread.sleep(10000);
    }
}
