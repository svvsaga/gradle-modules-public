
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedManagement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="speedManagementType" type="{http://datex2.eu/schema/2/2_0}SpeedManagementTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="temporarySpeedLimit" type="{http://datex2.eu/schema/2/2_0}KilometresPerHour" minOccurs="0"/&gt;
 *         &lt;element name="speedManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedManagement", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "speedManagementType",
    "temporarySpeedLimit",
    "speedManagementExtension"
})
public class SpeedManagement
    extends NetworkManagement
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected SpeedManagementTypeEnum speedManagementType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected Float temporarySpeedLimit;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType speedManagementExtension;

    /**
     * Gets the value of the speedManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public SpeedManagementTypeEnum getSpeedManagementType() {
        return speedManagementType;
    }

    /**
     * Sets the value of the speedManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedManagementTypeEnum }
     *     
     */
    public void setSpeedManagementType(SpeedManagementTypeEnum value) {
        this.speedManagementType = value;
    }

    /**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTemporarySpeedLimit() {
        return temporarySpeedLimit;
    }

    /**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTemporarySpeedLimit(Float value) {
        this.temporarySpeedLimit = value;
    }

    /**
     * Gets the value of the speedManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedManagementExtension() {
        return speedManagementExtension;
    }

    /**
     * Sets the value of the speedManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedManagementExtension(ExtensionType value) {
        this.speedManagementExtension = value;
    }

}
