package philip.shedrack;

import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Releve {
    private long rib;
    private List<Operation> operations = new ArrayList<>();
    private Date dateReleve;
    private double solde;

    public Releve(long rib, Date dateReleve, double solde) {
        this.rib = rib;
        operations.add(new Operation(TypeOperation.CREDIT, new Date(), Math.random()*9800, TypeDescription.Vers_Espèce));
        operations.add(new Operation(TypeOperation.DEBIT, new Date(), Math.random()*5600, TypeDescription.Virement));
        operations.add(new Operation(TypeOperation.CREDIT, new Date(), Math.random()*3500, TypeDescription.Chèque_Guichet));
        operations.add(new Operation(TypeOperation.DEBIT, new Date(), Math.random()*100, TypeDescription.Prélèvement_Assurance));
        this.dateReleve = dateReleve;
        this.solde = solde;
    }

    public long getRib() {
        return rib;
    }

    public void setRib(long rib) {
        this.rib = rib;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public Date getDateReleve() {
        return dateReleve;
    }

    public void setDateReleve(Date dateReleve) {
        this.dateReleve = dateReleve;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
