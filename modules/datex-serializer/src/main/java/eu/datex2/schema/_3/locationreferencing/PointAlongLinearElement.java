
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A point on a linear element where the linear element is either a part of or the whole of a
 *         linear object (i.e. a road), consistent with EN ISO 19148 definitions.
 *       
 * 
 * <p>Java class for PointAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrativeAreaOfPoint" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="directionAtPoint" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelativeAtPoint" type="{http://datex2.eu/schema/3/locationReferencing}_LinearDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="heightGradeOfPoint" type="{http://datex2.eu/schema/3/locationReferencing}_HeightGradeEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/3/locationReferencing}LinearElement"/&gt;
 *         &lt;element name="distanceAlongLinearElement" type="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="_pointAlongLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointAlongLinearElement", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "administrativeAreaOfPoint",
    "directionAtPoint",
    "directionRelativeAtPoint",
    "heightGradeOfPoint",
    "linearElement",
    "distanceAlongLinearElement",
    "pointAlongLinearElementExtension"
})
public class PointAlongLinearElement {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected MultilingualString administrativeAreaOfPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected DirectionEnum directionAtPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected LinearDirectionEnum directionRelativeAtPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected HeightGradeEnum heightGradeOfPoint;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected LinearElement linearElement;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing", required = true)
    protected DistanceAlongLinearElement distanceAlongLinearElement;
    @XmlElement(name = "_pointAlongLinearElementExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType pointAlongLinearElementExtension;

    /**
     * Gets the value of the administrativeAreaOfPoint property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeAreaOfPoint() {
        return administrativeAreaOfPoint;
    }

    /**
     * Sets the value of the administrativeAreaOfPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeAreaOfPoint(MultilingualString value) {
        this.administrativeAreaOfPoint = value;
    }

    /**
     * Gets the value of the directionAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionAtPoint() {
        return directionAtPoint;
    }

    /**
     * Sets the value of the directionAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionAtPoint(DirectionEnum value) {
        this.directionAtPoint = value;
    }

    /**
     * Gets the value of the directionRelativeAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LinearDirectionEnum }
     *     
     */
    public LinearDirectionEnum getDirectionRelativeAtPoint() {
        return directionRelativeAtPoint;
    }

    /**
     * Sets the value of the directionRelativeAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearDirectionEnum }
     *     
     */
    public void setDirectionRelativeAtPoint(LinearDirectionEnum value) {
        this.directionRelativeAtPoint = value;
    }

    /**
     * Gets the value of the heightGradeOfPoint property.
     * 
     * @return
     *     possible object is
     *     {@link HeightGradeEnum }
     *     
     */
    public HeightGradeEnum getHeightGradeOfPoint() {
        return heightGradeOfPoint;
    }

    /**
     * Sets the value of the heightGradeOfPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightGradeEnum }
     *     
     */
    public void setHeightGradeOfPoint(HeightGradeEnum value) {
        this.heightGradeOfPoint = value;
    }

    /**
     * Gets the value of the linearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearElement }
     *     
     */
    public LinearElement getLinearElement() {
        return linearElement;
    }

    /**
     * Sets the value of the linearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearElement }
     *     
     */
    public void setLinearElement(LinearElement value) {
        this.linearElement = value;
    }

    /**
     * Gets the value of the distanceAlongLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getDistanceAlongLinearElement() {
        return distanceAlongLinearElement;
    }

    /**
     * Sets the value of the distanceAlongLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setDistanceAlongLinearElement(DistanceAlongLinearElement value) {
        this.distanceAlongLinearElement = value;
    }

    /**
     * Gets the value of the pointAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPointAlongLinearElementExtension() {
        return pointAlongLinearElementExtension;
    }

    /**
     * Sets the value of the pointAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPointAlongLinearElementExtension(ExtensionType value) {
        this.pointAlongLinearElementExtension = value;
    }

}
