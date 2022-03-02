
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestAreaActivityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RestAreaActivityEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="openFire"/&gt;
 *     &lt;enumeration value="overnightParking"/&gt;
 *     &lt;enumeration value="picnic"/&gt;
 *     &lt;enumeration value="smoking"/&gt;
 *     &lt;enumeration value="camping"/&gt;
 *     &lt;enumeration value="handlingHazardousMaterial"/&gt;
 *     &lt;enumeration value="barbecue"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestAreaActivityEnum", namespace = "http://datex2.eu/schema/2/2_0")
@XmlEnum
public enum RestAreaActivityEnum {

    @XmlEnumValue("openFire")
    OPEN_FIRE("openFire"),
    @XmlEnumValue("overnightParking")
    OVERNIGHT_PARKING("overnightParking"),
    @XmlEnumValue("picnic")
    PICNIC("picnic"),
    @XmlEnumValue("smoking")
    SMOKING("smoking"),
    @XmlEnumValue("camping")
    CAMPING("camping"),
    @XmlEnumValue("handlingHazardousMaterial")
    HANDLING_HAZARDOUS_MATERIAL("handlingHazardousMaterial"),
    @XmlEnumValue("barbecue")
    BARBECUE("barbecue"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    RestAreaActivityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RestAreaActivityEnum fromValue(String v) {
        for (RestAreaActivityEnum c: RestAreaActivityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
