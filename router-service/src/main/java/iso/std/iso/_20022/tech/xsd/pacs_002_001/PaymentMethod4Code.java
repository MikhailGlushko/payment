//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.10 at 12:48:44 PM AEST 
//


package iso.std.iso._20022.tech.xsd.pacs_002_001;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentMethod4Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentMethod4Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CHK"/>
 *     &lt;enumeration value="TRF"/>
 *     &lt;enumeration value="DD"/>
 *     &lt;enumeration value="TRA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentMethod4Code")
@XmlEnum
public enum PaymentMethod4Code {

    CHK,
    TRF,
    DD,
    TRA;

    public String value() {
        return name();
    }

    public static PaymentMethod4Code fromValue(String v) {
        return valueOf(v);
    }

}
