//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.09 at 05:44:14 pm CET 
//


package rs.ac.uns.ftn.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRadniStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRadniStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="zaposlen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nezaposlen" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="penzioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ucenik" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="student" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRadniStatus", propOrder = {
    "zaposlen",
    "nezaposlen",
    "penzioner",
    "ucenik",
    "student",
    "dete"
})
public class TRadniStatus {

    protected Boolean zaposlen;
    protected Boolean nezaposlen;
    protected Boolean penzioner;
    protected Boolean ucenik;
    protected Boolean student;
    protected Boolean dete;

    /**
     * Gets the value of the zaposlen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZaposlen() {
        return zaposlen;
    }

    /**
     * Sets the value of the zaposlen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZaposlen(Boolean value) {
        this.zaposlen = value;
    }

    /**
     * Gets the value of the nezaposlen property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNezaposlen() {
        return nezaposlen;
    }

    /**
     * Sets the value of the nezaposlen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNezaposlen(Boolean value) {
        this.nezaposlen = value;
    }

    /**
     * Gets the value of the penzioner property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPenzioner() {
        return penzioner;
    }

    /**
     * Sets the value of the penzioner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPenzioner(Boolean value) {
        this.penzioner = value;
    }

    /**
     * Gets the value of the ucenik property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUcenik() {
        return ucenik;
    }

    /**
     * Sets the value of the ucenik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUcenik(Boolean value) {
        this.ucenik = value;
    }

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStudent(Boolean value) {
        this.student = value;
    }

    /**
     * Gets the value of the dete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDete() {
        return dete;
    }

    /**
     * Sets the value of the dete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDete(Boolean value) {
        this.dete = value;
    }

}
