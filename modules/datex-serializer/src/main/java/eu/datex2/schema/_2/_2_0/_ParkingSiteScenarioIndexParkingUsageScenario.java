
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _ParkingSiteScenarioIndexParkingUsageScenario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ParkingSiteScenarioIndexParkingUsageScenario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingUsageScenario" type="{http://datex2.eu/schema/2/2_0}ParkingUsageScenario"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="scenarioIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ParkingSiteScenarioIndexParkingUsageScenario", propOrder = {
    "parkingUsageScenario"
})
public class _ParkingSiteScenarioIndexParkingUsageScenario {

    @XmlElement(required = true)
    protected ParkingUsageScenario parkingUsageScenario;
    @XmlAttribute(name = "scenarioIndex", required = true)
    protected int scenarioIndex;

    /**
     * Gets the value of the parkingUsageScenario property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingUsageScenario }
     *     
     */
    public ParkingUsageScenario getParkingUsageScenario() {
        return parkingUsageScenario;
    }

    /**
     * Sets the value of the parkingUsageScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingUsageScenario }
     *     
     */
    public void setParkingUsageScenario(ParkingUsageScenario value) {
        this.parkingUsageScenario = value;
    }

    /**
     * Gets the value of the scenarioIndex property.
     * 
     */
    public int getScenarioIndex() {
        return scenarioIndex;
    }

    /**
     * Sets the value of the scenarioIndex property.
     * 
     */
    public void setScenarioIndex(int value) {
        this.scenarioIndex = value;
    }

}
