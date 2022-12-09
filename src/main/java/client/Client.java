package client;

import proxy.BankService;
import proxy.BanqueWS;
import proxy.Compte;

/*I CREATED THE CLIENT AND THE PROXY AND THE WS JUST TO KEEP IT GROUPED IN ONE REPO*/
public class Client {
    public static void main(String[] args) {
        /*BanqueWS is the name of the WS we initialized in BankService.java*/
        BankService stub = new BanqueWS().getBankServicePort();
        System.out.println(stub.convert(10));

        Compte cp = stub.getCompte(4);
        System.out.println("Code : " + cp.getCode());
        System.out.println("Solde : " + cp.getSolde());
    }
}
