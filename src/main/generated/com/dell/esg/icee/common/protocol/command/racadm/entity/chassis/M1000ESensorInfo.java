//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="senType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "senType",
    "units",
    "lc",
    "uc"
})
@XmlRootElement(name = "m1000eSensorInfo")
public class M1000ESensorInfo
    extends M1000ESensorInfoBase
{

    protected String senType;
    protected String units;
    protected String lc;
    protected String uc;

    /**
     * Gets the value of the senType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenType() {
        return senType;
    }

    /**
     * Sets the value of the senType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenType(String value) {
        this.senType = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the lc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLc() {
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
    public void setLc(String value) {
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
    public String getUc() {
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
    public void setUc(String value) {
        this.uc = value;
    }

}
