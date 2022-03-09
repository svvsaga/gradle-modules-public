
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericSituationRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericSituationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericSituationRecordName" type="{http://datex2.eu/schema/2/2_0}String"/&gt;
 *         &lt;element name="genericSituationRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericSituationRecord", propOrder = {
    "genericSituationRecordName",
    "genericSituationRecordExtension"
})
public abstract class GenericSituationRecord
    extends SituationRecord
{

    @XmlElement(required = true)
    protected String genericSituationRecordName;
    protected _ExtensionType genericSituationRecordExtension;

    /**
     * Gets the value of the genericSituationRecordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericSituationRecordName() {
        return genericSituationRecordName;
    }

    /**
     * Sets the value of the genericSituationRecordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericSituationRecordName(String value) {
        this.genericSituationRecordName = value;
    }

    /**
     * Gets the value of the genericSituationRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getGenericSituationRecordExtension() {
        return genericSituationRecordExtension;
    }

    /**
     * Sets the value of the genericSituationRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setGenericSituationRecordExtension(_ExtensionType value) {
        this.genericSituationRecordExtension = value;
    }

}
