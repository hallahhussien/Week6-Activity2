
package com.daehosting.webservices;

import java.math.BigDecimal;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nCelsius" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nWindSpeed" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nCelsius",
    "nWindSpeed"
})
@XmlRootElement(name = "WindChillInCelsius")
public class WindChillInCelsius {

    @XmlElement(required = true)
    protected BigDecimal nCelsius;
    @XmlElement(required = true)
    protected BigDecimal nWindSpeed;

    /**
     * Gets the value of the nCelsius property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNCelsius() {
        return nCelsius;
    }

    /**
     * Sets the value of the nCelsius property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNCelsius(BigDecimal value) {
        this.nCelsius = value;
    }

    /**
     * Gets the value of the nWindSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNWindSpeed() {
        return nWindSpeed;
    }

    /**
     * Sets the value of the nWindSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNWindSpeed(BigDecimal value) {
        this.nWindSpeed = value;
    }

}
