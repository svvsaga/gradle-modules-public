
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GroupOfLocations"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nonOrderedLocationsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocations", propOrder = {
    "nonOrderedLocationsExtension"
})
@XmlSeeAlso({
    NonOrderedLocationGroupByList.class,
    NonOrderedLocationGroupByReference.class
})
public abstract class NonOrderedLocations
    extends GroupOfLocations
{

    protected _ExtensionType nonOrderedLocationsExtension;

    /**
     * Gets the value of the nonOrderedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getNonOrderedLocationsExtension() {
        return nonOrderedLocationsExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setNonOrderedLocationsExtension(_ExtensionType value) {
        this.nonOrderedLocationsExtension = value;
    }

}
