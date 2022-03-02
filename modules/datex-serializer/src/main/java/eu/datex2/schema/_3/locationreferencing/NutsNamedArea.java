
package eu.datex2.schema._3.locationreferencing;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The NUTS-Code representation for the named area (Nomenclature of territorial units for
 *         statistics) or its LAU code representation (Local Administrative Unit).
 *       
 * 
 * <p>Java class for NutsNamedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NutsNamedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://datex2.eu/schema/3/locationReferencing}NamedArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nutsCodeType" type="{http://datex2.eu/schema/3/locationReferencing}_NutsCodeTypeEnum"/&gt;
 *         &lt;element name="nutsCode" type="{http://datex2.eu/schema/3/locationReferencing}NutsCode"/&gt;
 *         &lt;element name="_nutsNamedAreaExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NutsNamedArea")
public class NutsNamedArea
    extends NamedArea
{


}
