
package proxy;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeDescription.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <pre>{@code
 * <simpleType name="typeDescription">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Vers_Espèce"/>
 *     <enumeration value="Chèque_Guichet"/>
 *     <enumeration value="Prélèvement_Assurance"/>
 *     <enumeration value="Virement"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "typeDescription")
@XmlEnum
public enum TypeDescription {

    @XmlEnumValue("Vers_Esp\u00e8ce")
    VERS_ESPÈCE("Vers_Esp\u00e8ce"),
    @XmlEnumValue("Ch\u00e8que_Guichet")
    CHÈQUE_GUICHET("Ch\u00e8que_Guichet"),
    @XmlEnumValue("Pr\u00e9l\u00e8vement_Assurance")
    PRÉLÈVEMENT_ASSURANCE("Pr\u00e9l\u00e8vement_Assurance"),
    @XmlEnumValue("Virement")
    VIREMENT("Virement");
    private final String value;

    TypeDescription(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeDescription fromValue(String v) {
        for (TypeDescription c: TypeDescription.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
