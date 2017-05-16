package hardware.led;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class RgbLed {

    private GpioPinDigitalOutput redPin;
    private GpioPinDigitalOutput greenPin;
    private GpioPinDigitalOutput bluePin;

    public RgbLed(Pin redPinNo, Pin greenPinNo, Pin bluePinNo) {
        GpioController gpioController = GpioFactory.getInstance();

        redPin = gpioController.provisionDigitalOutputPin(redPinNo);
        redPin.setShutdownOptions(true, PinState.HIGH);

        greenPin = gpioController.provisionDigitalOutputPin(greenPinNo);
        greenPin.setShutdownOptions(true, PinState.HIGH);

        bluePin = gpioController.provisionDigitalOutputPin(bluePinNo);
        bluePin.setShutdownOptions(true, PinState.HIGH);
    }

    public void red() {
        redPin.low();
        greenPin.high();
        bluePin.high();
    }

    public void green() {
        redPin.high();
        greenPin.low();
        bluePin.high();
    }

    public void blue() {
        redPin.high();
        greenPin.high();
        bluePin.low();
    }

    public static void main(String[] args) throws InterruptedException {
        RgbLed test = new RgbLed(RaspiPin.GPIO_27, RaspiPin.GPIO_28, RaspiPin.GPIO_29);
        while (true) {
            test.green();
            Thread.sleep(50);
            test.red();
            Thread.sleep(50);
            test.blue();
            Thread.sleep(50);
        }
    }
}
