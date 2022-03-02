
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vmsPictogram" type="{http://datex2.eu/schema/2/2_0}VmsPictogram"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="pictogramSequencingIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "vmsPictogram"
})
public class VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected VmsPictogram vmsPictogram;
    @XmlAttribute(name = "pictogramSequencingIndex", required = true)
    protected int pictogramSequencingIndex;

    /**
     * Gets the value of the vmsPictogram property.
     * 
     * @return
     *     possible object is
     *     {@link VmsPictogram }
     *     
     */
    public VmsPictogram getVmsPictogram() {
        return vmsPictogram;
    }

    /**
     * Sets the value of the vmsPictogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsPictogram }
     *     
     */
    public void setVmsPictogram(VmsPictogram value) {
        this.vmsPictogram = value;
    }

    /**
     * Gets the value of the pictogramSequencingIndex property.
     * 
     */
    public int getPictogramSequencingIndex() {
        return pictogramSequencingIndex;
    }

    /**
     * Sets the value of the pictogramSequencingIndex property.
     * 
     */
    public void setPictogramSequencingIndex(int value) {
        this.pictogramSequencingIndex = value;
    }

}
