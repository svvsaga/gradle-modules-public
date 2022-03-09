
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.GlobalReference;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituationRecordReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationRecordReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}GlobalReference"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objectReference" type="{http://datex2.eu/schema/3/situation}_SituationRecordVersionedReference"/&gt;
 *         &lt;element name="_situationRecordReferenceExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationRecordReference", propOrder = {
    "objectReference",
    "_SituationRecordReferenceExtension"
})
public class SituationRecordReference
    extends GlobalReference
{

    @XmlElement(required = true)
    protected _SituationRecordVersionedReference objectReference;
    @XmlElement(name = "_situationRecordReferenceExtension")
    protected _ExtensionType _SituationRecordReferenceExtension;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link _SituationRecordVersionedReference }
     *     
     */
    public _SituationRecordVersionedReference getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _SituationRecordVersionedReference }
     *     
     */
    public void setObjectReference(_SituationRecordVersionedReference value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the _SituationRecordReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SituationRecordReferenceExtension() {
        return _SituationRecordReferenceExtension;
    }

    /**
     * Sets the value of the _SituationRecordReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SituationRecordReferenceExtension(_ExtensionType value) {
        this._SituationRecordReferenceExtension = value;
    }

}
