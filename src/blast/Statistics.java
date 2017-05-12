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
    "statisticsDbNum",
    "statisticsDbLen",
    "statisticsHspLen",
    "statisticsEffSpace",
    "statisticsKappa",
    "statisticsLambda",
    "statisticsEntropy"
})
@XmlRootElement(name = "Statistics")
public class Statistics {

    @XmlElement(name = "Statistics_db-num", required = true)
    protected String statisticsDbNum;
    @XmlElement(name = "Statistics_db-len", required = true)
    protected String statisticsDbLen;
    @XmlElement(name = "Statistics_hsp-len", required = true)
    protected String statisticsHspLen;
    @XmlElement(name = "Statistics_eff-space", required = true)
    protected String statisticsEffSpace;
    @XmlElement(name = "Statistics_kappa", required = true)
    protected String statisticsKappa;
    @XmlElement(name = "Statistics_lambda", required = true)
    protected String statisticsLambda;
    @XmlElement(name = "Statistics_entropy", required = true)
    protected String statisticsEntropy;

    /**
     * Ruft den Wert der statisticsDbNum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDbNum() {
        return statisticsDbNum;
    }

    /**
     * Legt den Wert der statisticsDbNum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDbNum(String value) {
        this.statisticsDbNum = value;
    }

    /**
     * Ruft den Wert der statisticsDbLen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsDbLen() {
        return statisticsDbLen;
    }

    /**
     * Legt den Wert der statisticsDbLen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsDbLen(String value) {
        this.statisticsDbLen = value;
    }

    /**
     * Ruft den Wert der statisticsHspLen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsHspLen() {
        return statisticsHspLen;
    }

    /**
     * Legt den Wert der statisticsHspLen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsHspLen(String value) {
        this.statisticsHspLen = value;
    }

    /**
     * Ruft den Wert der statisticsEffSpace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsEffSpace() {
        return statisticsEffSpace;
    }

    /**
     * Legt den Wert der statisticsEffSpace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsEffSpace(String value) {
        this.statisticsEffSpace = value;
    }

    /**
     * Ruft den Wert der statisticsKappa-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsKappa() {
        return statisticsKappa;
    }

    /**
     * Legt den Wert der statisticsKappa-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsKappa(String value) {
        this.statisticsKappa = value;
    }

    /**
     * Ruft den Wert der statisticsLambda-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsLambda() {
        return statisticsLambda;
    }

    /**
     * Legt den Wert der statisticsLambda-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsLambda(String value) {
        this.statisticsLambda = value;
    }

    /**
     * Ruft den Wert der statisticsEntropy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsEntropy() {
        return statisticsEntropy;
    }

    /**
     * Legt den Wert der statisticsEntropy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsEntropy(String value) {
        this.statisticsEntropy = value;
    }

}
