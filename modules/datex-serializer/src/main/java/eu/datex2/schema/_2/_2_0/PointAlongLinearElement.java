
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PointAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointAlongLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrativeAreaOfPoint" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="directionBoundAtPoint" type="{http://datex2.eu/schema/2/2_0}DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelativeAtPoint" type="{http://datex2.eu/schema/2/2_0}LinearReferencingDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="heightGradeOfPoint" type="{http://datex2.eu/schema/2/2_0}HeightGradeEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/2/2_0}LinearElement"/&gt;
 *         &lt;element name="distanceAlongLinearElement" type="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="pointAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointAlongLinearElement", propOrder = {
    "administrativeAreaOfPoint",
    "directionBoundAtPoint",
    "directionRelativeAtPoint",
    "heightGradeOfPoint",
    "linearElement",
    "distanceAlongLinearElement",
    "pointAlongLinearElementExtension"
})
public class PointAlongLinearElement {

    protected MultilingualString administrativeAreaOfPoint;
    @XmlSchemaType(name = "string")
    protected DirectionEnum directionBoundAtPoint;
    @XmlSchemaType(name = "string")
    protected LinearReferencingDirectionEnum directionRelativeAtPoint;
    @XmlSchemaType(name = "string")
    protected HeightGradeEnum heightGradeOfPoint;
    @XmlElement(required = true)
    protected LinearElement linearElement;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement distanceAlongLinearElement;
    protected _ExtensionType pointAlongLinearElementExtension;

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
     * Gets the value of the directionBoundAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionBoundAtPoint() {
        return directionBoundAtPoint;
    }

    /**
     * Sets the value of the directionBoundAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionBoundAtPoint(DirectionEnum value) {
        this.directionBoundAtPoint = value;
    }

    /**
     * Gets the value of the directionRelativeAtPoint property.
     * 
     * @return
     *     possible object is
     *     {@link LinearReferencingDirectionEnum }
     *     
     */
    public LinearReferencingDirectionEnum getDirectionRelativeAtPoint() {
        return directionRelativeAtPoint;
    }

    /**
     * Sets the value of the directionRelativeAtPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearReferencingDirectionEnum }
     *     
     */
    public void setDirectionRelativeAtPoint(LinearReferencingDirectionEnum value) {
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
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPointAlongLinearElementExtension() {
        return pointAlongLinearElementExtension;
    }

    /**
     * Sets the value of the pointAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPointAlongLinearElementExtension(_ExtensionType value) {
        this.pointAlongLinearElementExtension = value;
    }

}
