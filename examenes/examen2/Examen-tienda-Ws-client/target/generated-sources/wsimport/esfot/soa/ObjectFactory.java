
package esfot.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the esfot.soa package. 
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

    private final static QName _BuscarDirector_QNAME = new QName("http://soa.esfot/", "buscarDirector");
    private final static QName _BuscarDirectorResponse_QNAME = new QName("http://soa.esfot/", "buscarDirectorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfot.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarDirector }
     * 
     */
    public BuscarDirector createBuscarDirector() {
        return new BuscarDirector();
    }

    /**
     * Create an instance of {@link BuscarDirectorResponse }
     * 
     */
    public BuscarDirectorResponse createBuscarDirectorResponse() {
        return new BuscarDirectorResponse();
    }

    /**
     * Create an instance of {@link PeliculaTO }
     * 
     */
    public PeliculaTO createPeliculaTO() {
        return new PeliculaTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDirector }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "buscarDirector")
    public JAXBElement<BuscarDirector> createBuscarDirector(BuscarDirector value) {
        return new JAXBElement<BuscarDirector>(_BuscarDirector_QNAME, BuscarDirector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarDirectorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "buscarDirectorResponse")
    public JAXBElement<BuscarDirectorResponse> createBuscarDirectorResponse(BuscarDirectorResponse value) {
        return new JAXBElement<BuscarDirectorResponse>(_BuscarDirectorResponse_QNAME, BuscarDirectorResponse.class, null, value);
    }

}
