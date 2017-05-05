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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serverVersionSummary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serverVersionSummary">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Server" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iDRAC_Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Blade_Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Updatable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serverVersionSummary", propOrder = {
    "server",
    "idracVersion",
    "bladeType",
    "gen",
    "updatable"
})
public class ServerVersionSummary {

    @XmlElement(name = "Server")
    protected String server;
    @XmlElement(name = "iDRAC_Version")
    protected String idracVersion;
    @XmlElement(name = "Blade_Type")
    protected String bladeType;
    @XmlElement(name = "Gen")
    protected String gen;
    @XmlElement(name = "Updatable")
    protected String updatable;

    /**
     * Gets the value of the server property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServer() {
        return server;
    }

    /**
     * Sets the value of the server property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServer(String value) {
        this.server = value;
    }

    /**
     * Gets the value of the idracVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDRACVersion() {
        return idracVersion;
    }

    /**
     * Sets the value of the idracVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDRACVersion(String value) {
        this.idracVersion = value;
    }

    /**
     * Gets the value of the bladeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBladeType() {
        return bladeType;
    }

    /**
     * Sets the value of the bladeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBladeType(String value) {
        this.bladeType = value;
    }

    /**
     * Gets the value of the gen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGen() {
        return gen;
    }

    /**
     * Sets the value of the gen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGen(String value) {
        this.gen = value;
    }

    /**
     * Gets the value of the updatable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatable() {
        return updatable;
    }

    /**
     * Sets the value of the updatable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatable(String value) {
        this.updatable = value;
    }

}
