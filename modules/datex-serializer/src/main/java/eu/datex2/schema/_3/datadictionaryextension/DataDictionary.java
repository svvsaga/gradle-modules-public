
package eu.datex2.schema._3.datadictionaryextension;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataDictionary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDictionary"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode"/&gt;
 *         &lt;element name="dataDictionaryDescription" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="dataDictionaryVersion" type="{http://datex2.eu/schema/3/common}String"/&gt;
 *         &lt;element name="dataDictionaryVersionDate" type="{http://datex2.eu/schema/3/common}DateTime"/&gt;
 *         &lt;element name="package" type="{http://datex2.eu/schema/3/dataDictionaryExtension}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="class" type="{http://datex2.eu/schema/3/dataDictionaryExtension}Class" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="attribute" type="{http://datex2.eu/schema/3/dataDictionaryExtension}Attribute" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="association" type="{http://datex2.eu/schema/3/dataDictionaryExtension}Association" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="enumeration" type="{http://datex2.eu/schema/3/dataDictionaryExtension}Enumeration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="enumerationLiteral" type="{http://datex2.eu/schema/3/dataDictionaryExtension}EnumerationLiteral" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_dataDictionaryExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDictionary", propOrder = {
    "country",
    "dataDictionaryDescription",
    "dataDictionaryVersion",
    "dataDictionaryVersionDate",
    "_package",
    "clazz",
    "attribute",
    "association",
    "enumeration",
    "enumerationLiteral",
    "dataDictionaryExtension"
})
public class DataDictionary {

    @XmlElement(required = true)
    protected String country;
    @XmlElement(required = true)
    protected String dataDictionaryDescription;
    @XmlElement(required = true)
    protected String dataDictionaryVersion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataDictionaryVersionDate;
    @XmlElement(name = "package")
    protected List<Package> _package;
    @XmlElement(name = "class")
    protected List<Class> clazz;
    protected List<Attribute> attribute;
    protected List<Association> association;
    protected List<Enumeration> enumeration;
    protected List<EnumerationLiteral> enumerationLiteral;
    @XmlElement(name = "_dataDictionaryExtension")
    protected ExtensionType dataDictionaryExtension;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the dataDictionaryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDictionaryDescription() {
        return dataDictionaryDescription;
    }

    /**
     * Sets the value of the dataDictionaryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDictionaryDescription(String value) {
        this.dataDictionaryDescription = value;
    }

    /**
     * Gets the value of the dataDictionaryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataDictionaryVersion() {
        return dataDictionaryVersion;
    }

    /**
     * Sets the value of the dataDictionaryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataDictionaryVersion(String value) {
        this.dataDictionaryVersion = value;
    }

    /**
     * Gets the value of the dataDictionaryVersionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDictionaryVersionDate() {
        return dataDictionaryVersionDate;
    }

    /**
     * Sets the value of the dataDictionaryVersionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDictionaryVersionDate(XMLGregorianCalendar value) {
        this.dataDictionaryVersionDate = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the package property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Package }
     * 
     * 
     */
    public List<Package> getPackage() {
        if (_package == null) {
            _package = new ArrayList<Package>();
        }
        return this._package;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Class }
     * 
     * 
     */
    public List<Class> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<Class>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attribute }
     * 
     * 
     */
    public List<Attribute> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<Attribute>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the association property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the association property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Association }
     * 
     * 
     */
    public List<Association> getAssociation() {
        if (association == null) {
            association = new ArrayList<Association>();
        }
        return this.association;
    }

    /**
     * Gets the value of the enumeration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the enumeration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enumeration }
     * 
     * 
     */
    public List<Enumeration> getEnumeration() {
        if (enumeration == null) {
            enumeration = new ArrayList<Enumeration>();
        }
        return this.enumeration;
    }

    /**
     * Gets the value of the enumerationLiteral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the enumerationLiteral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumerationLiteral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumerationLiteral }
     * 
     * 
     */
    public List<EnumerationLiteral> getEnumerationLiteral() {
        if (enumerationLiteral == null) {
            enumerationLiteral = new ArrayList<EnumerationLiteral>();
        }
        return this.enumerationLiteral;
    }

    /**
     * Gets the value of the dataDictionaryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDataDictionaryExtension() {
        return dataDictionaryExtension;
    }

    /**
     * Sets the value of the dataDictionaryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDataDictionaryExtension(ExtensionType value) {
        this.dataDictionaryExtension = value;
    }

}
