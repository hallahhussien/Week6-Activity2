package com.daehosting.webservices;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="CelsiusToFahrenheitResult" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
    "celsiusToFahrenheitResult"
})
@XmlRootElement(name = "CelsiusToFahrenheitResponse")
public class CelsiusToFahrenheitResponse {

    @XmlElement(name = "CelsiusToFahrenheitResult", required = true)
    protected BigDecimal celsiusToFahrenheitResult;

    /**
     * Gets the value of the celsiusToFahrenheitResult property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCelsiusToFahrenheitResult() {
        return celsiusToFahrenheitResult;
    }

    /**
     * Sets the value of the celsiusToFahrenheitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCelsiusToFahrenheitResult(BigDecimal value) {
        this.celsiusToFahrenheitResult = value;
    }

}
