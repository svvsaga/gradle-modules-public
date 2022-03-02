
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
     * Create an instance of {@link PredefinedServiceEnum }
     * 
     */
    public PredefinedServiceEnum createPredefinedServiceEnum() {
        return new PredefinedServiceEnum();
    }

    /**
     * Create an instance of {@link ServiceActionEnum }
     * 
     */
    public ServiceActionEnum createServiceActionEnum() {
        return new ServiceActionEnum();
    }

    /**
     * Create an instance of {@link ServiceActionStatusEnum }
     * 
     */
    public ServiceActionStatusEnum createServiceActionStatusEnum() {
        return new ServiceActionStatusEnum();
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
