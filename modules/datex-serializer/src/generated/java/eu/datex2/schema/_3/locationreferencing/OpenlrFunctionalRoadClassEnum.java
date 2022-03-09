
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrFunctionalRoadClassEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OpenlrFunctionalRoadClassEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="frc0"/&gt;
 *     &lt;enumeration value="frc1"/&gt;
 *     &lt;enumeration value="frc2"/&gt;
 *     &lt;enumeration value="frc3"/&gt;
 *     &lt;enumeration value="frc4"/&gt;
 *     &lt;enumeration value="frc5"/&gt;
 *     &lt;enumeration value="frc6"/&gt;
 *     &lt;enumeration value="frc7"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OpenlrFunctionalRoadClassEnum")
@XmlEnum
public enum OpenlrFunctionalRoadClassEnum {

    @XmlEnumValue("frc0")
    FRC_0("frc0"),
    @XmlEnumValue("frc1")
    FRC_1("frc1"),
    @XmlEnumValue("frc2")
    FRC_2("frc2"),
    @XmlEnumValue("frc3")
    FRC_3("frc3"),
    @XmlEnumValue("frc4")
    FRC_4("frc4"),
    @XmlEnumValue("frc5")
    FRC_5("frc5"),
    @XmlEnumValue("frc6")
    FRC_6("frc6"),
    @XmlEnumValue("frc7")
    FRC_7("frc7"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    OpenlrFunctionalRoadClassEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrFunctionalRoadClassEnum fromValue(String v) {
        for (OpenlrFunctionalRoadClassEnum c: OpenlrFunctionalRoadClassEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
