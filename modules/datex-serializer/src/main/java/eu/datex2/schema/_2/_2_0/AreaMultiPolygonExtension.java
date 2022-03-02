
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaMultiPolygonExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaMultiPolygonExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="gmlMultiPolygon" type="{http://datex2.eu/schema/2/2_0}GMLMultiPolygon"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaMultiPolygonExtension", propOrder = {
    "gmlMultiPolygon"
})
public class AreaMultiPolygonExtension {

    @XmlElement(required = true)
    protected GMLMultiPolygon gmlMultiPolygon;

    /**
     * Gets the value of the gmlMultiPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link GMLMultiPolygon }
     *     
     */
    public GMLMultiPolygon getGmlMultiPolygon() {
        return gmlMultiPolygon;
    }

    /**
     * Sets the value of the gmlMultiPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLMultiPolygon }
     *     
     */
    public void setGmlMultiPolygon(GMLMultiPolygon value) {
        this.gmlMultiPolygon = value;
    }

}
