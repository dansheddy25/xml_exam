package philip.shedrack;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class DeserialisationXML {
    public static void main(String[] args) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        System.out.println("*****************************");
        for (Operation op : releve.operations) {
            System.out.println(op.toString());
            System.out.println("----------------------------");
        }
    }
}
