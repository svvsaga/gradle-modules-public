
package eu.datex2.schema._3.locationreferencing;

import java.math.BigInteger;
import eu.datex2.schema._3.common.ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Line string based on GML (EN ISO 19136) definition: a curve defined by a series of two or
 *         more coordinate tuples. Unlike GML may be self-intersecting. If srsName attribute is not present,
 *         posList is assumed to use "ETRS89-LatLonh" reference system.
 *       
 * 
 * <p>Java class for GmlLineString complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GmlLineString"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="posList" type="{http://datex2.eu/schema/3/locationReferencing}GmlPosList"/&gt;
 *         &lt;element name="_gmlLineStringExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="srsDimension" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" /&gt;
 *       &lt;attribute name="srsName" type="{http://datex2.eu/schema/3/common}String" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GmlLineString", propOrder = {
    "posList",
    "gmlLineStringExtension"
})
@XmlSeeAlso({
    GmlLinearRing.class
})
public class GmlLineString {

    @XmlElement(required = true)
    protected String posList;
    @XmlElement(name = "_gmlLineStringExtension")
    protected ExtensionType gmlLineStringExtension;
    @XmlAttribute(name = "srsDimension")
    protected BigInteger srsDimension;
    @XmlAttribute(name = "srsName")
    protected String srsName;

    /**
     * Gets the value of the posList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosList() {
        return posList;
    }

    /**
     * Sets the value of the posList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosList(String value) {
        this.posList = value;
    }

    /**
     * Gets the value of the gmlLineStringExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlLineStringExtension() {
        return gmlLineStringExtension;
    }

    /**
     * Sets the value of the gmlLineStringExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlLineStringExtension(ExtensionType value) {
        this.gmlLineStringExtension = value;
    }

    /**
     * Gets the value of the srsDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSrsDimension() {
        return srsDimension;
    }

    /**
     * Sets the value of the srsDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSrsDimension(BigInteger value) {
        this.srsDimension = value;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

}
