
package eu.datex2.schema._3.common;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="LoadTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="abnormalLoad"/&gt;
 *     &lt;enumeration value="ammunition"/&gt;
 *     &lt;enumeration value="chemicals"/&gt;
 *     &lt;enumeration value="combustibleMaterials"/&gt;
 *     &lt;enumeration value="corrosiveMaterials"/&gt;
 *     &lt;enumeration value="debris"/&gt;
 *     &lt;enumeration value="empty"/&gt;
 *     &lt;enumeration value="explosiveMaterials"/&gt;
 *     &lt;enumeration value="extraHighLoad"/&gt;
 *     &lt;enumeration value="extraLongLoad"/&gt;
 *     &lt;enumeration value="extraWideLoad"/&gt;
 *     &lt;enumeration value="fuel"/&gt;
 *     &lt;enumeration value="glass"/&gt;
 *     &lt;enumeration value="goods"/&gt;
 *     &lt;enumeration value="hazardousMaterials"/&gt;
 *     &lt;enumeration value="liquid"/&gt;
 *     &lt;enumeration value="livestock"/&gt;
 *     &lt;enumeration value="materials"/&gt;
 *     &lt;enumeration value="materialsDangerousForPeople"/&gt;
 *     &lt;enumeration value="materialsDangerousForTheEnvironment"/&gt;
 *     &lt;enumeration value="materialsDangerousForWater"/&gt;
 *     &lt;enumeration value="oil"/&gt;
 *     &lt;enumeration value="ordinary"/&gt;
 *     &lt;enumeration value="perishableProducts"/&gt;
 *     &lt;enumeration value="petrol"/&gt;
 *     &lt;enumeration value="pharmaceuticalMaterials"/&gt;
 *     &lt;enumeration value="radioactiveMaterials"/&gt;
 *     &lt;enumeration value="refrigeratedGoods"/&gt;
 *     &lt;enumeration value="refuse"/&gt;
 *     &lt;enumeration value="toxicMaterials"/&gt;
 *     &lt;enumeration value="vehicles"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoadTypeEnum", namespace = "http://datex2.eu/schema/3/common")
@XmlEnum
public enum LoadTypeEnum2 {


    /**
     * A load that exceeds normal vehicle dimensions in terms of height, length, width,
     *             gross vehicle weight or axle weight or any combination of these. Generally termed an "abnormal
     *             load".
     *           
     * 
     */
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),

    /**
     * Ammunition.
     * 
     */
    @XmlEnumValue("ammunition")
    AMMUNITION("ammunition"),

    /**
     * Chemicals of unspecified type.
     * 
     */
    @XmlEnumValue("chemicals")
    CHEMICALS("chemicals"),

    /**
     * Combustible materials of unspecified type.
     * 
     */
    @XmlEnumValue("combustibleMaterials")
    COMBUSTIBLE_MATERIALS("combustibleMaterials"),

    /**
     * Corrosive materials of unspecified type.
     * 
     */
    @XmlEnumValue("corrosiveMaterials")
    CORROSIVE_MATERIALS("corrosiveMaterials"),

    /**
     * Debris of unspecified type.
     * 
     */
    @XmlEnumValue("debris")
    DEBRIS("debris"),

    /**
     * No load.
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty"),

    /**
     * Explosive materials of unspecified type.
     * 
     */
    @XmlEnumValue("explosiveMaterials")
    EXPLOSIVE_MATERIALS("explosiveMaterials"),

    /**
     * A load of exceptional height.
     * 
     */
    @XmlEnumValue("extraHighLoad")
    EXTRA_HIGH_LOAD("extraHighLoad"),

    /**
     * A load of exceptional length.
     * 
     */
    @XmlEnumValue("extraLongLoad")
    EXTRA_LONG_LOAD("extraLongLoad"),

    /**
     * A load of exceptional width.
     * 
     */
    @XmlEnumValue("extraWideLoad")
    EXTRA_WIDE_LOAD("extraWideLoad"),

    /**
     * Fuel of unspecified type.
     * 
     */
    @XmlEnumValue("fuel")
    FUEL("fuel"),

    /**
     * Glass.
     * 
     */
    @XmlEnumValue("glass")
    GLASS("glass"),

    /**
     * Any goods of a commercial nature.
     * 
     */
    @XmlEnumValue("goods")
    GOODS("goods"),

    /**
     * Materials classed as being of a hazardous nature.
     * 
     */
    @XmlEnumValue("hazardousMaterials")
    HAZARDOUS_MATERIALS("hazardousMaterials"),

    /**
     * Liquid of an unspecified nature.
     * 
     */
    @XmlEnumValue("liquid")
    LIQUID("liquid"),

    /**
     * Livestock.
     * 
     */
    @XmlEnumValue("livestock")
    LIVESTOCK("livestock"),

    /**
     * General materials of unspecified type.
     * 
     */
    @XmlEnumValue("materials")
    MATERIALS("materials"),

    /**
     * Materials classed as being of a danger to people or animals.
     * 
     */
    @XmlEnumValue("materialsDangerousForPeople")
    MATERIALS_DANGEROUS_FOR_PEOPLE("materialsDangerousForPeople"),

    /**
     * Materials classed as being potentially dangerous to the environment.
     *           
     * 
     */
    @XmlEnumValue("materialsDangerousForTheEnvironment")
    MATERIALS_DANGEROUS_FOR_THE_ENVIRONMENT("materialsDangerousForTheEnvironment"),

    /**
     * Materials classed as being dangerous when exposed to water (e.g. materials which
     *             may react exothermically with water).
     *           
     * 
     */
    @XmlEnumValue("materialsDangerousForWater")
    MATERIALS_DANGEROUS_FOR_WATER("materialsDangerousForWater"),

    /**
     * Oil.
     * 
     */
    @XmlEnumValue("oil")
    OIL("oil"),

    /**
     * Materials that present limited environmental or health risk. Non-combustible,
     *             non-toxic, non-corrosive.
     *           
     * 
     */
    @XmlEnumValue("ordinary")
    ORDINARY("ordinary"),

    /**
     * Products or produce that will significantly degrade in quality or freshness over a
     *             short period of time.
     *           
     * 
     */
    @XmlEnumValue("perishableProducts")
    PERISHABLE_PRODUCTS("perishableProducts"),

    /**
     * Petrol or petroleum.
     * 
     */
    @XmlEnumValue("petrol")
    PETROL("petrol"),

    /**
     * Pharmaceutical materials.
     * 
     */
    @XmlEnumValue("pharmaceuticalMaterials")
    PHARMACEUTICAL_MATERIALS("pharmaceuticalMaterials"),

    /**
     * Materials that emit significant quantities of electro-magnetic radiation that may
     *             present a risk to people, animals or the environment.
     *           
     * 
     */
    @XmlEnumValue("radioactiveMaterials")
    RADIOACTIVE_MATERIALS("radioactiveMaterials"),

    /**
     * Refrigerated goods.
     * 
     */
    @XmlEnumValue("refrigeratedGoods")
    REFRIGERATED_GOODS("refrigeratedGoods"),

    /**
     * Refuse.
     * 
     */
    @XmlEnumValue("refuse")
    REFUSE("refuse"),

    /**
     * Materials of a toxic nature which may damage the environment or endanger public
     *             health.
     *           
     * 
     */
    @XmlEnumValue("toxicMaterials")
    TOXIC_MATERIALS("toxicMaterials"),

    /**
     * Vehicles of any type which are being transported.
     * 
     */
    @XmlEnumValue("vehicles")
    VEHICLES("vehicles"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    LoadTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadTypeEnum2 fromValue(String v) {
        for (LoadTypeEnum2 c: LoadTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
