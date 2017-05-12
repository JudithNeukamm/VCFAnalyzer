//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2017.05.06 um 10:58:55 AM CEST 
//


package blast;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hitNum",
    "hitId",
    "hitDef",
    "hitAccession",
    "hitLen",
    "hitHsps"
})
@XmlRootElement(name = "Hit")
public class Hit {

    @XmlElement(name = "Hit_num", required = true)
    protected String hitNum;
    @XmlElement(name = "Hit_id", required = true)
    protected String hitId;
    @XmlElement(name = "Hit_def", required = true)
    protected String hitDef;
    @XmlElement(name = "Hit_accession", required = true)
    protected String hitAccession;
    @XmlElement(name = "Hit_len", required = true)
    protected String hitLen;
    @XmlElement(name = "Hit_hsps")
    protected HitHsps hitHsps;

    /**
     * Ruft den Wert der hitNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitNum() {
        return hitNum;
    }

    /**
     * Legt den Wert der hitNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitNum(String value) {
        this.hitNum = value;
    }

    /**
     * Ruft den Wert der hitId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitId() {
        return hitId;
    }

    /**
     * Legt den Wert der hitId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitId(String value) {
        this.hitId = value;
    }

    /**
     * Ruft den Wert der hitDef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitDef() {
        return hitDef;
    }

    /**
     * Legt den Wert der hitDef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitDef(String value) {
        this.hitDef = value;
    }

    /**
     * Ruft den Wert der hitAccession-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitAccession() {
        return hitAccession;
    }

    /**
     * Legt den Wert der hitAccession-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitAccession(String value) {
        this.hitAccession = value;
    }

    /**
     * Ruft den Wert der hitLen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHitLen() {
        return hitLen;
    }

    /**
     * Legt den Wert der hitLen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHitLen(String value) {
        this.hitLen = value;
    }

    /**
     * Ruft den Wert der hitHsps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HitHsps }
     *     
     */
    public HitHsps getHitHsps() {
        return hitHsps;
    }

    /**
     * Legt den Wert der hitHsps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HitHsps }
     *     
     */
    public void setHitHsps(HitHsps value) {
        this.hitHsps = value;
    }

}
