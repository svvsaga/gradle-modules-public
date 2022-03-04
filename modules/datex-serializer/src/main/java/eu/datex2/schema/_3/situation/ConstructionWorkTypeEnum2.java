
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConstructionWorkTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConstructionWorkTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="blastingWork"/&gt;
 *     &lt;enumeration value="constructionWork"/&gt;
 *     &lt;enumeration value="demolitionWork"/&gt;
 *     &lt;enumeration value="roadImprovementOrUpgrading"/&gt;
 *     &lt;enumeration value="roadWideningWork"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConstructionWorkTypeEnum")
@XmlEnum
public enum ConstructionWorkTypeEnum2 {

    @XmlEnumValue("blastingWork")
    BLASTING_WORK("blastingWork"),
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),
    @XmlEnumValue("demolitionWork")
    DEMOLITION_WORK("demolitionWork"),
    @XmlEnumValue("roadImprovementOrUpgrading")
    ROAD_IMPROVEMENT_OR_UPGRADING("roadImprovementOrUpgrading"),
    @XmlEnumValue("roadWideningWork")
    ROAD_WIDENING_WORK("roadWideningWork"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    ConstructionWorkTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionWorkTypeEnum2 fromValue(String v) {
        for (ConstructionWorkTypeEnum2 c: ConstructionWorkTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
