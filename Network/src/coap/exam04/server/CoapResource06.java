package coap.exam04.server;

import com.pi4j.io.gpio.RaspiPin;
import hardware.converter.PCF8591;
import hardware.sensor.GasSensor;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class CoapResource06 extends CoapResource {
    //Field

    double value;
    private GasSensor GasSensor;

    //Constructor
    public CoapResource06() {
        super("resource06");
        //관찰기능 활성화
        setObservable(true);
        //관찰 기능을 제공하다라는 것을 클라이언트가 알수 있도록 설정
        getAttributes().setObservable();
        PCF8591 pcf8591 = new PCF8591(0x48, PCF8591.AIN2);
        GasSensor = new GasSensor(pcf8591, RaspiPin.GPIO_23);

        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    try {
                        value = GasSensor.getValue();
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
        exchange.respond(String.valueOf(value));

    }
}
