package philip.shedrack;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Releve {
    @XmlElement(name = "operation")
    public List<Operation> operations = new ArrayList<>();
}
