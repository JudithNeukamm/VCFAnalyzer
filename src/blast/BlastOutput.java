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
    "blastOutputProgram",
    "blastOutputVersion",
    "blastOutputReference",
    "blastOutputDb",
    "blastOutputQueryID",
    "blastOutputQueryDef",
    "blastOutputQueryLen",
    "blastOutputQuerySeq",
    "blastOutputParam",
    "blastOutputIterations",
    "blastOutputMbstat"
})
@XmlRootElement(name = "BlastOutput")
public class BlastOutput {

    @XmlElement(name = "BlastOutput_program", required = true)
    protected String blastOutputProgram;
    @XmlElement(name = "BlastOutput_version", required = true)
    protected String blastOutputVersion;
    @XmlElement(name = "BlastOutput_reference", required = true)
    protected String blastOutputReference;
    @XmlElement(name = "BlastOutput_db", required = true)
    protected String blastOutputDb;
    @XmlElement(name = "BlastOutput_query-ID", required = true)
    protected String blastOutputQueryID;
    @XmlElement(name = "BlastOutput_query-def", required = true)
    protected String blastOutputQueryDef;
    @XmlElement(name = "BlastOutput_query-len", required = true)
    protected String blastOutputQueryLen;
    @XmlElement(name = "BlastOutput_query-seq")
    protected String blastOutputQuerySeq;
    @XmlElement(name = "BlastOutput_param", required = true)
    protected BlastOutputParam blastOutputParam;
    @XmlElement(name = "BlastOutput_iterations", required = true)
    protected BlastOutputIterations blastOutputIterations;
    @XmlElement(name = "BlastOutput_mbstat")
    protected BlastOutputMbstat blastOutputMbstat;

    /**
     * Ruft den Wert der blastOutputProgram-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputProgram() {
        return blastOutputProgram;
    }

    /**
     * Legt den Wert der blastOutputProgram-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputProgram(String value) {
        this.blastOutputProgram = value;
    }

    /**
     * Ruft den Wert der blastOutputVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputVersion() {
        return blastOutputVersion;
    }

    /**
     * Legt den Wert der blastOutputVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputVersion(String value) {
        this.blastOutputVersion = value;
    }

    /**
     * Ruft den Wert der blastOutputReference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputReference() {
        return blastOutputReference;
    }

    /**
     * Legt den Wert der blastOutputReference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputReference(String value) {
        this.blastOutputReference = value;
    }

    /**
     * Ruft den Wert der blastOutputDb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputDb() {
        return blastOutputDb;
    }

    /**
     * Legt den Wert der blastOutputDb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputDb(String value) {
        this.blastOutputDb = value;
    }

    /**
     * Ruft den Wert der blastOutputQueryID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQueryID() {
        return blastOutputQueryID;
    }

    /**
     * Legt den Wert der blastOutputQueryID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQueryID(String value) {
        this.blastOutputQueryID = value;
    }

    /**
     * Ruft den Wert der blastOutputQueryDef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQueryDef() {
        return blastOutputQueryDef;
    }

    /**
     * Legt den Wert der blastOutputQueryDef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQueryDef(String value) {
        this.blastOutputQueryDef = value;
    }

    /**
     * Ruft den Wert der blastOutputQueryLen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQueryLen() {
        return blastOutputQueryLen;
    }

    /**
     * Legt den Wert der blastOutputQueryLen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQueryLen(String value) {
        this.blastOutputQueryLen = value;
    }

    /**
     * Ruft den Wert der blastOutputQuerySeq-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlastOutputQuerySeq() {
        return blastOutputQuerySeq;
    }

    /**
     * Legt den Wert der blastOutputQuerySeq-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlastOutputQuerySeq(String value) {
        this.blastOutputQuerySeq = value;
    }

    /**
     * Ruft den Wert der blastOutputParam-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlastOutputParam }
     *     
     */
    public BlastOutputParam getBlastOutputParam() {
        return blastOutputParam;
    }

    /**
     * Legt den Wert der blastOutputParam-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlastOutputParam }
     *     
     */
    public void setBlastOutputParam(BlastOutputParam value) {
        this.blastOutputParam = value;
    }

    /**
     * Ruft den Wert der blastOutputIterations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlastOutputIterations }
     *     
     */
    public BlastOutputIterations getBlastOutputIterations() {
        return blastOutputIterations;
    }

    /**
     * Legt den Wert der blastOutputIterations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlastOutputIterations }
     *     
     */
    public void setBlastOutputIterations(BlastOutputIterations value) {
        this.blastOutputIterations = value;
    }

    /**
     * Ruft den Wert der blastOutputMbstat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BlastOutputMbstat }
     *     
     */
    public BlastOutputMbstat getBlastOutputMbstat() {
        return blastOutputMbstat;
    }

    /**
     * Legt den Wert der blastOutputMbstat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BlastOutputMbstat }
     *     
     */
    public void setBlastOutputMbstat(BlastOutputMbstat value) {
        this.blastOutputMbstat = value;
    }

}
