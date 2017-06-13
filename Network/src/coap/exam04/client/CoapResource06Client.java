package coap.exam04.client;

import java.io.IOException;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapHandler;
import org.eclipse.californium.core.CoapObserveRelation;
import org.eclipse.californium.core.CoapResponse;

public class CoapResource06Client {

    //field
    double value;
    String state = "가스 검출!!!";
    private CoapClient coapClient;
    private CoapObserveRelation coapObserveRelation;

    //constructor
    public CoapResource06Client() {
        coapClient = new CoapClient();
    }

    //method
    public void observe() {
        coapClient.setURI("coap://192.168.3.26/resource06");
        coapObserveRelation = coapClient.observe(new CoapHandler() {
            @Override            
            public void onLoad(CoapResponse response) { //응답이 오면 실행 (handleGET.respond)
                String text = response.getResponseText();
                value = Double.parseDouble(text);
                if (value > 150) {
                    state = "가스 검출!!!";
                    System.out.println(state + value);
                } else {
                    if (state.equals("가스 검출!!!")) {
                        state = "정상 상태...";
                        System.out.println(state);
                    } else {
                        state = "정상 상태...";
                    }
                }
            }
            @Override
            public void onError() {
            }
        });
    }

    public void shutdown() {
        coapObserveRelation.proactiveCancel();
        coapClient.shutdown();
    }

    public static void main(String[] args) throws IOException {
        CoapResource06Client client = new CoapResource06Client();
        client.observe();
        System.in.read();
        client.shutdown();
    }
}
