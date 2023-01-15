package philip.shedrack;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Operation {
    @XmlAttribute
    private TypeOperation type;
    private Date date;
    private double montant;
    private TypeDescription description;

    public Operation() {
    }

    public Operation(TypeOperation type, Date date, double montant, TypeDescription description) {
        this.type = type;
        this.date = date;
        this.montant = montant;
        this.description = description;
    }


    public TypeOperation getType() {
        return type;
    }

    public void setType(TypeOperation type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public TypeDescription getDescription() {
        return description;
    }

    public void setDescription(TypeDescription description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "type=" + type +
                ", date=" + date +
                ", montant=" + montant +
                ", description=" + description +
                '}';
    }
}
