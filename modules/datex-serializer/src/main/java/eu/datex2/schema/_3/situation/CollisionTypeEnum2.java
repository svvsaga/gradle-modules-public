
package eu.datex2.schema._3.situation;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollisionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CollisionTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="collisionWithAnimal"/&gt;
 *     &lt;enumeration value="collisionWithObstacle"/&gt;
 *     &lt;enumeration value="collisionWithPerson"/&gt;
 *     &lt;enumeration value="headOnCollision"/&gt;
 *     &lt;enumeration value="headOnOrSideCollision"/&gt;
 *     &lt;enumeration value="multipleVehicleCollision"/&gt;
 *     &lt;enumeration value="rearCollision"/&gt;
 *     &lt;enumeration value="sideCollision"/&gt;
 *     &lt;enumeration value="_extended"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CollisionTypeEnum")
@XmlEnum
public enum CollisionTypeEnum2 {


    /**
     * Collision of vehicle with one or more animals.
     * 
     */
    @XmlEnumValue("collisionWithAnimal")
    COLLISION_WITH_ANIMAL("collisionWithAnimal"),

    /**
     * Collision of vehicle with an object of a stationary nature.
     * 
     */
    @XmlEnumValue("collisionWithObstacle")
    COLLISION_WITH_OBSTACLE("collisionWithObstacle"),

    /**
     * Collision of vehicle with one or more pedestrians.
     * 
     */
    @XmlEnumValue("collisionWithPerson")
    COLLISION_WITH_PERSON("collisionWithPerson"),

    /**
     * Collision of vehicle with another vehicle head on.
     * 
     */
    @XmlEnumValue("headOnCollision")
    HEAD_ON_COLLISION("headOnCollision"),

    /**
     * Collision of vehicle with another vehicle either head on or sideways.
     *           
     * 
     */
    @XmlEnumValue("headOnOrSideCollision")
    HEAD_ON_OR_SIDE_COLLISION("headOnOrSideCollision"),

    /**
     * Collision involving multiple vehicles
     * 
     */
    @XmlEnumValue("multipleVehicleCollision")
    MULTIPLE_VEHICLE_COLLISION("multipleVehicleCollision"),

    /**
     * Includes all accidents where one or more vehicles have collided with the rear of
     *             one or more other vehicles.
     *           
     * 
     */
    @XmlEnumValue("rearCollision")
    REAR_COLLISION("rearCollision"),

    /**
     * Includes all accidents where one or more vehicles have collided with the side of
     *             one or more other vehicles.
     *           
     * 
     */
    @XmlEnumValue("sideCollision")
    SIDE_COLLISION("sideCollision"),
    @XmlEnumValue("_extended")
    EXTENDED("_extended");
    private final String value;

    CollisionTypeEnum2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CollisionTypeEnum2 fromValue(String v) {
        for (CollisionTypeEnum2 c: CollisionTypeEnum2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
