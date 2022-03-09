
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadMaintenanceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RoadMaintenanceTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="accidentRepairWork"/&gt;
 *     &lt;enumeration value="clearanceWork"/&gt;
 *     &lt;enumeration value="controlledAvalanche"/&gt;
 *     &lt;enumeration value="installationWork"/&gt;
 *     &lt;enumeration value="grassCuttingWork"/&gt;
 *     &lt;enumeration value="litterClearance"/&gt;
 *     &lt;enumeration value="maintenanceWork"/&gt;
 *     &lt;enumeration value="maintenancePeopleOnRoad"/&gt;
 *     &lt;enumeration value="overheadWorks"/&gt;
 *     &lt;enumeration value="repairWork"/&gt;
 *     &lt;enumeration value="resurfacingWork"/&gt;
 *     &lt;enumeration value="roadMarkingWork"/&gt;
 *     &lt;enumeration value="roadsideWork"/&gt;
 *     &lt;enumeration value="roadworksClearance"/&gt;
 *     &lt;enumeration value="roadworks"/&gt;
 *     &lt;enumeration value="rockFallPreventativeMaintenance"/&gt;
 *     &lt;enumeration value="saltingInProgress"/&gt;
 *     &lt;enumeration value="snowploughsInUse"/&gt;
 *     &lt;enumeration value="sweepingOfRoad"/&gt;
 *     &lt;enumeration value="treeAndVegetationCuttingWork"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RoadMaintenanceTypeEnum")
@XmlEnum
public enum RoadMaintenanceTypeEnum {

    @XmlEnumValue("accidentRepairWork")
    ACCIDENT_REPAIR_WORK("accidentRepairWork"),
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),
    @XmlEnumValue("controlledAvalanche")
    CONTROLLED_AVALANCHE("controlledAvalanche"),
    @XmlEnumValue("installationWork")
    INSTALLATION_WORK("installationWork"),
    @XmlEnumValue("grassCuttingWork")
    GRASS_CUTTING_WORK("grassCuttingWork"),
    @XmlEnumValue("litterClearance")
    LITTER_CLEARANCE("litterClearance"),
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),
    @XmlEnumValue("maintenancePeopleOnRoad")
    MAINTENANCE_PEOPLE_ON_ROAD("maintenancePeopleOnRoad"),
    @XmlEnumValue("overheadWorks")
    OVERHEAD_WORKS("overheadWorks"),
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),
    @XmlEnumValue("resurfacingWork")
    RESURFACING_WORK("resurfacingWork"),
    @XmlEnumValue("roadMarkingWork")
    ROAD_MARKING_WORK("roadMarkingWork"),
    @XmlEnumValue("roadsideWork")
    ROADSIDE_WORK("roadsideWork"),
    @XmlEnumValue("roadworksClearance")
    ROADWORKS_CLEARANCE("roadworksClearance"),
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),
    @XmlEnumValue("rockFallPreventativeMaintenance")
    ROCK_FALL_PREVENTATIVE_MAINTENANCE("rockFallPreventativeMaintenance"),
    @XmlEnumValue("saltingInProgress")
    SALTING_IN_PROGRESS("saltingInProgress"),
    @XmlEnumValue("snowploughsInUse")
    SNOWPLOUGHS_IN_USE("snowploughsInUse"),
    @XmlEnumValue("sweepingOfRoad")
    SWEEPING_OF_ROAD("sweepingOfRoad"),
    @XmlEnumValue("treeAndVegetationCuttingWork")
    TREE_AND_VEGETATION_CUTTING_WORK("treeAndVegetationCuttingWork"),
    @XmlEnumValue("other")
    OTHER("other"),
    @XmlEnumValue("_extended")
    __EXTENDED("_extended");
    private final String value;

    RoadMaintenanceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadMaintenanceTypeEnum fromValue(String v) {
        for (RoadMaintenanceTypeEnum c: RoadMaintenanceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
