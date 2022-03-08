
package eu.datex2.schema._3.datadictionaryextension;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.datex2.schema._3.datadictionaryextension package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.datex2.schema._3.datadictionaryextension
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Association }
     * 
     */
    public Association createAssociation() {
        return new Association();
    }

    /**
     * Create an instance of {@link Attribute }
     * 
     */
    public Attribute createAttribute() {
        return new Attribute();
    }

    /**
     * Create an instance of {@link Class }
     * 
     */
    public Class createClass() {
        return new Class();
    }

    /**
     * Create an instance of {@link DataDictionary }
     * 
     */
    public DataDictionary createDataDictionary() {
        return new DataDictionary();
    }

    /**
     * Create an instance of {@link DataDictionaryPublication }
     * 
     */
    public DataDictionaryPublication createDataDictionaryPublication() {
        return new DataDictionaryPublication();
    }

    /**
     * Create an instance of {@link Enumeration }
     * 
     */
    public Enumeration createEnumeration() {
        return new Enumeration();
    }

    /**
     * Create an instance of {@link EnumerationLiteral }
     * 
     */
    public EnumerationLiteral createEnumerationLiteral() {
        return new EnumerationLiteral();
    }

    /**
     * Create an instance of {@link Package }
     * 
     */
    public Package createPackage() {
        return new Package();
    }

}
