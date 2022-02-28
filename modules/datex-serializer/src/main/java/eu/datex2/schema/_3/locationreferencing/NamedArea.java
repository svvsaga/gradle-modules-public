
package eu.datex2.schema._3.locationreferencing;

import java.util.ArrayList;
import java.util.List;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An area defined by a name and/or in terms of known boundaries, such as country or county
 *         boundaries or allocated control area of particular authority. The attributes do not form a union;
 *         instead, the smallest intersection forms the resulting area.
 *       
 * 
 * <p>Java class for NamedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/common}NamedArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="areaName" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="namedAreaType" type="{http://datex2.eu/schema/3/locationReferencing}_NamedAreaTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{http://datex2.eu/schema/3/common}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="_namedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedArea", propOrder = {
    "rest"
})
@XmlSeeAlso({
    IsoNamedArea.class,
    NutsNamedArea.class
})
public class NamedArea
    extends eu.datex2.schema._3.common.NamedArea
{

    @XmlElementRefs({
        @XmlElementRef(name = "areaName", namespace = "http://datex2.eu/schema/3/locationReferencing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "namedAreaType", namespace = "http://datex2.eu/schema/3/locationReferencing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "country", namespace = "http://datex2.eu/schema/3/locationReferencing", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "_namedAreaExtension", namespace = "http://datex2.eu/schema/3/locationReferencing", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "_NamedAreaExtension" is used by two different parts of a schema. See: 
     * line 2147 of file:/Users/geir.sagberg/Projects/saga/gradle-modules-public/modules/datex-schemas/src/main/resources/DatexII_3/DATEXII_3_LocationReferencing.xsd
     * line 2068 of file:/Users/geir.sagberg/Projects/saga/gradle-modules-public/modules/datex-schemas/src/main/resources/DatexII_3/DATEXII_3_Common.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MultilingualString }{@code >}
     * {@link JAXBElement }{@code <}{@link _ExtensionType }{@code >}
     * {@link JAXBElement }{@code <}{@link _NamedAreaTypeEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
