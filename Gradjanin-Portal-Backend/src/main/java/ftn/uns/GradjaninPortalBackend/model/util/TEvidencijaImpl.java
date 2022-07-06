//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.09 at 12:02:54 PM CET 
//


package ftn.uns.GradjaninPortalBackend.model.util;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TEvidencijaImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TEvidencijaImpl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zdrastvenaUstanova" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="punkt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="imePRezime" type="{http://ftn.uns.ac.rs/util}TImePrezime"/>
 *         &lt;element name="faksimil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="telefon" type="{http://ftn.uns.ac.rs/util}TMobilni"/>
 *         &lt;element name="vakcina" type="{http://ftn.uns.ac.rs/util}TPrimljenaVakcina" maxOccurs="unbounded"/>
 *         &lt;element name="datumUtvrdjivanja" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dijagnoza" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="komisija" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEvidencijaImpl", propOrder = {
    "zdrastvenaUstanova",
    "punkt",
    "imePRezime",
    "faksimil",
    "telefon",
    "vakcina",
    "datumUtvrdjivanja",
    "dijagnoza",
    "komisija"
})
public class TEvidencijaImpl {

    @XmlElement(required = true)
    protected String zdrastvenaUstanova;
    @XmlElement(required = true)
    protected String punkt;
    @XmlElement(required = true)
    protected TImePrezime imePRezime;
    @XmlElement(required = true)
    protected String faksimil;
    @XmlElement(required = true)
    protected String telefon;
    @XmlElement(required = true)
    protected List<TPrimljenaVakcina> vakcina;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected String datumUtvrdjivanja;
    @XmlElement(required = true)
    protected String dijagnoza;
    @XmlElement(required = true)
    protected String komisija;

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

    /**
     * Gets the value of the punkt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunkt() {
        return punkt;
    }

    /**
     * Sets the value of the punkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunkt(String value) {
        this.punkt = value;
    }

    /**
     * Gets the value of the imePRezime property.
     * 
     * @return
     *     possible object is
     *     {@link TImePrezime }
     *     
     */
    public TImePrezime getImePRezime() {
        return imePRezime;
    }

    /**
     * Sets the value of the imePRezime property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImePrezime }
     *     
     */
    public void setImePRezime(TImePrezime value) {
        this.imePRezime = value;
    }

    /**
     * Gets the value of the faksimil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaksimil() {
        return faksimil;
    }

    /**
     * Sets the value of the faksimil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaksimil(String value) {
        this.faksimil = value;
    }

    /**
     * Gets the value of the telefon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     * Sets the value of the telefon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefon(String value) {
        this.telefon = value;
    }

    /**
     * Gets the value of the vakcina property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vakcina property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVakcina().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TPrimljenaVakcina }
     * 
     * 
     */
    public List<TPrimljenaVakcina> getVakcina() {
        if (vakcina == null) {
            vakcina = new ArrayList<TPrimljenaVakcina>();
        }
        return this.vakcina;
    }

    /**
     * Gets the value of the datumUtvrdjivanja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDatumUtvrdjivanja() {
        return datumUtvrdjivanja;
    }

    /**
     * Sets the value of the datumUtvrdjivanja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumUtvrdjivanja(String value) {
        this.datumUtvrdjivanja = value;
    }

    /**
     * Gets the value of the dijagnoza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDijagnoza() {
        return dijagnoza;
    }

    /**
     * Sets the value of the dijagnoza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDijagnoza(String value) {
        this.dijagnoza = value;
    }

    /**
     * Gets the value of the komisija property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKomisija() {
        return komisija;
    }

    /**
     * Sets the value of the komisija property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKomisija(String value) {
        this.komisija = value;
    }

}
