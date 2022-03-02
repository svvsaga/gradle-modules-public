
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Supplementary positional information which details carriageway and lane locations. Several
 *         instances may exist where the element being described extends over more than one carriageway.
 *       
 * 
 * <p>Java class for Carriageway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Carriageway"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/3/locationReferencing}_CarriagewayEnum"/&gt;
 *         &lt;element name="originalNumberOfLanes" type="{http://datex2.eu/schema/3/common}Integer" minOccurs="0"/&gt;
 *         &lt;element name="lane" type="{http://datex2.eu/schema/3/locationReferencing}Lane" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_carriagewayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carriageway", propOrder = {
    "carriageway",
    "originalNumberOfLanes",
    "lane",
    "carriagewayExtension"
})
public class Carriageway {

    @XmlElement(required = true)
    protected CarriagewayEnum carriageway;
    protected BigInteger originalNumberOfLanes;
    protected List<Lane> lane;
    @XmlElement(name = "_carriagewayExtension")
    protected ExtensionType carriagewayExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * @return
     *     possible object is
     *     {@link CarriagewayEnum }
     *     
     */
    public CarriagewayEnum getCarriageway() {
        return carriageway;
    }

    /**
     * Sets the value of the carriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarriagewayEnum }
     *     
     */
    public void setCarriageway(CarriagewayEnum value) {
        this.carriageway = value;
    }

    /**
     * Gets the value of the originalNumberOfLanes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginalNumberOfLanes() {
        return originalNumberOfLanes;
    }

    /**
     * Sets the value of the originalNumberOfLanes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginalNumberOfLanes(BigInteger value) {
        this.originalNumberOfLanes = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Lane }
     * 
     * 
     */
    public List<Lane> getLane() {
        if (lane == null) {
            lane = new ArrayList<Lane>();
        }
        return this.lane;
    }

    /**
     * Gets the value of the carriagewayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCarriagewayExtension() {
        return carriagewayExtension;
    }

    /**
     * Sets the value of the carriagewayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCarriagewayExtension(ExtensionType value) {
        this.carriagewayExtension = value;
    }

}
