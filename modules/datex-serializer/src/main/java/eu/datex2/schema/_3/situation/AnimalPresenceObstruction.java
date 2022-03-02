
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An obstruction on the road resulting from the presence of animals.
 * 
 * <p>Java class for AnimalPresenceObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnimalPresenceObstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Obstruction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alive" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="animalPresenceType" type="{http://datex2.eu/schema/3/situation}_AnimalPresenceTypeEnum"/&gt;
 *         &lt;element name="_animalPresenceObstructionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnimalPresenceObstruction", propOrder = {
    "alive",
    "animalPresenceType",
    "animalPresenceObstructionExtension"
})
public class AnimalPresenceObstruction
    extends Obstruction
{

    protected Boolean alive;
    @XmlElement(required = true)
    protected AnimalPresenceTypeEnum animalPresenceType;
    @XmlElement(name = "_animalPresenceObstructionExtension")
    protected ExtensionType animalPresenceObstructionExtension;

    /**
     * Gets the value of the alive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAlive() {
        return alive;
    }

    /**
     * Sets the value of the alive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAlive(Boolean value) {
        this.alive = value;
    }

    /**
     * Gets the value of the animalPresenceType property.
     * 
     * @return
     *     possible object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public AnimalPresenceTypeEnum getAnimalPresenceType() {
        return animalPresenceType;
    }

    /**
     * Sets the value of the animalPresenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnimalPresenceTypeEnum }
     *     
     */
    public void setAnimalPresenceType(AnimalPresenceTypeEnum value) {
        this.animalPresenceType = value;
    }

    /**
     * Gets the value of the animalPresenceObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAnimalPresenceObstructionExtension() {
        return animalPresenceObstructionExtension;
    }

    /**
     * Sets the value of the animalPresenceObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAnimalPresenceObstructionExtension(ExtensionType value) {
        this.animalPresenceObstructionExtension = value;
    }

}
