package hardware.test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.led.RgbLedDigital;
import hardware.button.Button;
import java.io.IOException;

public class TeamButtonTest {

	public static void main(String[] args) throws IOException {
		Button redButton = new Button(RaspiPin.GPIO_00);
		Button greenButton = new Button(RaspiPin.GPIO_21);
		Button blueButton = new Button(RaspiPin.GPIO_22);
		RgbLedDigital test = new RgbLedDigital(RaspiPin.GPIO_27, RaspiPin.GPIO_28, RaspiPin.GPIO_29);

		redButton.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					test.red(true);
				} else {
					test.red(false);
				}
			}
		});
		greenButton.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					test.green(true);
				} else {
					test.green(false);
				}
			}
		});
		blueButton.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					test.blue(true);
				} else {
					test.blue(false);
				}
			}
		});

		System.out.println("Ready....");
		System.in.read();
	}
}
