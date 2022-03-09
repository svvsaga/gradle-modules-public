
package eu.datex2.schema._3.vms;

import java.math.BigInteger;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisplayGeometry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisplayGeometry"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pixelsAcross" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="pixelsDown" type="{http://datex2.eu/schema/3/common}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="displayHeight" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="displayWidth" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="positionX" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="positionY" type="{http://datex2.eu/schema/3/common}MetresAsFloat" minOccurs="0"/&gt;
 *         &lt;element name="_displayGeometryExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisplayGeometry", propOrder = {
    "pixelsAcross",
    "pixelsDown",
    "displayHeight",
    "displayWidth",
    "positionX",
    "positionY",
    "_DisplayGeometryExtension"
})
public class DisplayGeometry {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pixelsAcross;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pixelsDown;
    protected Float displayHeight;
    protected Float displayWidth;
    protected Float positionX;
    protected Float positionY;
    @XmlElement(name = "_displayGeometryExtension")
    protected _ExtensionType _DisplayGeometryExtension;

    /**
     * Gets the value of the pixelsAcross property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPixelsAcross() {
        return pixelsAcross;
    }

    /**
     * Sets the value of the pixelsAcross property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPixelsAcross(BigInteger value) {
        this.pixelsAcross = value;
    }

    /**
     * Gets the value of the pixelsDown property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPixelsDown() {
        return pixelsDown;
    }

    /**
     * Sets the value of the pixelsDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPixelsDown(BigInteger value) {
        this.pixelsDown = value;
    }

    /**
     * Gets the value of the displayHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDisplayHeight() {
        return displayHeight;
    }

    /**
     * Sets the value of the displayHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisplayHeight(Float value) {
        this.displayHeight = value;
    }

    /**
     * Gets the value of the displayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDisplayWidth() {
        return displayWidth;
    }

    /**
     * Sets the value of the displayWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDisplayWidth(Float value) {
        this.displayWidth = value;
    }

    /**
     * Gets the value of the positionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositionX() {
        return positionX;
    }

    /**
     * Sets the value of the positionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositionX(Float value) {
        this.positionX = value;
    }

    /**
     * Gets the value of the positionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPositionY() {
        return positionY;
    }

    /**
     * Sets the value of the positionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPositionY(Float value) {
        this.positionY = value;
    }

    /**
     * Gets the value of the _DisplayGeometryExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_DisplayGeometryExtension() {
        return _DisplayGeometryExtension;
    }

    /**
     * Sets the value of the _DisplayGeometryExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_DisplayGeometryExtension(_ExtensionType value) {
        this._DisplayGeometryExtension = value;
    }

}
