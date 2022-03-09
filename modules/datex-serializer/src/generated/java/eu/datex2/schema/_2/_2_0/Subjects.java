
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subjects complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subjects"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subjectTypeOfWorks" type="{http://datex2.eu/schema/2/2_0}SubjectTypeOfWorksEnum"/&gt;
 *         &lt;element name="numberOfSubjects" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="subjectsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subjects", propOrder = {
    "subjectTypeOfWorks",
    "numberOfSubjects",
    "subjectsExtension"
})
public class Subjects {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SubjectTypeOfWorksEnum subjectTypeOfWorks;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfSubjects;
    protected _ExtensionType subjectsExtension;

    /**
     * Gets the value of the subjectTypeOfWorks property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public SubjectTypeOfWorksEnum getSubjectTypeOfWorks() {
        return subjectTypeOfWorks;
    }

    /**
     * Sets the value of the subjectTypeOfWorks property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeOfWorksEnum }
     *     
     */
    public void setSubjectTypeOfWorks(SubjectTypeOfWorksEnum value) {
        this.subjectTypeOfWorks = value;
    }

    /**
     * Gets the value of the numberOfSubjects property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSubjects() {
        return numberOfSubjects;
    }

    /**
     * Sets the value of the numberOfSubjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSubjects(BigInteger value) {
        this.numberOfSubjects = value;
    }

    /**
     * Gets the value of the subjectsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType getSubjectsExtension() {
        return subjectsExtension;
    }

    /**
     * Sets the value of the subjectsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void setSubjectsExtension(_ExtensionType value) {
        this.subjectsExtension = value;
    }

}
