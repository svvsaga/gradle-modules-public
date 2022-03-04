
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.GlobalReference;
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
    "situationRecordReferenceExtension"
})
public class SituationRecordReference
    extends GlobalReference
{

    @XmlElement(required = true)
    protected SituationRecordVersionedReference objectReference;
    @XmlElement(name = "_situationRecordReferenceExtension")
    protected ExtensionType situationRecordReferenceExtension;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRecordVersionedReference }
     *     
     */
    public SituationRecordVersionedReference getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRecordVersionedReference }
     *     
     */
    public void setObjectReference(SituationRecordVersionedReference value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the situationRecordReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationRecordReferenceExtension() {
        return situationRecordReferenceExtension;
    }

    /**
     * Sets the value of the situationRecordReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationRecordReferenceExtension(ExtensionType value) {
        this.situationRecordReferenceExtension = value;
    }

}
