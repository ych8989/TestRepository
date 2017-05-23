package test;

import hardware.buzzer.ActiveBuzzer;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.led.DualColorLed;
import hardware.button.Button;
import java.io.IOException;

public class ButtonActionBuzzerTest {

	public static void main(String[] args) throws IOException {
		Button button = new Button(RaspiPin.GPIO_02);
		ActiveBuzzer test = new ActiveBuzzer(RaspiPin.GPIO_00);
		button.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					test.on();
				} else {
					test.off();
				}
			}
		});
		System.out.println("Ready....");
		System.in.read();

	}

}
