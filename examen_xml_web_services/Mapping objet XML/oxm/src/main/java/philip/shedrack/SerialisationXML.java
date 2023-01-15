package philip.shedrack;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.util.Date;

public class SerialisationXML {
    public static void main(String[] args) throws Exception {
        Releve releve = new Releve();
        releve.operations.add(new Operation(TypeOperation.CREDIT, new Date(), 1000, TypeDescription.Vers_Espèce));
        releve.operations.add(new Operation(TypeOperation.DEBIT, new Date(), 2500, TypeDescription.Chèque_Guichet));
        releve.operations.add(new Operation(TypeOperation.DEBIT, new Date(), 500, TypeDescription.Prélèvement_Assurance));
        releve.operations.add(new Operation(TypeOperation.CREDIT, new Date(), 5800, TypeDescription.Virement));

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(releve, new File("releve.xml"));
    }
}
