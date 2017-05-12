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
    "parametersMatrix",
    "parametersExpect",
    "parametersInclude",
    "parametersScMatch",
    "parametersScMismatch",
    "parametersGapOpen",
    "parametersGapExtend",
    "parametersFilter",
    "parametersPattern",
    "parametersEntrezQuery"
})
@XmlRootElement(name = "Parameters")
public class Parameters {

    @XmlElement(name = "Parameters_matrix")
    protected String parametersMatrix;
    @XmlElement(name = "Parameters_expect", required = true)
    protected String parametersExpect;
    @XmlElement(name = "Parameters_include")
    protected String parametersInclude;
    @XmlElement(name = "Parameters_sc-match")
    protected String parametersScMatch;
    @XmlElement(name = "Parameters_sc-mismatch")
    protected String parametersScMismatch;
    @XmlElement(name = "Parameters_gap-open", required = true)
    protected String parametersGapOpen;
    @XmlElement(name = "Parameters_gap-extend", required = true)
    protected String parametersGapExtend;
    @XmlElement(name = "Parameters_filter")
    protected String parametersFilter;
    @XmlElement(name = "Parameters_pattern")
    protected String parametersPattern;
    @XmlElement(name = "Parameters_entrez-query")
    protected String parametersEntrezQuery;

    /**
     * Ruft den Wert der parametersMatrix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersMatrix() {
        return parametersMatrix;
    }

    /**
     * Legt den Wert der parametersMatrix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersMatrix(String value) {
        this.parametersMatrix = value;
    }

    /**
     * Ruft den Wert der parametersExpect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersExpect() {
        return parametersExpect;
    }

    /**
     * Legt den Wert der parametersExpect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersExpect(String value) {
        this.parametersExpect = value;
    }

    /**
     * Ruft den Wert der parametersInclude-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersInclude() {
        return parametersInclude;
    }

    /**
     * Legt den Wert der parametersInclude-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersInclude(String value) {
        this.parametersInclude = value;
    }

    /**
     * Ruft den Wert der parametersScMatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersScMatch() {
        return parametersScMatch;
    }

    /**
     * Legt den Wert der parametersScMatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersScMatch(String value) {
        this.parametersScMatch = value;
    }

    /**
     * Ruft den Wert der parametersScMismatch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersScMismatch() {
        return parametersScMismatch;
    }

    /**
     * Legt den Wert der parametersScMismatch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersScMismatch(String value) {
        this.parametersScMismatch = value;
    }

    /**
     * Ruft den Wert der parametersGapOpen-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersGapOpen() {
        return parametersGapOpen;
    }

    /**
     * Legt den Wert der parametersGapOpen-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersGapOpen(String value) {
        this.parametersGapOpen = value;
    }

    /**
     * Ruft den Wert der parametersGapExtend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersGapExtend() {
        return parametersGapExtend;
    }

    /**
     * Legt den Wert der parametersGapExtend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersGapExtend(String value) {
        this.parametersGapExtend = value;
    }

    /**
     * Ruft den Wert der parametersFilter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersFilter() {
        return parametersFilter;
    }

    /**
     * Legt den Wert der parametersFilter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersFilter(String value) {
        this.parametersFilter = value;
    }

    /**
     * Ruft den Wert der parametersPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersPattern() {
        return parametersPattern;
    }

    /**
     * Legt den Wert der parametersPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersPattern(String value) {
        this.parametersPattern = value;
    }

    /**
     * Ruft den Wert der parametersEntrezQuery-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersEntrezQuery() {
        return parametersEntrezQuery;
    }

    /**
     * Legt den Wert der parametersEntrezQuery-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersEntrezQuery(String value) {
        this.parametersEntrezQuery = value;
    }

}
