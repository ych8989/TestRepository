package coap.exam04.server;

import hardware.converter.PCF8591;
import hardware.sensor.ThermistorSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource05 extends CoapResource {

    //Field
    double value;
    PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN1);
    ThermistorSensor thermistorSensor = new ThermistorSensor(pcf8591);

    //Constructor
    public CoapResource05() {
        super("resource05");
        //관찰기능 활성화
        setObservable(true);
        //관찰 기능을 제공하다라는 것을 클라이언트가 알수 있도록 설정
        getAttributes().setObservable();

        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        value = thermistorSensor.getValue();
                        changed();
                    } catch (Exception ex) {
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };
        thread.start();
    }

    //Method
    @Override
    public void handleGET(CoapExchange exchange) {
        exchange.respond("온도:섭씨" + value + "도");
    }
}
