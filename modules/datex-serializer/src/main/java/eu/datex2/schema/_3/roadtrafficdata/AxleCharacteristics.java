
package eu.datex2.schema._3.roadtrafficdata;

import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Characteristics of vehicle axles
 * 
 * <p>Java class for AxleCharacteristics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxleCharacteristics"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maximumWeight" type="{http://datex2.eu/schema/3/common}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="minimumWeight" type="{http://datex2.eu/schema/3/common}Tonnes" minOccurs="0"/&gt;
 *         &lt;element name="_axleCharacteristicsExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxleCharacteristics", namespace = "http://datex2.eu/schema/3/roadTrafficData", propOrder = {
    "maximumWeight",
    "minimumWeight",
    "axleCharacteristicsExtension"
})
public class AxleCharacteristics {

    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float maximumWeight;
    @XmlElement(namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected Float minimumWeight;
    @XmlElement(name = "_axleCharacteristicsExtension", namespace = "http://datex2.eu/schema/3/roadTrafficData")
    protected ExtensionType axleCharacteristicsExtension;

    /**
     * Gets the value of the maximumWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumWeight() {
        return maximumWeight;
    }

    /**
     * Sets the value of the maximumWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumWeight(Float value) {
        this.maximumWeight = value;
    }

    /**
     * Gets the value of the minimumWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumWeight() {
        return minimumWeight;
    }

    /**
     * Sets the value of the minimumWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumWeight(Float value) {
        this.minimumWeight = value;
    }

    /**
     * Gets the value of the axleCharacteristicsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAxleCharacteristicsExtension() {
        return axleCharacteristicsExtension;
    }

    /**
     * Sets the value of the axleCharacteristicsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAxleCharacteristicsExtension(ExtensionType value) {
        this.axleCharacteristicsExtension = value;
    }

}
