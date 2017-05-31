package hardware.test;

import com.pi4j.io.gpio.RaspiPin;
import hardware.converter.PCF8591;
import hardware.led.RgbLedDigital;
import hardware.sensor.PhotoresistorSensor;

public class PhotoresistorSensorRgbLedTest {

	public static void main(String[] args) throws Exception {
		RgbLedDigital rgbLed = new RgbLedDigital(RaspiPin.GPIO_23, RaspiPin.GPIO_24, RaspiPin.GPIO_25);
		PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN0);
		PhotoresistorSensor test = new PhotoresistorSensor(pcf8591);
		while (true) {
			double value = test.getValue();
			if (value < 150) {
				rgbLed.rgb(false, false, false);
			} else {
				rgbLed.rgb(true, true, true);
			}
			System.out.println(value);
			Thread.sleep(1000);
		}
	}
}
