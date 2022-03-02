
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The ISO 3166-2 representation for the named area.
 * 
 * <p>Java class for IsoNamedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsoNamedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NamedArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subdivisionType" type="{http://datex2.eu/schema/3/locationReferencing}_SubdivisionTypeEnum"/&gt;
 *         &lt;element name="subdivisionCode" type="{http://datex2.eu/schema/3/locationReferencing}SubdivisionCode"/&gt;
 *         &lt;element name="_isoNamedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsoNamedArea")
public class IsoNamedArea
    extends NamedArea
{


}
