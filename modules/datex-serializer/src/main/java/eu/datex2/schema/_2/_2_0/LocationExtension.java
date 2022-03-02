
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationExtension"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roadNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/&gt;
 *         &lt;element name="countyNumber" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="municipalityNumber" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationExtension", propOrder = {
    "roadNumber",
    "countyNumber",
    "municipalityNumber"
})
public class LocationExtension {

    protected String roadNumber;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger countyNumber;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger municipalityNumber;

    /**
     * Gets the value of the roadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadNumber() {
        return roadNumber;
    }

    /**
     * Sets the value of the roadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadNumber(String value) {
        this.roadNumber = value;
    }

    /**
     * Gets the value of the countyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountyNumber() {
        return countyNumber;
    }

    /**
     * Sets the value of the countyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountyNumber(BigInteger value) {
        this.countyNumber = value;
    }

    /**
     * Gets the value of the municipalityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMunicipalityNumber() {
        return municipalityNumber;
    }

    /**
     * Sets the value of the municipalityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMunicipalityNumber(BigInteger value) {
        this.municipalityNumber = value;
    }

}
