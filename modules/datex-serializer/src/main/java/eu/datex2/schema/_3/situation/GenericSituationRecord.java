
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A generic SituationRecord for use when adding level B extensions at the SituationRecord
 *         level.
 *       
 * 
 * <p>Java class for GenericSituationRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericSituationRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}SituationRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericSituationRecordName" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="_genericSituationRecordExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
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
    "_GenericSituationRecordExtension"
})
public class GenericSituationRecord
    extends SituationRecord
{

    @XmlElement(required = true)
    protected String genericSituationRecordName;
    @XmlElement(name = "_genericSituationRecordExtension")
    protected _ExtensionType _GenericSituationRecordExtension;

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
     * Gets the value of the _GenericSituationRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_GenericSituationRecordExtension() {
        return _GenericSituationRecordExtension;
    }

    /**
     * Sets the value of the _GenericSituationRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_GenericSituationRecordExtension(_ExtensionType value) {
        this._GenericSituationRecordExtension = value;
    }

}
