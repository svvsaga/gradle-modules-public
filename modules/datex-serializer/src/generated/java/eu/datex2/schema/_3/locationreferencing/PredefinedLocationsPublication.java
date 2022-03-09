
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.HeaderInformation;
import eu.datex2.schema._3.common.PayloadPublication;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PredefinedLocationsPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PredefinedLocationsPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/3/common}HeaderInformation"/&gt;
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/3/locationReferencing}PredefinedLocationReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_predefinedLocationsPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedLocationsPublication", propOrder = {
    "headerInformation",
    "predefinedLocationReference",
    "_PredefinedLocationsPublicationExtension"
})
public class PredefinedLocationsPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<PredefinedLocationReference> predefinedLocationReference;
    @XmlElement(name = "_predefinedLocationsPublicationExtension")
    protected _ExtensionType _PredefinedLocationsPublicationExtension;

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the predefinedLocationReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocationReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocationReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocationReference }
     * 
     * 
     */
    public List<PredefinedLocationReference> getPredefinedLocationReference() {
        if (predefinedLocationReference == null) {
            predefinedLocationReference = new ArrayList<PredefinedLocationReference>();
        }
        return this.predefinedLocationReference;
    }

    /**
     * Gets the value of the _PredefinedLocationsPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_PredefinedLocationsPublicationExtension() {
        return _PredefinedLocationsPublicationExtension;
    }

    /**
     * Sets the value of the _PredefinedLocationsPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_PredefinedLocationsPublicationExtension(_ExtensionType value) {
        this._PredefinedLocationsPublicationExtension = value;
    }

}
