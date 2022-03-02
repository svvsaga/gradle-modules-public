
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A two-dimensional part of the surface of the earth which is bounded by a closed curve. An
 *         area location may cover parts of the road network but does not necessarily need to. It is represented
 *         according to the OpenLR standard for Area Locations
 *       
 * 
 * <p>Java class for OpenlrAreaLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrAreaLocationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_openlrAreaLocationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrAreaLocationReference", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "openlrAreaLocationReferenceExtension"
})
@XmlSeeAlso({
    OpenlrCircleLocationReference.class,
    OpenlrClosedLineLocationReference.class,
    OpenlrGridLocationReference.class,
    OpenlrPolygonLocationReference.class,
    OpenlrRectangleLocationReference.class
})
public abstract class OpenlrAreaLocationReference {

    @XmlElement(name = "_openlrAreaLocationReferenceExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType openlrAreaLocationReferenceExtension;

    /**
     * Gets the value of the openlrAreaLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrAreaLocationReferenceExtension() {
        return openlrAreaLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrAreaLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrAreaLocationReferenceExtension(ExtensionType value) {
        this.openlrAreaLocationReferenceExtension = value;
    }

}
