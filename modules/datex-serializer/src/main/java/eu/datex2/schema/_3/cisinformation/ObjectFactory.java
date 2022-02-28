
package eu.datex2.schema._3.cisinformation;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex2.schema._3.cisinformation package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex2.schema._3.cisinformation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link _PredefinedServiceEnum }
     * 
     */
    public _PredefinedServiceEnum create_PredefinedServiceEnum() {
        return new _PredefinedServiceEnum();
    }

    /**
     * Create an instance of {@link _ServiceActionEnum }
     * 
     */
    public _ServiceActionEnum create_ServiceActionEnum() {
        return new _ServiceActionEnum();
    }

    /**
     * Create an instance of {@link _ServiceActionStatusEnum }
     * 
     */
    public _ServiceActionStatusEnum create_ServiceActionStatusEnum() {
        return new _ServiceActionStatusEnum();
    }

    /**
     * Create an instance of {@link CISInformation }
     * 
     */
    public CISInformation createCISInformation() {
        return new CISInformation();
    }

    /**
     * Create an instance of {@link ServiceFeedback }
     * 
     */
    public ServiceFeedback createServiceFeedback() {
        return new ServiceFeedback();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceRequestCondition }
     * 
     */
    public ServiceRequestCondition createServiceRequestCondition() {
        return new ServiceRequestCondition();
    }

}
