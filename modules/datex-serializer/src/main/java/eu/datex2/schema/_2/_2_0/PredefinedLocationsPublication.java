
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
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
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation"/&gt;
 *         &lt;element name="predefinedLocationContainer" type="{http://datex2.eu/schema/2/2_0}PredefinedLocationContainer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="predefinedLocationsPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
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
    "predefinedLocationContainer",
    "predefinedLocationsPublicationExtension"
})
public class PredefinedLocationsPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<PredefinedLocationContainer> predefinedLocationContainer;
    protected _ExtensionType predefinedLocationsPublicationExtension;

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
     * Gets the value of the predefinedLocationContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the predefinedLocationContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredefinedLocationContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredefinedLocationContainer }
     * 
     * 
     */
    public List<PredefinedLocationContainer> getPredefinedLocationContainer() {
        if (predefinedLocationContainer == null) {
            predefinedLocationContainer = new ArrayList<PredefinedLocationContainer>();
        }
        return this.predefinedLocationContainer;
    }

    /**
     * Gets the value of the predefinedLocationsPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getPredefinedLocationsPublicationExtension() {
        return predefinedLocationsPublicationExtension;
    }

    /**
     * Sets the value of the predefinedLocationsPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setPredefinedLocationsPublicationExtension(_ExtensionType value) {
        this.predefinedLocationsPublicationExtension = value;
    }

}
