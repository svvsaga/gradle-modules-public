
package eu.datex2.schema._3.situation;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.PayloadPublication;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A publication containing zero or more traffic/travel situations.
 * 
 * <p>Java class for SituationPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationPublication"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}PayloadPublication"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="situation" type="{http://datex2.eu/schema/3/situation}Situation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="_situationPublicationExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationPublication", propOrder = {
    "situation",
    "_SituationPublicationExtension"
})
public class SituationPublication
    extends PayloadPublication
{

    protected List<Situation> situation;
    @XmlElement(name = "_situationPublicationExtension")
    protected _ExtensionType _SituationPublicationExtension;

    /**
     * Gets the value of the situation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the situation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Situation }
     * 
     * 
     */
    public List<Situation> getSituation() {
        if (situation == null) {
            situation = new ArrayList<Situation>();
        }
        return this.situation;
    }

    /**
     * Gets the value of the _SituationPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_SituationPublicationExtension() {
        return _SituationPublicationExtension;
    }

    /**
     * Sets the value of the _SituationPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_SituationPublicationExtension(_ExtensionType value) {
        this._SituationPublicationExtension = value;
    }

}
