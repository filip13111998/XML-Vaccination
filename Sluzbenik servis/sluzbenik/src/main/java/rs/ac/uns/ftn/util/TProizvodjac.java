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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TProizvodjac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TProizvodjac">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Pfizer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Sinopharm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Gamaleya" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AstraZeneca" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Moderna" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="BiloKo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProizvodjac", propOrder = {
    "pfizer",
    "sinopharm",
    "gamaleya",
    "astraZeneca",
    "moderna",
    "biloKo"
})
public class TProizvodjac {

    @XmlElement(name = "Pfizer")
    protected Boolean pfizer;
    @XmlElement(name = "Sinopharm")
    protected Boolean sinopharm;
    @XmlElement(name = "Gamaleya")
    protected Boolean gamaleya;
    @XmlElement(name = "AstraZeneca")
    protected Boolean astraZeneca;
    @XmlElement(name = "Moderna")
    protected Boolean moderna;
    @XmlElement(name = "BiloKo")
    protected Boolean biloKo;

    /**
     * Gets the value of the pfizer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPfizer() {
        return pfizer;
    }

    /**
     * Sets the value of the pfizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPfizer(Boolean value) {
        this.pfizer = value;
    }

    /**
     * Gets the value of the sinopharm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSinopharm() {
        return sinopharm;
    }

    /**
     * Sets the value of the sinopharm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSinopharm(Boolean value) {
        this.sinopharm = value;
    }

    /**
     * Gets the value of the gamaleya property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGamaleya() {
        return gamaleya;
    }

    /**
     * Sets the value of the gamaleya property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGamaleya(Boolean value) {
        this.gamaleya = value;
    }

    /**
     * Gets the value of the astraZeneca property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAstraZeneca() {
        return astraZeneca;
    }

    /**
     * Sets the value of the astraZeneca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAstraZeneca(Boolean value) {
        this.astraZeneca = value;
    }

    /**
     * Gets the value of the moderna property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModerna() {
        return moderna;
    }

    /**
     * Sets the value of the moderna property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModerna(Boolean value) {
        this.moderna = value;
    }

    /**
     * Gets the value of the biloKo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBiloKo() {
        return biloKo;
    }

    /**
     * Sets the value of the biloKo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBiloKo(Boolean value) {
        this.biloKo = value;
    }

}
