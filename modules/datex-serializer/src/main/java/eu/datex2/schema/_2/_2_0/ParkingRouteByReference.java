
package eu.datex2.schema._2._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParkingRouteByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParkingRouteByReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}ParkingRoute"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parkingRouteReference" type="{http://datex2.eu/schema/2/2_0}_ParkingRouteDetailsVersionedReference"/&gt;
 *         &lt;element name="parkingRouteByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParkingRouteByReference", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "parkingRouteReference",
    "parkingRouteByReferenceExtension"
})
public class ParkingRouteByReference
    extends ParkingRoute
{

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected ParkingRouteDetailsVersionedReference parkingRouteReference;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType parkingRouteByReferenceExtension;

    /**
     * Gets the value of the parkingRouteReference property.
     * 
     * @return
     *     possible object is
     *     {@link ParkingRouteDetailsVersionedReference }
     *     
     */
    public ParkingRouteDetailsVersionedReference getParkingRouteReference() {
        return parkingRouteReference;
    }

    /**
     * Sets the value of the parkingRouteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingRouteDetailsVersionedReference }
     *     
     */
    public void setParkingRouteReference(ParkingRouteDetailsVersionedReference value) {
        this.parkingRouteReference = value;
    }

    /**
     * Gets the value of the parkingRouteByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getParkingRouteByReferenceExtension() {
        return parkingRouteByReferenceExtension;
    }

    /**
     * Sets the value of the parkingRouteByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setParkingRouteByReferenceExtension(ExtensionType value) {
        this.parkingRouteByReferenceExtension = value;
    }

}
