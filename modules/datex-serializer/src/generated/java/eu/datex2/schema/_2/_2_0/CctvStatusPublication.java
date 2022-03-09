
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStatusPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvStatusPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cctvCameraListReference" type="{http://datex2.eu/schema/2/2_0}_CctvCameraListVersionedReference"/&gt;
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation"/&gt;
 *         &lt;element name="cctvCameraStatus" type="{http://datex2.eu/schema/2/2_0}CctvCameraStatus" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvStatusPublication", propOrder = {
    "cctvCameraListReference",
    "headerInformation",
    "cctvCameraStatus"
})
public class CctvStatusPublication {

    @XmlElement(required = true)
    protected _CctvCameraListVersionedReference cctvCameraListReference;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<CctvCameraStatus> cctvCameraStatus;

    /**
     * Gets the value of the cctvCameraListReference property.
     * 
     * @return
     *     possible object is
     *     {@link _CctvCameraListVersionedReference }
     *     
     */
    public _CctvCameraListVersionedReference getCctvCameraListReference() {
        return cctvCameraListReference;
    }

    /**
     * Sets the value of the cctvCameraListReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CctvCameraListVersionedReference }
     *     
     */
    public void setCctvCameraListReference(_CctvCameraListVersionedReference value) {
        this.cctvCameraListReference = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the cctvCameraStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCameraStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCameraStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvCameraStatus }
     * 
     * 
     */
    public List<CctvCameraStatus> getCctvCameraStatus() {
        if (cctvCameraStatus == null) {
            cctvCameraStatus = new ArrayList<CctvCameraStatus>();
        }
        return this.cctvCameraStatus;
    }

}
