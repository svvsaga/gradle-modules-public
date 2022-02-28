
package eu.datex2.schema._3.situation;

import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Roadworks involving the construction of new infrastructure.
 * 
 * <p>Java class for ConstructionWorks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstructionWorks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/situation}Roadworks"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="constructionWorkType" type="{http://datex2.eu/schema/3/situation}_ConstructionWorkTypeEnum"/&gt;
 *         &lt;element name="_constructionWorksExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstructionWorks", propOrder = {
    "constructionWorkType",
    "_ConstructionWorksExtension"
})
public class ConstructionWorks
    extends Roadworks
{

    @XmlElement(required = true)
    protected _ConstructionWorkTypeEnum constructionWorkType;
    @XmlElement(name = "_constructionWorksExtension")
    protected _ExtensionType _ConstructionWorksExtension;

    /**
     * Gets the value of the constructionWorkType property.
     * 
     * @return
     *     possible object is
     *     {@link _ConstructionWorkTypeEnum }
     *     
     */
    public _ConstructionWorkTypeEnum getConstructionWorkType() {
        return constructionWorkType;
    }

    /**
     * Sets the value of the constructionWorkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ConstructionWorkTypeEnum }
     *     
     */
    public void setConstructionWorkType(_ConstructionWorkTypeEnum value) {
        this.constructionWorkType = value;
    }

    /**
     * Gets the value of the _ConstructionWorksExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_ConstructionWorksExtension() {
        return _ConstructionWorksExtension;
    }

    /**
     * Sets the value of the _ConstructionWorksExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_ConstructionWorksExtension(_ExtensionType value) {
        this._ConstructionWorksExtension = value;
    }

}
