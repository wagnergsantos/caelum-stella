//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.10.22 at 06:02:18 PM BRST 
//


package br.com.caelum.stella.nfe.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetEnviNFe", propOrder = {
    "tpAmb",
    "verAplic",
    "cStat",
    "xMotivo",
    "cuf",
    "infRec"
})
public class TRetEnviNFe {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tpAmb;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String verAplic;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cStat;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String xMotivo;
    @XmlElement(name = "cUF", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cuf;
    protected TRetEnviNFe.InfRec infRec;
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    
    public String getTpAmb() {
        return tpAmb;
    }

    
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    
    public String getVerAplic() {
        return verAplic;
    }

    
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    
    public String getCStat() {
        return cStat;
    }

    
    public void setCStat(String value) {
        this.cStat = value;
    }

    
    public String getXMotivo() {
        return xMotivo;
    }

    
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    
    public String getCUF() {
        return cuf;
    }

    
    public void setCUF(String value) {
        this.cuf = value;
    }

    
    public TRetEnviNFe.InfRec getInfRec() {
        return infRec;
    }

    
    public void setInfRec(TRetEnviNFe.InfRec value) {
        this.infRec = value;
    }

    
    public String getVersao() {
        return versao;
    }

    
    public void setVersao(String value) {
        this.versao = value;
    }


    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nRec",
        "dhRecbto",
        "tMed"
    })
    public static class InfRec {

        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String nRec;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dhRecbto;
        @XmlElement(required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String tMed;

        
        public String getNRec() {
            return nRec;
        }

        
        public void setNRec(String value) {
            this.nRec = value;
        }

        
        public XMLGregorianCalendar getDhRecbto() {
            return dhRecbto;
        }

        
        public void setDhRecbto(XMLGregorianCalendar value) {
            this.dhRecbto = value;
        }

        
        public String getTMed() {
            return tMed;
        }

        
        public void setTMed(String value) {
            this.tMed = value;
        }

    }

}