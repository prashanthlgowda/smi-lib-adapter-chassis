//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}m1000eSensorInfoBase">
 *       &lt;sequence>
 *         &lt;element name="Sensor_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UW" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sensorType",
    "lc",
    "uc",
    "lw",
    "uw"
})
@XmlRootElement(name = "m1000eSensorInfoWithC")
public class M1000ESensorInfoWithC
    extends M1000ESensorInfoBase
{

    @XmlElement(name = "Sensor_Type")
    protected String sensorType;
    @XmlElement(name = "LC")
    protected String lc;
    @XmlElement(name = "UC")
    protected String uc;
    @XmlElement(name = "LW")
    protected String lw;
    @XmlElement(name = "UW")
    protected String uw;

    /**
     * Gets the value of the sensorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorType() {
        return sensorType;
    }

    /**
     * Sets the value of the sensorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorType(String value) {
        this.sensorType = value;
    }

    /**
     * Gets the value of the lc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLC() {
        return lc;
    }

    /**
     * Sets the value of the lc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLC(String value) {
        this.lc = value;
    }

    /**
     * Gets the value of the uc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUC() {
        return uc;
    }

    /**
     * Sets the value of the uc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUC(String value) {
        this.uc = value;
    }

    /**
     * Gets the value of the lw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLW() {
        return lw;
    }

    /**
     * Sets the value of the lw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLW(String value) {
        this.lw = value;
    }

    /**
     * Gets the value of the uw property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUW() {
        return uw;
    }

    /**
     * Sets the value of the uw property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUW(String value) {
        this.uw = value;
    }

}
