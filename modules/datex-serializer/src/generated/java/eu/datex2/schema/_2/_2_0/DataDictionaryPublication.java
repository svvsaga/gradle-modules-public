
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataDictionaryPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDictionaryPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GenericPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataDictionary" type="{http://datex2.eu/schema/2/2_0}DataDictionary" maxOccurs="unbounded"/&gt;
 *         &lt;element name="dataDictionaryPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDictionaryPublication", propOrder = {
    "dataDictionary",
    "dataDictionaryPublicationExtension"
})
public class DataDictionaryPublication
    extends GenericPublication
{

    @XmlElement(required = true)
    protected List<DataDictionary> dataDictionary;
    protected _ExtensionType dataDictionaryPublicationExtension;

    /**
     * Gets the value of the dataDictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dataDictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataDictionary }
     * 
     * 
     */
    public List<DataDictionary> getDataDictionary() {
        if (dataDictionary == null) {
            dataDictionary = new ArrayList<DataDictionary>();
        }
        return this.dataDictionary;
    }

    /**
     * Gets the value of the dataDictionaryPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getDataDictionaryPublicationExtension() {
        return dataDictionaryPublicationExtension;
    }

    /**
     * Sets the value of the dataDictionaryPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setDataDictionaryPublicationExtension(_ExtensionType value) {
        this.dataDictionaryPublicationExtension = value;
    }

}
