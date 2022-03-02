
package eu.datex2.schema._3.roadtrafficdata;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.ExtensionType;
import eu.datex2.schema._3.common.Pollution;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Measurements of atmospheric pollution.
 * 
 * <p>Java class for PollutionInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollutionInformation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/roadTrafficData}WeatherData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pollution" type="{http://datex2.eu/schema/3/common}Pollution" maxOccurs="unbounded"/&gt;
 *         &lt;element name="_pollutionInformationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollutionInformation", propOrder = {
    "pollution",
    "pollutionInformationExtension"
})
public class PollutionInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected List<Pollution> pollution;
    @XmlElement(name = "_pollutionInformationExtension")
    protected ExtensionType pollutionInformationExtension;

    /**
     * Gets the value of the pollution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pollution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pollution }
     * 
     * 
     */
    public List<Pollution> getPollution() {
        if (pollution == null) {
            pollution = new ArrayList<Pollution>();
        }
        return this.pollution;
    }

    /**
     * Gets the value of the pollutionInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionInformationExtension() {
        return pollutionInformationExtension;
    }

    /**
     * Sets the value of the pollutionInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionInformationExtension(ExtensionType value) {
        this.pollutionInformationExtension = value;
    }

}
