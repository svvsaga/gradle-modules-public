
package eu.datex2.schema._3.informationmanagement;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex2.schema._3.informationmanagement package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex2.schema._3.informationmanagement
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link _ManagementTypeEnum }
     * 
     */
    public _ManagementTypeEnum create_ManagementTypeEnum() {
        return new _ManagementTypeEnum();
    }

    /**
     * Create an instance of {@link ElementReference }
     * 
     */
    public ElementReference createElementReference() {
        return new ElementReference();
    }

    /**
     * Create an instance of {@link InformationManagedResourceList }
     * 
     */
    public InformationManagedResourceList createInformationManagedResourceList() {
        return new InformationManagedResourceList();
    }

    /**
     * Create an instance of {@link InformationManagement }
     * 
     */
    public InformationManagement createInformationManagement() {
        return new InformationManagement();
    }

}
