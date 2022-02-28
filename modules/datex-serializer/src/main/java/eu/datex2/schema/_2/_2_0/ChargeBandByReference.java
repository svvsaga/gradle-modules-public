
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargeBandByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargeBandByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chargeBandReference" type="{http://datex2.eu/schema/2/2_0}_ChargeBandVersionedReference"/&gt;
 *         &lt;element name="chargeBandByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeBandByReference", propOrder = {
    "chargeBandReference",
    "chargeBandByReferenceExtension"
})
public class ChargeBandByReference {

    @XmlElement(required = true)
    protected _ChargeBandVersionedReference chargeBandReference;
    protected _ExtensionType chargeBandByReferenceExtension;

    /**
     * Gets the value of the chargeBandReference property.
     * 
     * @return
     *     possible object is
     *     {@link _ChargeBandVersionedReference }
     *     
     */
    public _ChargeBandVersionedReference getChargeBandReference() {
        return chargeBandReference;
    }

    /**
     * Sets the value of the chargeBandReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ChargeBandVersionedReference }
     *     
     */
    public void setChargeBandReference(_ChargeBandVersionedReference value) {
        this.chargeBandReference = value;
    }

    /**
     * Gets the value of the chargeBandByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getChargeBandByReferenceExtension() {
        return chargeBandByReferenceExtension;
    }

    /**
     * Sets the value of the chargeBandByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setChargeBandByReferenceExtension(_ExtensionType value) {
        this.chargeBandByReferenceExtension = value;
    }

}
