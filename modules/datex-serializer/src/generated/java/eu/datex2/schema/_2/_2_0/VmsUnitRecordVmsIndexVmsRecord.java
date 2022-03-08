
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsUnitRecordVmsIndexVmsRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsUnitRecordVmsIndexVmsRecord"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsRecord" type="{http://datex2.eu/schema/2/2_0}VmsRecord"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vmsIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsUnitRecordVmsIndexVmsRecord", propOrder = {
    "vmsRecord"
})
public class VmsUnitRecordVmsIndexVmsRecord {

    @XmlElement(required = true)
    protected VmsRecord vmsRecord;
    @XmlAttribute(name = "vmsIndex", required = true)
    protected int vmsIndex;

    /**
     * Gets the value of the vmsRecord property.
     * 
     * @return
     *     possible object is
     *     {@link VmsRecord }
     *     
     */
    public VmsRecord getVmsRecord() {
        return vmsRecord;
    }

    /**
     * Sets the value of the vmsRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsRecord }
     *     
     */
    public void setVmsRecord(VmsRecord value) {
        this.vmsRecord = value;
    }

    /**
     * Gets the value of the vmsIndex property.
     * 
     */
    public int getVmsIndex() {
        return vmsIndex;
    }

    /**
     * Sets the value of the vmsIndex property.
     * 
     */
    public void setVmsIndex(int value) {
        this.vmsIndex = value;
    }

}
