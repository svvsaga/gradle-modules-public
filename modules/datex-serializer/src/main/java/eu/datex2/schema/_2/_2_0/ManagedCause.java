
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedCause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCause"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Cause"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="managedCause" type="{http://datex2.eu/schema/2/2_0}_SituationRecordVersionedReference" minOccurs="0"/&gt;
 *         &lt;element name="managedCauseExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCause", propOrder = {
    "managedCause",
    "managedCauseExtension"
})
public class ManagedCause
    extends Cause
{

    protected _SituationRecordVersionedReference managedCause;
    protected _ExtensionType managedCauseExtension;

    /**
     * Gets the value of the managedCause property.
     * 
     * @return
     *     possible object is
     *     {@link _SituationRecordVersionedReference }
     *     
     */
    public _SituationRecordVersionedReference getManagedCause() {
        return managedCause;
    }

    /**
     * Sets the value of the managedCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SituationRecordVersionedReference }
     *     
     */
    public void setManagedCause(_SituationRecordVersionedReference value) {
        this.managedCause = value;
    }

    /**
     * Gets the value of the managedCauseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getManagedCauseExtension() {
        return managedCauseExtension;
    }

    /**
     * Sets the value of the managedCauseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setManagedCauseExtension(_ExtensionType value) {
        this.managedCauseExtension = value;
    }

}
