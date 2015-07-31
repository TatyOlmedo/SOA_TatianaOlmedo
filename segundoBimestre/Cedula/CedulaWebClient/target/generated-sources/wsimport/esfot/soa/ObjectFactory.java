
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

    private final static QName _ObtenerProvincia_QNAME = new QName("http://soa.esfot/", "obtenerProvincia");
    private final static QName _ObtenerProvinciaResponse_QNAME = new QName("http://soa.esfot/", "obtenerProvinciaResponse");
    private final static QName _VerificarCedulaResponse_QNAME = new QName("http://soa.esfot/", "VerificarCedulaResponse");
    private final static QName _CIFault_QNAME = new QName("http://soa.esfot/", "CIFault");
    private final static QName _VerificarCedula_QNAME = new QName("http://soa.esfot/", "VerificarCedula");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: esfot.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerificarCedulaResponse }
     * 
     */
    public VerificarCedulaResponse createVerificarCedulaResponse() {
        return new VerificarCedulaResponse();
    }

    /**
     * Create an instance of {@link ObtenerProvinciaResponse }
     * 
     */
    public ObtenerProvinciaResponse createObtenerProvinciaResponse() {
        return new ObtenerProvinciaResponse();
    }

    /**
     * Create an instance of {@link ObtenerProvincia }
     * 
     */
    public ObtenerProvincia createObtenerProvincia() {
        return new ObtenerProvincia();
    }

    /**
     * Create an instance of {@link CIFault }
     * 
     */
    public CIFault createCIFault() {
        return new CIFault();
    }

    /**
     * Create an instance of {@link VerificarCedula }
     * 
     */
    public VerificarCedula createVerificarCedula() {
        return new VerificarCedula();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProvincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "obtenerProvincia")
    public JAXBElement<ObtenerProvincia> createObtenerProvincia(ObtenerProvincia value) {
        return new JAXBElement<ObtenerProvincia>(_ObtenerProvincia_QNAME, ObtenerProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProvinciaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "obtenerProvinciaResponse")
    public JAXBElement<ObtenerProvinciaResponse> createObtenerProvinciaResponse(ObtenerProvinciaResponse value) {
        return new JAXBElement<ObtenerProvinciaResponse>(_ObtenerProvinciaResponse_QNAME, ObtenerProvinciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCedulaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "VerificarCedulaResponse")
    public JAXBElement<VerificarCedulaResponse> createVerificarCedulaResponse(VerificarCedulaResponse value) {
        return new JAXBElement<VerificarCedulaResponse>(_VerificarCedulaResponse_QNAME, VerificarCedulaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "CIFault")
    public JAXBElement<CIFault> createCIFault(CIFault value) {
        return new JAXBElement<CIFault>(_CIFault_QNAME, CIFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificarCedula }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.esfot/", name = "VerificarCedula")
    public JAXBElement<VerificarCedula> createVerificarCedula(VerificarCedula value) {
        return new JAXBElement<VerificarCedula>(_VerificarCedula_QNAME, VerificarCedula.class, null, value);
    }

}
