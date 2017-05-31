package hardware.test;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import hardware.buzzer.ActiveBuzzer;
import hardware.converter.PCF8591;
import hardware.led.DualColorLed;
import hardware.motor.SG90Servo;
import hardware.sensor.GasSensor;

public class GasSensorBuzzerDualLedServoMotorTest {

	public static void main(String[] args) throws Exception {
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		GasSensor test = new GasSensor(pcf8591, RaspiPin.GPIO_00);
		ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_21);
		DualColorLed led = new DualColorLed(RaspiPin.GPIO_02, RaspiPin.GPIO_03);
		SG90Servo motor = new SG90Servo(RaspiPin.GPIO_23, 8, 27);

		// how1 : Digital 핀의 상태를 이용
		test.setGpioPinListenerDigital(new GpioPinListenerDigital() {
			@Override
			public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
				if (event.getState() == PinState.LOW) {
					System.out.println("!!가스 가스 가스!!");
					buzzer.on();
					led.red();
					motor.setAngle(180);
				} else {
					System.out.println("-정상 상태-");
					buzzer.off();
					led.green();
					motor.setAngle(0);
				}
			}
		});
		// how2 : Analog값 이용
		while (true) {
			double value = test.getValue();
			System.out.println(value);
			Thread.sleep(1000);
		}

	}

}
