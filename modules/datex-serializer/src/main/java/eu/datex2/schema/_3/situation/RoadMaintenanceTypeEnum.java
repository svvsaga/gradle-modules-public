
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


    /**
     * repairing works after an accident, not clearance work but rebuilding of
     *             infrastructure
     *           
     * 
     */
    @XmlEnumValue("accidentRepairWork")
    ACCIDENT_REPAIR_WORK("accidentRepairWork"),

    /**
     * Clearance work of an unspecified nature.
     * 
     */
    @XmlEnumValue("clearanceWork")
    CLEARANCE_WORK("clearanceWork"),

    /**
     * Controlled avalanche work.
     * 
     */
    @XmlEnumValue("controlledAvalanche")
    CONTROLLED_AVALANCHE("controlledAvalanche"),

    /**
     * Installation of new equipments or systems on or along-side the roadway.
     *           
     * 
     */
    @XmlEnumValue("installationWork")
    INSTALLATION_WORK("installationWork"),

    /**
     * Grass cutting work.
     * 
     */
    @XmlEnumValue("grassCuttingWork")
    GRASS_CUTTING_WORK("grassCuttingWork"),

    /**
     * Work to collect litter from the roadway and/or adjacent verges.
     * 
     */
    @XmlEnumValue("litterClearance")
    LITTER_CLEARANCE("litterClearance"),

    /**
     * Maintenance of road, associated infrastructure or equipments.
     * 
     */
    @XmlEnumValue("maintenanceWork")
    MAINTENANCE_WORK("maintenanceWork"),

    /**
     * People on road for general maintenance purpose
     * 
     */
    @XmlEnumValue("maintenancePeopleOnRoad")
    MAINTENANCE_PEOPLE_ON_ROAD("maintenancePeopleOnRoad"),

    /**
     * Works which are overhead of the carriageway.
     * 
     */
    @XmlEnumValue("overheadWorks")
    OVERHEAD_WORKS("overheadWorks"),

    /**
     * Repair work to road, associated infrastructure or equipments.
     * 
     */
    @XmlEnumValue("repairWork")
    REPAIR_WORK("repairWork"),

    /**
     * Work associated with relaying or renewal of worn-out road surface (pavement).
     *           
     * 
     */
    @XmlEnumValue("resurfacingWork")
    RESURFACING_WORK("resurfacingWork"),

    /**
     * Striping and repainting of road markings, plus placement or replacement of
     *             reflecting studs (cats' eyes).
     *           
     * 
     */
    @XmlEnumValue("roadMarkingWork")
    ROAD_MARKING_WORK("roadMarkingWork"),

    /**
     * Road side work of an unspecified nature.
     * 
     */
    @XmlEnumValue("roadsideWork")
    ROADSIDE_WORK("roadsideWork"),

    /**
     * Roadworks are completed and are being cleared.
     * 
     */
    @XmlEnumValue("roadworksClearance")
    ROADWORKS_CLEARANCE("roadworksClearance"),

    /**
     * Road maintenance or improvement activity of an unspecified nature which may
     *             potentially cause traffic disruption.
     *           
     * 
     */
    @XmlEnumValue("roadworks")
    ROADWORKS("roadworks"),

    /**
     * Rock fall preventative maintenance.
     * 
     */
    @XmlEnumValue("rockFallPreventativeMaintenance")
    ROCK_FALL_PREVENTATIVE_MAINTENANCE("rockFallPreventativeMaintenance"),

    /**
     * Spreading of salt and / or grit on the road surface to prevent or melt snow or
     *             ice.
     *           
     * 
     */
    @XmlEnumValue("saltingInProgress")
    SALTING_IN_PROGRESS("saltingInProgress"),

    /**
     * Snowploughs or other similar mechanical devices in use to clear snow from the
     *             road.
     *           
     * 
     */
    @XmlEnumValue("snowploughsInUse")
    SNOWPLOUGHS_IN_USE("snowploughsInUse"),

    /**
     * Sweeping of the roadway.
     * 
     */
    @XmlEnumValue("sweepingOfRoad")
    SWEEPING_OF_ROAD("sweepingOfRoad"),

    /**
     * Tree and vegetation cutting work adjacent to the roadway.
     * 
     */
    @XmlEnumValue("treeAndVegetationCuttingWork")
    TREE_AND_VEGETATION_CUTTING_WORK("treeAndVegetationCuttingWork"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
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
