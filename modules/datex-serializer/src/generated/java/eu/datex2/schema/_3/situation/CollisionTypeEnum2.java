
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

    @XmlEnumValue("collisionWithAnimal")
    COLLISION_WITH_ANIMAL("collisionWithAnimal"),
    @XmlEnumValue("collisionWithObstacle")
    COLLISION_WITH_OBSTACLE("collisionWithObstacle"),
    @XmlEnumValue("collisionWithPerson")
    COLLISION_WITH_PERSON("collisionWithPerson"),
    @XmlEnumValue("headOnCollision")
    HEAD_ON_COLLISION("headOnCollision"),
    @XmlEnumValue("headOnOrSideCollision")
    HEAD_ON_OR_SIDE_COLLISION("headOnOrSideCollision"),
    @XmlEnumValue("multipleVehicleCollision")
    MULTIPLE_VEHICLE_COLLISION("multipleVehicleCollision"),
    @XmlEnumValue("rearCollision")
    REAR_COLLISION("rearCollision"),
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
