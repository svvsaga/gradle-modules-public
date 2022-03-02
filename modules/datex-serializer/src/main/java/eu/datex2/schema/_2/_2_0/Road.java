
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Road complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Road"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nameOfRoad" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="roadIdentifier" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="typeOfRoad" type="{http://datex2.eu/schema/2/2_0}RoadTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="roadDestination" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="roadOrigination" type="{http://datex2.eu/schema/2/2_0}MultilingualString" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="distanceToThisRoad" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="roadExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Road", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "nameOfRoad",
    "roadIdentifier",
    "typeOfRoad",
    "roadDestination",
    "roadOrigination",
    "distanceToThisRoad",
    "roadExtension"
})
@XmlSeeAlso({
    RoadNode.class
})
public class Road {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString nameOfRoad;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected MultilingualString roadIdentifier;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected RoadTypeEnum typeOfRoad;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<MultilingualString> roadDestination;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected List<MultilingualString> roadOrigination;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger distanceToThisRoad;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType roadExtension;

    /**
     * Gets the value of the nameOfRoad property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getNameOfRoad() {
        return nameOfRoad;
    }

    /**
     * Sets the value of the nameOfRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setNameOfRoad(MultilingualString value) {
        this.nameOfRoad = value;
    }

    /**
     * Gets the value of the roadIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getRoadIdentifier() {
        return roadIdentifier;
    }

    /**
     * Sets the value of the roadIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setRoadIdentifier(MultilingualString value) {
        this.roadIdentifier = value;
    }

    /**
     * Gets the value of the typeOfRoad property.
     * 
     * @return
     *     possible object is
     *     {@link RoadTypeEnum }
     *     
     */
    public RoadTypeEnum getTypeOfRoad() {
        return typeOfRoad;
    }

    /**
     * Sets the value of the typeOfRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadTypeEnum }
     *     
     */
    public void setTypeOfRoad(RoadTypeEnum value) {
        this.typeOfRoad = value;
    }

    /**
     * Gets the value of the roadDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getRoadDestination() {
        if (roadDestination == null) {
            roadDestination = new ArrayList<MultilingualString>();
        }
        return this.roadDestination;
    }

    /**
     * Gets the value of the roadOrigination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the roadOrigination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoadOrigination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultilingualString }
     * 
     * 
     */
    public List<MultilingualString> getRoadOrigination() {
        if (roadOrigination == null) {
            roadOrigination = new ArrayList<MultilingualString>();
        }
        return this.roadOrigination;
    }

    /**
     * Gets the value of the distanceToThisRoad property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistanceToThisRoad() {
        return distanceToThisRoad;
    }

    /**
     * Sets the value of the distanceToThisRoad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistanceToThisRoad(BigInteger value) {
        this.distanceToThisRoad = value;
    }

    /**
     * Gets the value of the roadExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadExtension() {
        return roadExtension;
    }

    /**
     * Sets the value of the roadExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadExtension(ExtensionType value) {
        this.roadExtension = value;
    }

}
