package hardware.test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.sensor.FlameSensor;

public class FlameSensorBuzzerDualLedTest {

	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		FlameSensor test = new FlameSensor(pcf8591, RaspiPin.GPIO_00);
		DualColorLed dualColorLed = new DualColorLed(RaspiPin.GPIO_04, RaspiPin.GPIO_05);
		ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_06);

		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					System.out.println("!!화재상태!!");
					dualColorLed.red();
					buzzer.on();
				} else {
					System.out.println("-정상상태-");
					dualColorLed.green();
					buzzer.off();
				}
			}
		});
		System.out.println("Ready....");
		System.in.read();
	}
}
