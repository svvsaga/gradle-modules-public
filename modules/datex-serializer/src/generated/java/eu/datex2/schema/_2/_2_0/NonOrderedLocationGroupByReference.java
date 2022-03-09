
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocationGroupByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocationGroupByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonOrderedLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference"/&gt;
 *         &lt;element name="nonOrderedLocationGroupByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocationGroupByReference", propOrder = {
    "predefinedNonOrderedLocationGroupReference",
    "nonOrderedLocationGroupByReferenceExtension"
})
public class NonOrderedLocationGroupByReference
    extends NonOrderedLocations
{

    @XmlElement(required = true)
    protected _PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    protected _ExtensionType nonOrderedLocationGroupByReferenceExtension;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link _PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public _PredefinedNonOrderedLocationGroupVersionedReference getPredefinedNonOrderedLocationGroupReference() {
        return predefinedNonOrderedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupReference(_PredefinedNonOrderedLocationGroupVersionedReference value) {
        this.predefinedNonOrderedLocationGroupReference = value;
    }

    /**
     * Gets the value of the nonOrderedLocationGroupByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getNonOrderedLocationGroupByReferenceExtension() {
        return nonOrderedLocationGroupByReferenceExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationGroupByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setNonOrderedLocationGroupByReferenceExtension(_ExtensionType value) {
        this.nonOrderedLocationGroupByReferenceExtension = value;
    }

}
