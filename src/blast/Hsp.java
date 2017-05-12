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
    "hspNum",
    "hspBitScore",
    "hspScore",
    "hspEvalue",
    "hspQueryFrom",
    "hspQueryTo",
    "hspHitFrom",
    "hspHitTo",
    "hspPatternFrom",
    "hspPatternTo",
    "hspQueryFrame",
    "hspHitFrame",
    "hspIdentity",
    "hspPositive",
    "hspGaps",
    "hspAlignLen",
    "hspDensity",
    "hspQseq",
    "hspHseq",
    "hspMidline"
})
@XmlRootElement(name = "Hsp")
public class Hsp {

    @XmlElement(name = "Hsp_num", required = true)
    protected String hspNum;
    @XmlElement(name = "Hsp_bit-score", required = true)
    protected String hspBitScore;
    @XmlElement(name = "Hsp_score", required = true)
    protected String hspScore;
    @XmlElement(name = "Hsp_evalue", required = true)
    protected String hspEvalue;
    @XmlElement(name = "Hsp_query-from", required = true)
    protected String hspQueryFrom;
    @XmlElement(name = "Hsp_query-to", required = true)
    protected String hspQueryTo;
    @XmlElement(name = "Hsp_hit-from", required = true)
    protected String hspHitFrom;
    @XmlElement(name = "Hsp_hit-to", required = true)
    protected String hspHitTo;
    @XmlElement(name = "Hsp_pattern-from")
    protected String hspPatternFrom;
    @XmlElement(name = "Hsp_pattern-to")
    protected String hspPatternTo;
    @XmlElement(name = "Hsp_query-frame")
    protected String hspQueryFrame;
    @XmlElement(name = "Hsp_hit-frame")
    protected String hspHitFrame;
    @XmlElement(name = "Hsp_identity")
    protected String hspIdentity;
    @XmlElement(name = "Hsp_positive")
    protected String hspPositive;
    @XmlElement(name = "Hsp_gaps")
    protected String hspGaps;
    @XmlElement(name = "Hsp_align-len")
    protected String hspAlignLen;
    @XmlElement(name = "Hsp_density")
    protected String hspDensity;
    @XmlElement(name = "Hsp_qseq", required = true)
    protected String hspQseq;
    @XmlElement(name = "Hsp_hseq", required = true)
    protected String hspHseq;
    @XmlElement(name = "Hsp_midline")
    protected String hspMidline;

    /**
     * Ruft den Wert der hspNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspNum() {
        return hspNum;
    }

    /**
     * Legt den Wert der hspNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspNum(String value) {
        this.hspNum = value;
    }

    /**
     * Ruft den Wert der hspBitScore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspBitScore() {
        return hspBitScore;
    }

    /**
     * Legt den Wert der hspBitScore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspBitScore(String value) {
        this.hspBitScore = value;
    }

    /**
     * Ruft den Wert der hspScore-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspScore() {
        return hspScore;
    }

    /**
     * Legt den Wert der hspScore-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspScore(String value) {
        this.hspScore = value;
    }

    /**
     * Ruft den Wert der hspEvalue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspEvalue() {
        return hspEvalue;
    }

    /**
     * Legt den Wert der hspEvalue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspEvalue(String value) {
        this.hspEvalue = value;
    }

    /**
     * Ruft den Wert der hspQueryFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQueryFrom() {
        return hspQueryFrom;
    }

    /**
     * Legt den Wert der hspQueryFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQueryFrom(String value) {
        this.hspQueryFrom = value;
    }

    /**
     * Ruft den Wert der hspQueryTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQueryTo() {
        return hspQueryTo;
    }

    /**
     * Legt den Wert der hspQueryTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQueryTo(String value) {
        this.hspQueryTo = value;
    }

    /**
     * Ruft den Wert der hspHitFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHitFrom() {
        return hspHitFrom;
    }

    /**
     * Legt den Wert der hspHitFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHitFrom(String value) {
        this.hspHitFrom = value;
    }

    /**
     * Ruft den Wert der hspHitTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHitTo() {
        return hspHitTo;
    }

    /**
     * Legt den Wert der hspHitTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHitTo(String value) {
        this.hspHitTo = value;
    }

    /**
     * Ruft den Wert der hspPatternFrom-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspPatternFrom() {
        return hspPatternFrom;
    }

    /**
     * Legt den Wert der hspPatternFrom-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspPatternFrom(String value) {
        this.hspPatternFrom = value;
    }

    /**
     * Ruft den Wert der hspPatternTo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspPatternTo() {
        return hspPatternTo;
    }

    /**
     * Legt den Wert der hspPatternTo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspPatternTo(String value) {
        this.hspPatternTo = value;
    }

    /**
     * Ruft den Wert der hspQueryFrame-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQueryFrame() {
        return hspQueryFrame;
    }

    /**
     * Legt den Wert der hspQueryFrame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQueryFrame(String value) {
        this.hspQueryFrame = value;
    }

    /**
     * Ruft den Wert der hspHitFrame-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHitFrame() {
        return hspHitFrame;
    }

    /**
     * Legt den Wert der hspHitFrame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHitFrame(String value) {
        this.hspHitFrame = value;
    }

    /**
     * Ruft den Wert der hspIdentity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspIdentity() {
        return hspIdentity;
    }

    /**
     * Legt den Wert der hspIdentity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspIdentity(String value) {
        this.hspIdentity = value;
    }

    /**
     * Ruft den Wert der hspPositive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspPositive() {
        return hspPositive;
    }

    /**
     * Legt den Wert der hspPositive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspPositive(String value) {
        this.hspPositive = value;
    }

    /**
     * Ruft den Wert der hspGaps-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspGaps() {
        return hspGaps;
    }

    /**
     * Legt den Wert der hspGaps-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspGaps(String value) {
        this.hspGaps = value;
    }

    /**
     * Ruft den Wert der hspAlignLen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspAlignLen() {
        return hspAlignLen;
    }

    /**
     * Legt den Wert der hspAlignLen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspAlignLen(String value) {
        this.hspAlignLen = value;
    }

    /**
     * Ruft den Wert der hspDensity-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspDensity() {
        return hspDensity;
    }

    /**
     * Legt den Wert der hspDensity-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspDensity(String value) {
        this.hspDensity = value;
    }

    /**
     * Ruft den Wert der hspQseq-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspQseq() {
        return hspQseq;
    }

    /**
     * Legt den Wert der hspQseq-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspQseq(String value) {
        this.hspQseq = value;
    }

    /**
     * Ruft den Wert der hspHseq-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspHseq() {
        return hspHseq;
    }

    /**
     * Legt den Wert der hspHseq-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspHseq(String value) {
        this.hspHseq = value;
    }

    /**
     * Ruft den Wert der hspMidline-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHspMidline() {
        return hspMidline;
    }

    /**
     * Legt den Wert der hspMidline-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHspMidline(String value) {
        this.hspMidline = value;
    }

}
