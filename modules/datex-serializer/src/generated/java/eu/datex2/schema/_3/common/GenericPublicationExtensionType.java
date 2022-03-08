
package eu.datex2.schema._3.common;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.alertclocationcodetableextension.AlertCLocationCodeTablePublication;
import eu.datex2.schema._3.cctvextension.CctvSiteTablePublication;
import eu.datex2.schema._3.cctvextension.CctvStatusPublication;
import eu.datex2.schema._3.datadictionaryextension.DataDictionaryPublication;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAnyElement;
import jakarta.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for _GenericPublicationExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_GenericPublicationExtensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataDictionaryPublication" type="{http://datex2.eu/schema/3/dataDictionaryExtension}DataDictionaryPublication" minOccurs="0"/&gt;
 *         &lt;element name="cctvStatusPublication" type="{http://datex2.eu/schema/3/cctvExtension}CctvStatusPublication" minOccurs="0"/&gt;
 *         &lt;element name="cctvSiteTablePublication" type="{http://datex2.eu/schema/3/cctvExtension}CctvSiteTablePublication" minOccurs="0"/&gt;
 *         &lt;element name="alertCLocationCodeTablePublication" type="{http://datex2.eu/schema/3/alertCLocationCodeTableExtension}AlertCLocationCodeTablePublication" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_GenericPublicationExtensionType", propOrder = {
    "dataDictionaryPublication",
    "cctvStatusPublication",
    "cctvSiteTablePublication",
    "alertCLocationCodeTablePublication",
    "any"
})
public class GenericPublicationExtensionType {

    protected DataDictionaryPublication dataDictionaryPublication;
    protected CctvStatusPublication cctvStatusPublication;
    protected CctvSiteTablePublication cctvSiteTablePublication;
    protected AlertCLocationCodeTablePublication alertCLocationCodeTablePublication;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the dataDictionaryPublication property.
     * 
     * @return
     *     possible object is
     *     {@link DataDictionaryPublication }
     *     
     */
    public DataDictionaryPublication getDataDictionaryPublication() {
        return dataDictionaryPublication;
    }

    /**
     * Sets the value of the dataDictionaryPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataDictionaryPublication }
     *     
     */
    public void setDataDictionaryPublication(DataDictionaryPublication value) {
        this.dataDictionaryPublication = value;
    }

    /**
     * Gets the value of the cctvStatusPublication property.
     * 
     * @return
     *     possible object is
     *     {@link CctvStatusPublication }
     *     
     */
    public CctvStatusPublication getCctvStatusPublication() {
        return cctvStatusPublication;
    }

    /**
     * Sets the value of the cctvStatusPublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvStatusPublication }
     *     
     */
    public void setCctvStatusPublication(CctvStatusPublication value) {
        this.cctvStatusPublication = value;
    }

    /**
     * Gets the value of the cctvSiteTablePublication property.
     * 
     * @return
     *     possible object is
     *     {@link CctvSiteTablePublication }
     *     
     */
    public CctvSiteTablePublication getCctvSiteTablePublication() {
        return cctvSiteTablePublication;
    }

    /**
     * Sets the value of the cctvSiteTablePublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvSiteTablePublication }
     *     
     */
    public void setCctvSiteTablePublication(CctvSiteTablePublication value) {
        this.cctvSiteTablePublication = value;
    }

    /**
     * Gets the value of the alertCLocationCodeTablePublication property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLocationCodeTablePublication }
     *     
     */
    public AlertCLocationCodeTablePublication getAlertCLocationCodeTablePublication() {
        return alertCLocationCodeTablePublication;
    }

    /**
     * Sets the value of the alertCLocationCodeTablePublication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLocationCodeTablePublication }
     *     
     */
    public void setAlertCLocationCodeTablePublication(AlertCLocationCodeTablePublication value) {
        this.alertCLocationCodeTablePublication = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
