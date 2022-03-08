
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.MultilingualString;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearWithinLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearWithinLinearElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="administrativeAreaOfLinearSection" type="{http://datex2.eu/schema/3/common}MultilingualString" minOccurs="0"/&gt;
 *         &lt;element name="directionOnLinearSection" type="{http://datex2.eu/schema/3/locationReferencing}_DirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="directionRelativeOnLinearSection" type="{http://datex2.eu/schema/3/locationReferencing}_LinearDirectionEnum" minOccurs="0"/&gt;
 *         &lt;element name="heightGradeOfLinearSection" type="{http://datex2.eu/schema/3/locationReferencing}_HeightGradeEnum" minOccurs="0"/&gt;
 *         &lt;element name="linearElement" type="{http://datex2.eu/schema/3/locationReferencing}LinearElement"/&gt;
 *         &lt;element name="fromPoint" type="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="toPoint" type="{http://datex2.eu/schema/3/locationReferencing}DistanceAlongLinearElement"/&gt;
 *         &lt;element name="_linearWithinLinearElementExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearWithinLinearElement", propOrder = {
    "administrativeAreaOfLinearSection",
    "directionOnLinearSection",
    "directionRelativeOnLinearSection",
    "heightGradeOfLinearSection",
    "linearElement",
    "fromPoint",
    "toPoint",
    "linearWithinLinearElementExtension"
})
public class LinearWithinLinearElement {

    protected MultilingualString administrativeAreaOfLinearSection;
    protected DirectionEnum directionOnLinearSection;
    protected LinearDirectionEnum directionRelativeOnLinearSection;
    protected HeightGradeEnum heightGradeOfLinearSection;
    @XmlElement(required = true)
    protected LinearElement linearElement;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement fromPoint;
    @XmlElement(required = true)
    protected DistanceAlongLinearElement toPoint;
    @XmlElement(name = "_linearWithinLinearElementExtension")
    protected ExtensionType linearWithinLinearElementExtension;

    /**
     * Gets the value of the administrativeAreaOfLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getAdministrativeAreaOfLinearSection() {
        return administrativeAreaOfLinearSection;
    }

    /**
     * Sets the value of the administrativeAreaOfLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setAdministrativeAreaOfLinearSection(MultilingualString value) {
        this.administrativeAreaOfLinearSection = value;
    }

    /**
     * Gets the value of the directionOnLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getDirectionOnLinearSection() {
        return directionOnLinearSection;
    }

    /**
     * Sets the value of the directionOnLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setDirectionOnLinearSection(DirectionEnum value) {
        this.directionOnLinearSection = value;
    }

    /**
     * Gets the value of the directionRelativeOnLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link LinearDirectionEnum }
     *     
     */
    public LinearDirectionEnum getDirectionRelativeOnLinearSection() {
        return directionRelativeOnLinearSection;
    }

    /**
     * Sets the value of the directionRelativeOnLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearDirectionEnum }
     *     
     */
    public void setDirectionRelativeOnLinearSection(LinearDirectionEnum value) {
        this.directionRelativeOnLinearSection = value;
    }

    /**
     * Gets the value of the heightGradeOfLinearSection property.
     * 
     * @return
     *     possible object is
     *     {@link HeightGradeEnum }
     *     
     */
    public HeightGradeEnum getHeightGradeOfLinearSection() {
        return heightGradeOfLinearSection;
    }

    /**
     * Sets the value of the heightGradeOfLinearSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeightGradeEnum }
     *     
     */
    public void setHeightGradeOfLinearSection(HeightGradeEnum value) {
        this.heightGradeOfLinearSection = value;
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
     * Gets the value of the fromPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getFromPoint() {
        return fromPoint;
    }

    /**
     * Sets the value of the fromPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setFromPoint(DistanceAlongLinearElement value) {
        this.fromPoint = value;
    }

    /**
     * Gets the value of the toPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public DistanceAlongLinearElement getToPoint() {
        return toPoint;
    }

    /**
     * Sets the value of the toPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceAlongLinearElement }
     *     
     */
    public void setToPoint(DistanceAlongLinearElement value) {
        this.toPoint = value;
    }

    /**
     * Gets the value of the linearWithinLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearWithinLinearElementExtension() {
        return linearWithinLinearElementExtension;
    }

    /**
     * Sets the value of the linearWithinLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearWithinLinearElementExtension(ExtensionType value) {
        this.linearWithinLinearElementExtension = value;
    }

}
