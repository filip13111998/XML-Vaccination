//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.09 at 05:44:14 pm CET 
//


package rs.ac.uns.ftn.obrazac;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import rs.ac.uns.ftn.util.TAdresa;
import rs.ac.uns.ftn.util.TDrzavljanstvo;
import rs.ac.uns.ftn.util.TEvidencija;
import rs.ac.uns.ftn.util.TKorisnikUstanove;
import rs.ac.uns.ftn.util.TPol;
import rs.ac.uns.ftn.util.TRadniStatus;
import rs.ac.uns.ftn.util.TSaglasan;
import rs.ac.uns.ftn.util.TTipVakcina;
import rs.ac.uns.ftn.util.TZanimanjeZaposlenog;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.obrazac package. 
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

    private final static QName _ObrazacMestoRodjenja_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "mestoRodjenja");
    private final static QName _ObrazacPotpis_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "potpis");
    private final static QName _ObrazacNaselje_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "naselje");
    private final static QName _ObrazacEvidencija_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "evidencija");
    private final static QName _ObrazacSocijalnaZastita_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "socijalnaZastita");
    private final static QName _ObrazacSaglasnost_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "saglasnost");
    private final static QName _ObrazacImeRoditelja_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "imeRoditelja");
    private final static QName _ObrazacGrad_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "grad");
    private final static QName _ObrazacAdresa_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "adresa");
    private final static QName _ObrazacEMail_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "e-mail");
    private final static QName _ObrazacMobilni_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "mobilni");
    private final static QName _ObrazacZanimanje_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "zanimanje");
    private final static QName _ObrazacOpstina_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "opstina");
    private final static QName _ObrazacPrezime_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "prezime");
    private final static QName _ObrazacDatum_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "datum");
    private final static QName _ObrazacIme_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "ime");
    private final static QName _ObrazacDrzavljanstvo_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "drzavljanstvo");
    private final static QName _ObrazacDatumRodjenja_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "datumRodjenja");
    private final static QName _ObrazacPol_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "pol");
    private final static QName _ObrazacVakcina_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "vakcina");
    private final static QName _ObrazacFiksni_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "fiksni");
    private final static QName _ObrazacNaziv_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "naziv");
    private final static QName _ObrazacRadniStatus_QNAME = new QName("http://ftn.uns.ac.rs/obrazac", "radniStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.obrazac
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Obrazac }
     * 
     */
    public Obrazac createObrazac() {
        return new Obrazac();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "mestoRodjenja", scope = Obrazac.class)
    public JAXBElement<String> createObrazacMestoRodjenja(String value) {
        return new JAXBElement<String>(_ObrazacMestoRodjenja_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "potpis", scope = Obrazac.class)
    public JAXBElement<String> createObrazacPotpis(String value) {
        return new JAXBElement<String>(_ObrazacPotpis_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "naselje", scope = Obrazac.class)
    public JAXBElement<String> createObrazacNaselje(String value) {
        return new JAXBElement<String>(_ObrazacNaselje_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TEvidencija }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "evidencija", scope = Obrazac.class)
    public JAXBElement<TEvidencija> createObrazacEvidencija(TEvidencija value) {
        return new JAXBElement<TEvidencija>(_ObrazacEvidencija_QNAME, TEvidencija.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TKorisnikUstanove }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "socijalnaZastita", scope = Obrazac.class)
    public JAXBElement<TKorisnikUstanove> createObrazacSocijalnaZastita(TKorisnikUstanove value) {
        return new JAXBElement<TKorisnikUstanove>(_ObrazacSocijalnaZastita_QNAME, TKorisnikUstanove.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TSaglasan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "saglasnost", scope = Obrazac.class)
    public JAXBElement<TSaglasan> createObrazacSaglasnost(TSaglasan value) {
        return new JAXBElement<TSaglasan>(_ObrazacSaglasnost_QNAME, TSaglasan.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "imeRoditelja", scope = Obrazac.class)
    public JAXBElement<String> createObrazacImeRoditelja(String value) {
        return new JAXBElement<String>(_ObrazacImeRoditelja_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "grad", scope = Obrazac.class)
    public JAXBElement<String> createObrazacGrad(String value) {
        return new JAXBElement<String>(_ObrazacGrad_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAdresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "adresa", scope = Obrazac.class)
    public JAXBElement<TAdresa> createObrazacAdresa(TAdresa value) {
        return new JAXBElement<TAdresa>(_ObrazacAdresa_QNAME, TAdresa.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "e-mail", scope = Obrazac.class)
    public JAXBElement<String> createObrazacEMail(String value) {
        return new JAXBElement<String>(_ObrazacEMail_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "mobilni", scope = Obrazac.class)
    public JAXBElement<String> createObrazacMobilni(String value) {
        return new JAXBElement<String>(_ObrazacMobilni_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TZanimanjeZaposlenog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "zanimanje", scope = Obrazac.class)
    public JAXBElement<TZanimanjeZaposlenog> createObrazacZanimanje(TZanimanjeZaposlenog value) {
        return new JAXBElement<TZanimanjeZaposlenog>(_ObrazacZanimanje_QNAME, TZanimanjeZaposlenog.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "opstina", scope = Obrazac.class)
    public JAXBElement<String> createObrazacOpstina(String value) {
        return new JAXBElement<String>(_ObrazacOpstina_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "prezime", scope = Obrazac.class)
    public JAXBElement<String> createObrazacPrezime(String value) {
        return new JAXBElement<String>(_ObrazacPrezime_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "datum", scope = Obrazac.class)
    public JAXBElement<XMLGregorianCalendar> createObrazacDatum(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ObrazacDatum_QNAME, XMLGregorianCalendar.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "ime", scope = Obrazac.class)
    public JAXBElement<String> createObrazacIme(String value) {
        return new JAXBElement<String>(_ObrazacIme_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDrzavljanstvo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "drzavljanstvo", scope = Obrazac.class)
    public JAXBElement<TDrzavljanstvo> createObrazacDrzavljanstvo(TDrzavljanstvo value) {
        return new JAXBElement<TDrzavljanstvo>(_ObrazacDrzavljanstvo_QNAME, TDrzavljanstvo.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "datumRodjenja", scope = Obrazac.class)
    public JAXBElement<XMLGregorianCalendar> createObrazacDatumRodjenja(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ObrazacDatumRodjenja_QNAME, XMLGregorianCalendar.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TPol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "pol", scope = Obrazac.class)
    public JAXBElement<TPol> createObrazacPol(TPol value) {
        return new JAXBElement<TPol>(_ObrazacPol_QNAME, TPol.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TTipVakcina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "vakcina", scope = Obrazac.class)
    public JAXBElement<TTipVakcina> createObrazacVakcina(TTipVakcina value) {
        return new JAXBElement<TTipVakcina>(_ObrazacVakcina_QNAME, TTipVakcina.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "fiksni", scope = Obrazac.class)
    public JAXBElement<String> createObrazacFiksni(String value) {
        return new JAXBElement<String>(_ObrazacFiksni_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "naziv", scope = Obrazac.class)
    public JAXBElement<String> createObrazacNaziv(String value) {
        return new JAXBElement<String>(_ObrazacNaziv_QNAME, String.class, Obrazac.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRadniStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ftn.uns.ac.rs/obrazac", name = "radniStatus", scope = Obrazac.class)
    public JAXBElement<TRadniStatus> createObrazacRadniStatus(TRadniStatus value) {
        return new JAXBElement<TRadniStatus>(_ObrazacRadniStatus_QNAME, TRadniStatus.class, Obrazac.class, value);
    }

}
