
package eu.datex2.schema._3.d2payload;

import javax.xml.namespace.QName;
import eu.datex2.schema._3.common.PayloadPublication;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex2.schema._3.d2payload package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Payload_QNAME = new QName("http://datex2.eu/schema/3/d2Payload", "payload");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex2.schema._3.d2payload
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayloadPublication }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PayloadPublication }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/schema/3/d2Payload", name = "payload")
    public JAXBElement<PayloadPublication> createPayload(PayloadPublication value) {
        return new JAXBElement<PayloadPublication>(_Payload_QNAME, PayloadPublication.class, null, value);
    }

}
