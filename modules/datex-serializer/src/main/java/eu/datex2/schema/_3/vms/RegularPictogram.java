
package eu.datex2.schema._3.vms;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A regular pictogram displayable on a VMS panel.
 * 
 * <p>Java class for RegularPictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegularPictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/vms}Pictogram"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pictogramDescription" type="{http://datex2.eu/schema/3/vms}_PictogramEnum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="presenceOfRedTriangle" type="{http://datex2.eu/schema/3/common}Boolean" minOccurs="0"/&gt;
 *         &lt;element name="displayedNumericalInformation" type="{http://datex2.eu/schema/3/vms}DisplayedNumericalInformation" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="_regularPictogramExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegularPictogram", propOrder = {
    "pictogramDescription",
    "presenceOfRedTriangle",
    "displayedNumericalInformation",
    "_RegularPictogramExtension"
})
public class RegularPictogram
    extends Pictogram
{

    protected List<_PictogramEnum> pictogramDescription;
    protected Boolean presenceOfRedTriangle;
    protected List<DisplayedNumericalInformation> displayedNumericalInformation;
    @XmlElement(name = "_regularPictogramExtension")
    protected _ExtensionType _RegularPictogramExtension;

    /**
     * Gets the value of the pictogramDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pictogramDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictogramDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link _PictogramEnum }
     * 
     * 
     */
    public List<_PictogramEnum> getPictogramDescription() {
        if (pictogramDescription == null) {
            pictogramDescription = new ArrayList<_PictogramEnum>();
        }
        return this.pictogramDescription;
    }

    /**
     * Gets the value of the presenceOfRedTriangle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPresenceOfRedTriangle() {
        return presenceOfRedTriangle;
    }

    /**
     * Sets the value of the presenceOfRedTriangle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPresenceOfRedTriangle(Boolean value) {
        this.presenceOfRedTriangle = value;
    }

    /**
     * Gets the value of the displayedNumericalInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the displayedNumericalInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayedNumericalInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayedNumericalInformation }
     * 
     * 
     */
    public List<DisplayedNumericalInformation> getDisplayedNumericalInformation() {
        if (displayedNumericalInformation == null) {
            displayedNumericalInformation = new ArrayList<DisplayedNumericalInformation>();
        }
        return this.displayedNumericalInformation;
    }

    /**
     * Gets the value of the _RegularPictogramExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_RegularPictogramExtension() {
        return _RegularPictogramExtension;
    }

    /**
     * Sets the value of the _RegularPictogramExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_RegularPictogramExtension(_ExtensionType value) {
        this._RegularPictogramExtension = value;
    }

}
