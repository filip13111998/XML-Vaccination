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
 * <p>Java class for TZanimanjeZaposlenog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TZanimanjeZaposlenog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="zdrastvenaZastita" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="socijalnaZastita" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="prosveta" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="mup" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vojska" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="drugo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TZanimanjeZaposlenog", propOrder = {
    "zdrastvenaZastita",
    "socijalnaZastita",
    "prosveta",
    "mup",
    "vojska",
    "drugo"
})
public class TZanimanjeZaposlenog {

    protected Boolean zdrastvenaZastita;
    protected Boolean socijalnaZastita;
    protected Boolean prosveta;
    protected Boolean mup;
    protected Boolean vojska;
    protected Boolean drugo;

    /**
     * Gets the value of the zdrastvenaZastita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isZdrastvenaZastita() {
        return zdrastvenaZastita;
    }

    /**
     * Sets the value of the zdrastvenaZastita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setZdrastvenaZastita(Boolean value) {
        this.zdrastvenaZastita = value;
    }

    /**
     * Gets the value of the socijalnaZastita property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSocijalnaZastita() {
        return socijalnaZastita;
    }

    /**
     * Sets the value of the socijalnaZastita property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSocijalnaZastita(Boolean value) {
        this.socijalnaZastita = value;
    }

    /**
     * Gets the value of the prosveta property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProsveta() {
        return prosveta;
    }

    /**
     * Sets the value of the prosveta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProsveta(Boolean value) {
        this.prosveta = value;
    }

    /**
     * Gets the value of the mup property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMup() {
        return mup;
    }

    /**
     * Sets the value of the mup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMup(Boolean value) {
        this.mup = value;
    }

    /**
     * Gets the value of the vojska property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVojska() {
        return vojska;
    }

    /**
     * Sets the value of the vojska property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVojska(Boolean value) {
        this.vojska = value;
    }

    /**
     * Gets the value of the drugo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrugo() {
        return drugo;
    }

    /**
     * Sets the value of the drugo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDrugo(Boolean value) {
        this.drugo = value;
    }

}
