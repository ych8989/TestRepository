package hardware.sensor;

import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;
import hardware.UltrsonicSensorBuzzer.ActiveBuzzer;
import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {
        TrackingSensor test = new TrackingSensor(RaspiPin.GPIO_00);
        ActiveBuzzer buzzer = new ActiveBuzzer(RaspiPin.GPIO_02);

        test.setGpioPinListenerDigital(event -> {
            if (event.getState() == PinState.HIGH) {
                System.out.println("Black");
                buzzer.off();
            } else {
                System.out.println("White");
                buzzer.on();
            }
        });
        System.out.println("Ready...");
        System.in.read();
    }
}
