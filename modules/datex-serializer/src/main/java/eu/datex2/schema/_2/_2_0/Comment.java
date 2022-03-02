
package eu.datex2.schema._2._2_0;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Comment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Comment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://datex2.eu/schema/2/2_0}MultilingualString"/&gt;
 *         &lt;element name="commentDateTime" type="{http://datex2.eu/schema/2/2_0}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="commentType" type="{http://datex2.eu/schema/2/2_0}CommentTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="commentExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comment", namespace = "http://datex2.eu/schema/2/2_0", propOrder = {
    "comment",
    "commentDateTime",
    "commentType",
    "commentExtension"
})
public class Comment {

    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0", required = true)
    protected MultilingualString comment;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentDateTime;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    @XmlSchemaType(name = "string")
    protected CommentTypeEnum commentType;
    @XmlElement(namespace = "http://datex2.eu/schema/2/2_0")
    protected ExtensionType commentExtension;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setComment(MultilingualString value) {
        this.comment = value;
    }

    /**
     * Gets the value of the commentDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCommentDateTime() {
        return commentDateTime;
    }

    /**
     * Sets the value of the commentDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCommentDateTime(XMLGregorianCalendar value) {
        this.commentDateTime = value;
    }

    /**
     * Gets the value of the commentType property.
     * 
     * @return
     *     possible object is
     *     {@link CommentTypeEnum }
     *     
     */
    public CommentTypeEnum getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentTypeEnum }
     *     
     */
    public void setCommentType(CommentTypeEnum value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the commentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCommentExtension() {
        return commentExtension;
    }

    /**
     * Sets the value of the commentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCommentExtension(ExtensionType value) {
        this.commentExtension = value;
    }

}
