
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
public enum ConstructionWorkTypeEnum {


    /**
     * Blasting or quarrying work at the specified location.
     * 
     */
    @XmlEnumValue("blastingWork")
    BLASTING_WORK("blastingWork"),

    /**
     * Construction work of a general nature at the specified location.
     *           
     * 
     */
    @XmlEnumValue("constructionWork")
    CONSTRUCTION_WORK("constructionWork"),

    /**
     * Demolition work associated with the construction work.
     * 
     */
    @XmlEnumValue("demolitionWork")
    DEMOLITION_WORK("demolitionWork"),

    /**
     * Construction work associated with improvements to the road or its layout or with
     *             it upgrading.
     *           
     * 
     */
    @XmlEnumValue("roadImprovementOrUpgrading")
    ROAD_IMPROVEMENT_OR_UPGRADING("roadImprovementOrUpgrading"),

    /**
     * Road widening work at the specified location.
     * 
     */
    @XmlEnumValue("roadWideningWork")
    ROAD_WIDENING_WORK("roadWideningWork"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    ConstructionWorkTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConstructionWorkTypeEnum fromValue(String v) {
        for (ConstructionWorkTypeEnum c: ConstructionWorkTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
