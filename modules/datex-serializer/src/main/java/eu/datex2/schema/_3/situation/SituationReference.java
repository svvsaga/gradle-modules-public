
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.GlobalReference;
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
    "situationReferenceExtension"
})
public class SituationReference
    extends GlobalReference
{

    @XmlElement(required = true)
    protected SituationVersionedReference objectReference;
    @XmlElement(name = "_situationReferenceExtension")
    protected ExtensionType situationReferenceExtension;

    /**
     * Gets the value of the objectReference property.
     * 
     * @return
     *     possible object is
     *     {@link SituationVersionedReference }
     *     
     */
    public SituationVersionedReference getObjectReference() {
        return objectReference;
    }

    /**
     * Sets the value of the objectReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationVersionedReference }
     *     
     */
    public void setObjectReference(SituationVersionedReference value) {
        this.objectReference = value;
    }

    /**
     * Gets the value of the situationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSituationReferenceExtension() {
        return situationReferenceExtension;
    }

    /**
     * Sets the value of the situationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSituationReferenceExtension(ExtensionType value) {
        this.situationReferenceExtension = value;
    }

}
