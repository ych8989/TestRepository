package hardware.UltrsonicSensorBuzzer;

import com.pi4j.io.gpio.RaspiPin;
import hardware.sensor.UltrsonicSensor;
import java.io.IOException;

public class UltrsonicSensorBuzzertest {

    public static void main(String[] args) throws IOException, InterruptedException {
        UltrsonicSensor test = new UltrsonicSensor(RaspiPin.GPIO_00, RaspiPin.GPIO_01);
        ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_02);

        while (true) {
            int distance = test.getDistabce();
            if (distance < 20) {
                buzzer.on();
            }

            System.out.println("거리(cm):" + distance);
            Thread.sleep(1000);
            buzzer.off();
        }
    }
}