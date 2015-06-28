
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

    private final static QName _Saluda_QNAME = new QName("http://soa.esfot/", "saluda");
    private final static QName _SaludaResponse_QNAME = new QName("http://soa.esfot/", "saludaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfot.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Saluda }
     * 
     */
    public Saluda createSaluda() {
        return new Saluda();
    }

    /**
     * Create an instance of {@link SaludaResponse }
     * 
     */
    public SaludaResponse createSaludaResponse() {
        return new SaludaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Saluda }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "saluda")
    public JAXBElement<Saluda> createSaluda(Saluda value) {
        return new JAXBElement<Saluda>(_Saluda_QNAME, Saluda.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaludaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "saludaResponse")
    public JAXBElement<SaludaResponse> createSaludaResponse(SaludaResponse value) {
        return new JAXBElement<SaludaResponse>(_SaludaResponse_QNAME, SaludaResponse.class, null, value);
    }

}
