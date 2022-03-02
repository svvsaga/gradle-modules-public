
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingUsageScenarioStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingUsageScenarioStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usageScenarioOperationStatus" type="{http://datex2.eu/schema/2/2_0}OperationStatusEnum"/&gt;
 *         &lt;element name="parkingUsageScenarioStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingUsageScenarioStatus", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "usageScenarioOperationStatus",
    "parkingUsageScenarioStatusExtension"
})
public class ParkingUsageScenarioStatus {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    @XmlSchemaType(name = "string")
    protected OperationStatusEnum usageScenarioOperationStatus;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingUsageScenarioStatusExtension;

    /**
     * Gets the value of the usageScenarioOperationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationStatusEnum }
     *     
     */
    public OperationStatusEnum getUsageScenarioOperationStatus() {
        return usageScenarioOperationStatus;
    }

    /**
     * Sets the value of the usageScenarioOperationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationStatusEnum }
     *     
     */
    public void setUsageScenarioOperationStatus(OperationStatusEnum value) {
        this.usageScenarioOperationStatus = value;
    }

    /**
     * Gets the value of the parkingUsageScenarioStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingUsageScenarioStatusExtension() {
        return parkingUsageScenarioStatusExtension;
    }

    /**
     * Sets the value of the parkingUsageScenarioStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingUsageScenarioStatusExtension(ExtensionType value) {
        this.parkingUsageScenarioStatusExtension = value;
    }

}
