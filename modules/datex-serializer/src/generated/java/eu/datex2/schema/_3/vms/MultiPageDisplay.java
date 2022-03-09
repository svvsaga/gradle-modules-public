
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultiPageDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultiPageDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}DisplayAreaSettings"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceGroupNumber" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="displayAreaSettings" type="{http://datex2.eu/schema/3/vms}_MultiPageDisplayPageNumberDisplayAreaSettings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_multiPageDisplayExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiPageDisplay", propOrder = {
    "sequenceGroupNumber",
    "displayAreaSettings",
    "_MultiPageDisplayExtension"
})
public class MultiPageDisplay
    extends DisplayAreaSettings
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sequenceGroupNumber;
    protected List<_MultiPageDisplayPageNumberDisplayAreaSettings> displayAreaSettings;
    @XmlElement(name = "_multiPageDisplayExtension")
    protected _ExtensionType _MultiPageDisplayExtension;

    /**
     * Gets the value of the sequenceGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceGroupNumber() {
        return sequenceGroupNumber;
    }

    /**
     * Sets the value of the sequenceGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceGroupNumber(BigInteger value) {
        this.sequenceGroupNumber = value;
    }

    /**
     * Gets the value of the displayAreaSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the displayAreaSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayAreaSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _MultiPageDisplayPageNumberDisplayAreaSettings }
     * 
     * 
     */
    public List<_MultiPageDisplayPageNumberDisplayAreaSettings> getDisplayAreaSettings() {
        if (displayAreaSettings == null) {
            displayAreaSettings = new ArrayList<_MultiPageDisplayPageNumberDisplayAreaSettings>();
        }
        return this.displayAreaSettings;
    }

    /**
     * Gets the value of the _MultiPageDisplayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_MultiPageDisplayExtension() {
        return _MultiPageDisplayExtension;
    }

    /**
     * Sets the value of the _MultiPageDisplayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_MultiPageDisplayExtension(_ExtensionType value) {
        this._MultiPageDisplayExtension = value;
    }

}
