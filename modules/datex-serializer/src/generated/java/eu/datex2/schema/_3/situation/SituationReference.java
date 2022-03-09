
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.GlobalReference;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}GlobalReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectReference" type="{http://datex2.eu/schema/3/situation}_SituationVersionedReference"/&gt;
 *         &lt;element name="_situationReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationReference", propOrder = {
    "objectReference",
    "_SituationReferenceExtension"
})
public class SituationReference
    extends GlobalReference
{

    @XmlElement(required = true)
    protected _SituationVersionedReference objectReference;
    @XmlElement(name = "_situationReferenceExtension")
    protected _ExtensionType _SituationReferenceExtension;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link _SituationVersionedReference }
     *     
     */
    public _SituationVersionedReference getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SituationVersionedReference }
     *     
     */
    public void setObjectReference(_SituationVersionedReference value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the _SituationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SituationReferenceExtension() {
        return _SituationReferenceExtension;
    }

    /**
     * Sets the value of the _SituationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SituationReferenceExtension(_ExtensionType value) {
        this._SituationReferenceExtension = value;
    }

}
