
package eu.datex2.schema._3.situation;

import javax.xml.datatype.XMLGregorianCalendar;
import eu.datex2.schema._3.common.MultilingualString;
import eu.datex2.schema._3.common._ExtensionType;
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
 *         &lt;element name="comment" type="{http://datex2.eu/schema/3/common}MultilingualString"/&gt;
 *         &lt;element name="commentDateTime" type="{http://datex2.eu/schema/3/common}DateTime" minOccurs="0"/&gt;
 *         &lt;element name="commentType" type="{http://datex2.eu/schema/3/situation}_CommentTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="_commentExtension" type="{http://datex2.eu/schema/3/common}_ExtensionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Comment", propOrder = {
    "comment",
    "commentDateTime",
    "commentType",
    "_CommentExtension"
})
public class Comment {

    @XmlElement(required = true)
    protected MultilingualString comment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar commentDateTime;
    protected _CommentTypeEnum commentType;
    @XmlElement(name = "_commentExtension")
    protected _ExtensionType _CommentExtension;

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
     *     {@link _CommentTypeEnum }
     *     
     */
    public _CommentTypeEnum getCommentType() {
        return commentType;
    }

    /**
     * Sets the value of the commentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link _CommentTypeEnum }
     *     
     */
    public void setCommentType(_CommentTypeEnum value) {
        this.commentType = value;
    }

    /**
     * Gets the value of the _CommentExtension property.
     * 
     * @return
     *     possible object is
     *     {@link _ExtensionType }
     *     
     */
    public _ExtensionType get_CommentExtension() {
        return _CommentExtension;
    }

    /**
     * Sets the value of the _CommentExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link _ExtensionType }
     *     
     */
    public void set_CommentExtension(_ExtensionType value) {
        this._CommentExtension = value;
    }

}
