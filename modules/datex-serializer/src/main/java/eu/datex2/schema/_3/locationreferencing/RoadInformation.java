
package eu.datex2.schema._3.locationreferencing;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information on a road
 * 
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
@XmlType(name = "RoadInformation", namespace = "http://datex2.eu/schema/3/locationReferencing", propOrder = {
    "roadDestination",
    "roadName",
    "roadNumber",
    "roadInformationExtension"
})
public class RoadInformation {

    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected String roadDestination;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected String roadName;
    @XmlElement(namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected String roadNumber;
    @XmlElement(name = "_roadInformationExtension", namespace = "http://datex2.eu/schema/3/locationReferencing")
    protected ExtensionType roadInformationExtension;

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
     * Gets the value of the roadInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadInformationExtension() {
        return roadInformationExtension;
    }

    /**
     * Sets the value of the roadInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadInformationExtension(ExtensionType value) {
        this.roadInformationExtension = value;
    }

}
