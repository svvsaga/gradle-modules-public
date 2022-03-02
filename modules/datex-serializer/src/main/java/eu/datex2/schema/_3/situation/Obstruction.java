
package eu.datex2.schema._3.situation;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any stationary or moving obstacle of a physical nature (e.g. obstacles or vehicles from an
 *         earlier accident, shed loads on carriageway, rock fall, abnormal or dangerous loads, or animals etc.)
 *         which could disrupt or endanger traffic.
 *       
 * 
 * <p>Java class for Obstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Obstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}TrafficElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfObstructions" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="mobilityOfObstruction" type="{http://datex2.eu/schema/3/situation}Mobility" minOccurs="0"/&gt;
 *         &lt;element name="_obstructionExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obstruction", namespace = "http://datex2.eu/schema/3/situation", propOrder = {
    "numberOfObstructions",
    "mobilityOfObstruction",
    "obstructionExtension"
})
@XmlSeeAlso({
    AnimalPresenceObstruction.class,
    EnvironmentalObstruction.class,
    GeneralObstruction.class,
    InfrastructureDamageObstruction.class,
    VehicleObstruction.class
})
public abstract class Obstruction
    extends TrafficElement
{

    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfObstructions;
    @XmlElement(namespace = "http://datex2.eu/schema/3/situation")
    protected Mobility mobilityOfObstruction;
    @XmlElement(name = "_obstructionExtension", namespace = "http://datex2.eu/schema/3/situation")
    protected ExtensionType obstructionExtension;

    /**
     * Gets the value of the numberOfObstructions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfObstructions() {
        return numberOfObstructions;
    }

    /**
     * Sets the value of the numberOfObstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfObstructions(BigInteger value) {
        this.numberOfObstructions = value;
    }

    /**
     * Gets the value of the mobilityOfObstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobilityOfObstruction() {
        return mobilityOfObstruction;
    }

    /**
     * Sets the value of the mobilityOfObstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobilityOfObstruction(Mobility value) {
        this.mobilityOfObstruction = value;
    }

    /**
     * Gets the value of the obstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getObstructionExtension() {
        return obstructionExtension;
    }

    /**
     * Sets the value of the obstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setObstructionExtension(ExtensionType value) {
        this.obstructionExtension = value;
    }

}
