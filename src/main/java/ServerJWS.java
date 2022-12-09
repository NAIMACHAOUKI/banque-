import BankServices.BankService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9191/", new BankService());
        System.out.println("Web Service Started at http://localhost:9191/ ! ");
    }
}
