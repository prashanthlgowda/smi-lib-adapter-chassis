//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.15 at 02:07:00 PM CDT 
//


package com.dell.esg.icee.common.protocol.command.racadm.entity.chassis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cfgTraps complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cfgTraps">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cfgTrapsEnable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfgTrapsAlertDestIPAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cfgTrapsCommunityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cfgTraps", propOrder = {
    "cfgTrapsEnable",
    "cfgTrapsAlertDestIPAddr",
    "cfgTrapsCommunityName"
})
public class CfgTraps {

    protected String cfgTrapsEnable;
    protected String cfgTrapsAlertDestIPAddr;
    protected String cfgTrapsCommunityName;

    /**
     * Gets the value of the cfgTrapsEnable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgTrapsEnable() {
        return cfgTrapsEnable;
    }

    /**
     * Sets the value of the cfgTrapsEnable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgTrapsEnable(String value) {
        this.cfgTrapsEnable = value;
    }

    /**
     * Gets the value of the cfgTrapsAlertDestIPAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgTrapsAlertDestIPAddr() {
        return cfgTrapsAlertDestIPAddr;
    }

    /**
     * Sets the value of the cfgTrapsAlertDestIPAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgTrapsAlertDestIPAddr(String value) {
        this.cfgTrapsAlertDestIPAddr = value;
    }

    /**
     * Gets the value of the cfgTrapsCommunityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCfgTrapsCommunityName() {
        return cfgTrapsCommunityName;
    }

    /**
     * Sets the value of the cfgTrapsCommunityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCfgTrapsCommunityName(String value) {
        this.cfgTrapsCommunityName = value;
    }

}
