//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 04:38:08 PM IST 
//


package in.gov.uidai.authentication.common.types._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Meta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Meta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="udc" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="pip" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="60"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fdc" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="idc" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="lot" use="required" type="{http://www.uidai.gov.in/authentication/common/types/1.0}LocationType" />
 *       &lt;attribute name="lov" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meta")
public class Meta {

    @XmlAttribute(required = true)
    protected String udc;
    @XmlAttribute(required = true)
    protected String pip;
    @XmlAttribute(required = true)
    protected String fdc;
    @XmlAttribute(required = true)
    protected String idc;
    @XmlAttribute(required = true)
    protected LocationType lot;
    @XmlAttribute(required = true)
    protected String lov;

    /**
     * Gets the value of the udc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUdc() {
        return udc;
    }

    /**
     * Sets the value of the udc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUdc(String value) {
        this.udc = value;
    }

    /**
     * Gets the value of the pip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPip() {
        return pip;
    }

    /**
     * Sets the value of the pip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPip(String value) {
        this.pip = value;
    }

    /**
     * Gets the value of the fdc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFdc() {
        return fdc;
    }

    /**
     * Sets the value of the fdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFdc(String value) {
        this.fdc = value;
    }

    /**
     * Gets the value of the idc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdc() {
        return idc;
    }

    /**
     * Sets the value of the idc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdc(String value) {
        this.idc = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setLot(LocationType value) {
        this.lot = value;
    }

    /**
     * Gets the value of the lov property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLov() {
        return lov;
    }

    /**
     * Sets the value of the lov property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLov(String value) {
        this.lov = value;
    }

}
