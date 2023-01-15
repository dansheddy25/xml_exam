package server;

import jakarta.xml.ws.Endpoint;
import philip.shedrack.ReleveService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/", new ReleveService());
        System.out.println("Web Service deployé sur http://0.0.0.0:9191/");
    }
}
