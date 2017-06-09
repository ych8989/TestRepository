package coap.exam01.server;

import org.eclipse.californium.core.CoapServer;

public class CoapResourceServer {

    //Field
    private CoapServer coapServer;

    //Constructor
    public CoapResourceServer() {
        coapServer = new CoapServer();
        coapServer.add(new CoapResource01());
        coapServer.start();
    }

    //Method
    public void shutdown() {
        coapServer.stop();
        coapServer.destroy();
        
    }

    public static void main(String[] args) {
        CoapResourceServer server = new CoapResourceServer();
        System.out.print("CoAP Server is listening on port 5683");
    }
}
