
package eu.datex2.schema._3.messagecontainer;

import javax.xml.namespace.QName;
import eu.datex2.schema._3.exchangeinformation.ExchangeInformation;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex2.schema._3.messagecontainer package. 
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

    private final static QName _ExchangeInformation_QNAME = new QName("http://datex2.eu/schema/3/messageContainer", "exchangeInformation");
    private final static QName _MessageContainer_QNAME = new QName("http://datex2.eu/schema/3/messageContainer", "messageContainer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex2.schema._3.messagecontainer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageContainer }
     * 
     */
    public MessageContainer createMessageContainer() {
        return new MessageContainer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/schema/3/messageContainer", name = "exchangeInformation")
    public JAXBElement<ExchangeInformation> createExchangeInformation(ExchangeInformation value) {
        return new JAXBElement<ExchangeInformation>(_ExchangeInformation_QNAME, ExchangeInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MessageContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://datex2.eu/schema/3/messageContainer", name = "messageContainer")
    public JAXBElement<MessageContainer> createMessageContainer(MessageContainer value) {
        return new JAXBElement<MessageContainer>(_MessageContainer_QNAME, MessageContainer.class, null, value);
    }

}
