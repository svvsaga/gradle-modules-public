
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Location representing a geographic or geometric defined area which may be qualified by
 *         height information to provide additional geospatial discrimination (e.g. for snow in an area but only
 *         above a certain altitude).
 *       
 * 
 * <p>Java class for AreaLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}Location"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areasAtWhichApplicable" type="{http://datex2.eu/schema/3/locationReferencing}_AreaPlacesEnum" minOccurs="0"/&gt;
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/3/locationReferencing}AlertCArea" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tpegAreaLocation" type="{http://datex2.eu/schema/3/locationReferencing}TpegAreaLocation" minOccurs="0"/&gt;
 *         &lt;element name="namedArea" type="{http://datex2.eu/schema/3/locationReferencing}NamedArea" minOccurs="0"/&gt;
 *         &lt;element name="gmlMultiPolygon" type="{http://datex2.eu/schema/3/locationReferencing}GmlMultiPolygon" minOccurs="0"/&gt;
 *         &lt;element name="openlrAreaLocationReference" type="{http://datex2.eu/schema/3/locationReferencing}OpenlrAreaLocationReference" minOccurs="0"/&gt;
 *         &lt;element name="_areaLocationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaLocation", propOrder = {
    "areasAtWhichApplicable",
    "alertCArea",
    "tpegAreaLocation",
    "namedArea",
    "gmlMultiPolygon",
    "openlrAreaLocationReference",
    "_AreaLocationExtension"
})
public class AreaLocation
    extends Location
{

    protected _AreaPlacesEnum areasAtWhichApplicable;
    protected List<AlertCArea> alertCArea;
    protected TpegAreaLocation tpegAreaLocation;
    protected NamedArea namedArea;
    protected GmlMultiPolygon gmlMultiPolygon;
    protected OpenlrAreaLocationReference openlrAreaLocationReference;
    @XmlElement(name = "_areaLocationExtension")
    protected _ExtensionType _AreaLocationExtension;

    /**
     * Gets the value of the areasAtWhichApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link _AreaPlacesEnum }
     *     
     */
    public _AreaPlacesEnum getAreasAtWhichApplicable() {
        return areasAtWhichApplicable;
    }

    /**
     * Sets the value of the areasAtWhichApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link _AreaPlacesEnum }
     *     
     */
    public void setAreasAtWhichApplicable(_AreaPlacesEnum value) {
        this.areasAtWhichApplicable = value;
    }

    /**
     * Gets the value of the alertCArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the alertCArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertCArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCArea }
     * 
     * 
     */
    public List<AlertCArea> getAlertCArea() {
        if (alertCArea == null) {
            alertCArea = new ArrayList<AlertCArea>();
        }
        return this.alertCArea;
    }

    /**
     * Gets the value of the tpegAreaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaLocation }
     *     
     */
    public TpegAreaLocation getTpegAreaLocation() {
        return tpegAreaLocation;
    }

    /**
     * Sets the value of the tpegAreaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaLocation }
     *     
     */
    public void setTpegAreaLocation(TpegAreaLocation value) {
        this.tpegAreaLocation = value;
    }

    /**
     * Gets the value of the namedArea property.
     * 
     * @return
     *     possible object is
     *     {@link NamedArea }
     *     
     */
    public NamedArea getNamedArea() {
        return namedArea;
    }

    /**
     * Sets the value of the namedArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamedArea }
     *     
     */
    public void setNamedArea(NamedArea value) {
        this.namedArea = value;
    }

    /**
     * Gets the value of the gmlMultiPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link GmlMultiPolygon }
     *     
     */
    public GmlMultiPolygon getGmlMultiPolygon() {
        return gmlMultiPolygon;
    }

    /**
     * Sets the value of the gmlMultiPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link GmlMultiPolygon }
     *     
     */
    public void setGmlMultiPolygon(GmlMultiPolygon value) {
        this.gmlMultiPolygon = value;
    }

    /**
     * Gets the value of the openlrAreaLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrAreaLocationReference }
     *     
     */
    public OpenlrAreaLocationReference getOpenlrAreaLocationReference() {
        return openlrAreaLocationReference;
    }

    /**
     * Sets the value of the openlrAreaLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrAreaLocationReference }
     *     
     */
    public void setOpenlrAreaLocationReference(OpenlrAreaLocationReference value) {
        this.openlrAreaLocationReference = value;
    }

    /**
     * Gets the value of the _AreaLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_AreaLocationExtension() {
        return _AreaLocationExtension;
    }

    /**
     * Sets the value of the _AreaLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_AreaLocationExtension(_ExtensionType value) {
        this._AreaLocationExtension = value;
    }

}
