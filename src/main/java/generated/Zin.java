//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.19 at 06:37:25 PM EET 
//


package generated;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	    "line"
	})
@XmlRootElement(name = "Zin")
public class Zin {

    @XmlAttribute(name = "zin_num", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String zinNum;
    @XmlAttribute(name = "eil_suma", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eilSuma;
    @XmlAttribute(name = "eil_num", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String eilNum;
    @XmlAttribute(name = "padal_kodas")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String padalKodas;
    @XmlAttribute(name = "imon_diena")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String imonDiena;
    @XmlAttribute(name = "mok_apyl")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String mokApyl;
    @XmlAttribute(name = "pasl_proc")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String paslProc;
    @XmlElement(name = "Line", required = true)
    protected List<Line> line;
    /**
     * Gets the value of the zinNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZinNum() {
        return zinNum;
    }

    /**
     * Sets the value of the zinNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZinNum(String value) {
        this.zinNum = value;
    }

    /**
     * Gets the value of the eilSuma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEilSuma() {
        return eilSuma;
    }

    /**
     * Sets the value of the eilSuma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEilSuma(String value) {
        this.eilSuma = value;
    }

    /**
     * Gets the value of the eilNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEilNum() {
        return eilNum;
    }

    /**
     * Sets the value of the eilNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEilNum(String value) {
        this.eilNum = value;
    }

    /**
     * Gets the value of the padalKodas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadalKodas() {
        return padalKodas;
    }

    /**
     * Sets the value of the padalKodas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadalKodas(String value) {
        this.padalKodas = value;
    }

    /**
     * Gets the value of the imonDiena property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImonDiena() {
        return imonDiena;
    }

    /**
     * Sets the value of the imonDiena property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImonDiena(String value) {
        this.imonDiena = value;
    }

    /**
     * Gets the value of the mokApyl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMokApyl() {
        return mokApyl;
    }

    /**
     * Sets the value of the mokApyl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMokApyl(String value) {
        this.mokApyl = value;
    }

    /**
     * Gets the value of the paslProc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaslProc() {
        return paslProc;
    }

    /**
     * Sets the value of the paslProc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaslProc(String value) {
        this.paslProc = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the line property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * 
     * 
     */
    public List<Line> getLine() {
        if (line == null) {
            line = new ArrayList<Line>();
        }
        return this.line;
    }

    
    
}
