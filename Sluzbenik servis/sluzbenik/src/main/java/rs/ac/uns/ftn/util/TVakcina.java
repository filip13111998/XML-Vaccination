//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.09 at 05:44:14 pm CET 
//


package rs.ac.uns.ftn.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TVakcina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TVakcina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brojDoze" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vakcina" type="{http://ftn.uns.ac.rs/util}TTipVakcina"/>
 *         &lt;element name="proizvodjac" type="{http://ftn.uns.ac.rs/util}TProizvodjac"/>
 *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="zdrastvenaUstanova" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TVakcina", propOrder = {
    "brojDoze",
    "vakcina",
    "proizvodjac",
    "datum",
    "zdrastvenaUstanova"
})
public class TVakcina {

    @XmlElement(required = true)
    protected String brojDoze;
    @XmlElement(required = true)
    protected TTipVakcina vakcina;
    @XmlElement(required = true)
    protected TProizvodjac proizvodjac;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(required = true)
    protected String zdrastvenaUstanova;

    /**
     * Gets the value of the brojDoze property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojDoze() {
        return brojDoze;
    }

    /**
     * Sets the value of the brojDoze property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojDoze(String value) {
        this.brojDoze = value;
    }

    /**
     * Gets the value of the vakcina property.
     * 
     * @return
     *     possible object is
     *     {@link TTipVakcina }
     *     
     */
    public TTipVakcina getVakcina() {
        return vakcina;
    }

    /**
     * Sets the value of the vakcina property.
     * 
     * @param value
     *     allowed object is
     *     {@link TTipVakcina }
     *     
     */
    public void setVakcina(TTipVakcina value) {
        this.vakcina = value;
    }

    /**
     * Gets the value of the proizvodjac property.
     * 
     * @return
     *     possible object is
     *     {@link TProizvodjac }
     *     
     */
    public TProizvodjac getProizvodjac() {
        return proizvodjac;
    }

    /**
     * Sets the value of the proizvodjac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TProizvodjac }
     *     
     */
    public void setProizvodjac(TProizvodjac value) {
        this.proizvodjac = value;
    }

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the zdrastvenaUstanova property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZdrastvenaUstanova() {
        return zdrastvenaUstanova;
    }

    /**
     * Sets the value of the zdrastvenaUstanova property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZdrastvenaUstanova(String value) {
        this.zdrastvenaUstanova = value;
    }

}
