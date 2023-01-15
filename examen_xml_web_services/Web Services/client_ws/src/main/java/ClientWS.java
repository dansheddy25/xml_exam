import proxy.Operation;
import proxy.Releve;
import proxy.ReleveService;
import proxy.ReleveWS;

public class ClientWS {
    public static void main(String[] args) {
        ReleveService stub = new ReleveWS().getReleveServicePort();
        System.out.println("rib : " + stub.getReleve(1).getRib());
        System.out.println("date releve : " + stub.getReleve(1).getDateReleve());
        System.out.println("solde : " + stub.getReleve(1).getSolde());
        System.out.println("");
    }
}
