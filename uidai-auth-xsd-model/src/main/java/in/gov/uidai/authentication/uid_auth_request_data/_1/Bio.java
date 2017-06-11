//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.06 at 04:38:08 PM IST 
//


package in.gov.uidai.authentication.uid_auth_request_data._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for Bio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bio">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *       &lt;attribute name="type" use="required" type="{http://www.uidai.gov.in/authentication/uid-auth-request-data/1.0}bioMetricType" />
 *       &lt;attribute name="posh" use="required" type="{http://www.uidai.gov.in/authentication/uid-auth-request-data/1.0}BiometricPosition" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bio", propOrder = {
    "value"
})
public class Bio {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(required = true)
    protected BioMetricType type;
    @XmlAttribute(required = true)
    protected BiometricPosition posh;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = ((byte[]) value);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BioMetricType }
     *     
     */
    public BioMetricType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BioMetricType }
     *     
     */
    public void setType(BioMetricType value) {
        this.type = value;
    }

    /**
     * Gets the value of the posh property.
     * 
     * @return
     *     possible object is
     *     {@link BiometricPosition }
     *     
     */
    public BiometricPosition getPosh() {
        return posh;
    }

    /**
     * Sets the value of the posh property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiometricPosition }
     *     
     */
    public void setPosh(BiometricPosition value) {
        this.posh = value;
    }

}
