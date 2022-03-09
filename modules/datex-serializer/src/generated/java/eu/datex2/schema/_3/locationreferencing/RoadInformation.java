
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadDestination" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="roadName" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/3/common}String" minOccurs="0"/&gt;
 *         &lt;element name="_roadInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadInformation", propOrder = {
    "roadDestination",
    "roadName",
    "roadNumber",
    "_RoadInformationExtension"
})
public class RoadInformation {

    protected String roadDestination;
    protected String roadName;
    protected String roadNumber;
    @XmlElement(name = "_roadInformationExtension")
    protected _ExtensionType _RoadInformationExtension;

    /**
     * Gets the value of the roadDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadDestination() {
        return roadDestination;
    }

    /**
     * Sets the value of the roadDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadDestination(String value) {
        this.roadDestination = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the _RoadInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RoadInformationExtension() {
        return _RoadInformationExtension;
    }

    /**
     * Sets the value of the _RoadInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RoadInformationExtension(_ExtensionType value) {
        this._RoadInformationExtension = value;
    }

}
