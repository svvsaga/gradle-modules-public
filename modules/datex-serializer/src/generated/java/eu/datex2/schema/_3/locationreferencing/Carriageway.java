
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
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
    "_CarriagewayExtension"
})
public class Carriageway {

    @XmlElement(required = true)
    protected _CarriagewayEnum carriageway;
    protected BigInteger originalNumberOfLanes;
    protected List<Lane> lane;
    @XmlElement(name = "_carriagewayExtension")
    protected _ExtensionType _CarriagewayExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * @return
     *     possible object is
     *     {@link _CarriagewayEnum }
     *     
     */
    public _CarriagewayEnum getCarriageway() {
        return carriageway;
    }

    /**
     * Sets the value of the carriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CarriagewayEnum }
     *     
     */
    public void setCarriageway(_CarriagewayEnum value) {
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
     * Gets the value of the _CarriagewayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CarriagewayExtension() {
        return _CarriagewayExtension;
    }

    /**
     * Sets the value of the _CarriagewayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CarriagewayExtension(_ExtensionType value) {
        this._CarriagewayExtension = value;
    }

}
