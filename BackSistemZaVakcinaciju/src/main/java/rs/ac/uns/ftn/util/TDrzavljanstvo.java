//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.09 at 12:02:54 PM CET 
//


package rs.ac.uns.ftn.util;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TDrzavljanstvo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDrzavljanstvo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="stbija" type="{http://ftn.uns.ac.rs/util}TSrbija"/>
 *         &lt;element name="stranac" type="{http://ftn.uns.ac.rs/util}TStranac"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDrzavljanstvo", propOrder = {
    "srbija",
    "stranac"
})
public class TDrzavljanstvo {

    protected TSrbija srbija;
    protected TStranac stranac;

    /**
     * Gets the value of the stbija property.
     * 
     * @return
     *     possible object is
     *     {@link TSrbija }
     *     
     */
    public TSrbija getSrbija() {
        return srbija;
    }

    /**
     * Sets the value of the stbija property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSrbija }
     *     
     */
    public void setSrbija(TSrbija value) {
        this.srbija = value;
    }

    /**
     * Gets the value of the stranac property.
     * 
     * @return
     *     possible object is
     *     {@link TStranac }
     *     
     */
    public TStranac getStranac() {
        return stranac;
    }

    /**
     * Sets the value of the stranac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStranac }
     *     
     */
    public void setStranac(TStranac value) {
        this.stranac = value;
    }

}
