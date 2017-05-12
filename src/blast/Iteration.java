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
    "iterationIterNum",
    "iterationQueryID",
    "iterationQueryDef",
    "iterationQueryLen",
    "iterationHits",
    "iterationStat",
    "iterationMessage"
})
@XmlRootElement(name = "Iteration")
public class Iteration {

    @XmlElement(name = "Iteration_iter-num", required = true)
    protected String iterationIterNum;
    @XmlElement(name = "Iteration_query-ID")
    protected String iterationQueryID;
    @XmlElement(name = "Iteration_query-def")
    protected String iterationQueryDef;
    @XmlElement(name = "Iteration_query-len")
    protected String iterationQueryLen;
    @XmlElement(name = "Iteration_hits")
    protected IterationHits iterationHits;
    @XmlElement(name = "Iteration_stat")
    protected IterationStat iterationStat;
    @XmlElement(name = "Iteration_message")
    protected String iterationMessage;

    /**
     * Ruft den Wert der iterationIterNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationIterNum() {
        return iterationIterNum;
    }

    /**
     * Legt den Wert der iterationIterNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationIterNum(String value) {
        this.iterationIterNum = value;
    }

    /**
     * Ruft den Wert der iterationQueryID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationQueryID() {
        return iterationQueryID;
    }

    /**
     * Legt den Wert der iterationQueryID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationQueryID(String value) {
        this.iterationQueryID = value;
    }

    /**
     * Ruft den Wert der iterationQueryDef-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationQueryDef() {
        return iterationQueryDef;
    }

    /**
     * Legt den Wert der iterationQueryDef-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationQueryDef(String value) {
        this.iterationQueryDef = value;
    }

    /**
     * Ruft den Wert der iterationQueryLen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationQueryLen() {
        return iterationQueryLen;
    }

    /**
     * Legt den Wert der iterationQueryLen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationQueryLen(String value) {
        this.iterationQueryLen = value;
    }

    /**
     * Ruft den Wert der iterationHits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IterationHits }
     *     
     */
    public IterationHits getIterationHits() {
        return iterationHits;
    }

    /**
     * Legt den Wert der iterationHits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IterationHits }
     *     
     */
    public void setIterationHits(IterationHits value) {
        this.iterationHits = value;
    }

    /**
     * Ruft den Wert der iterationStat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IterationStat }
     *     
     */
    public IterationStat getIterationStat() {
        return iterationStat;
    }

    /**
     * Legt den Wert der iterationStat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IterationStat }
     *     
     */
    public void setIterationStat(IterationStat value) {
        this.iterationStat = value;
    }

    /**
     * Ruft den Wert der iterationMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIterationMessage() {
        return iterationMessage;
    }

    /**
     * Legt den Wert der iterationMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIterationMessage(String value) {
        this.iterationMessage = value;
    }

}
