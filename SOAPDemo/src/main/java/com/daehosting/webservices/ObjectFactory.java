
package com.daehosting.webservices;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.daehosting.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.daehosting.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheit }
     * 
     */
    public CelsiusToFahrenheit createCelsiusToFahrenheit() {
        return new CelsiusToFahrenheit();
    }

    /**
     * Create an instance of {@link WindChillInFahrenheit }
     * 
     */
    public WindChillInFahrenheit createWindChillInFahrenheit() {
        return new WindChillInFahrenheit();
    }

    /**
     * Create an instance of {@link WindChillInCelsius }
     * 
     */
    public WindChillInCelsius createWindChillInCelsius() {
        return new WindChillInCelsius();
    }

    /**
     * Create an instance of {@link FahrenheitToCelsius }
     * 
     */
    public FahrenheitToCelsius createFahrenheitToCelsius() {
        return new FahrenheitToCelsius();
    }

    /**
     * Create an instance of {@link WindChillInCelsiusResponse }
     * 
     */
    public WindChillInCelsiusResponse createWindChillInCelsiusResponse() {
        return new WindChillInCelsiusResponse();
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheitResponse }
     * 
     */
    public CelsiusToFahrenheitResponse createCelsiusToFahrenheitResponse() {
        return new CelsiusToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link FahrenheitToCelsiusResponse }
     * 
     */
    public FahrenheitToCelsiusResponse createFahrenheitToCelsiusResponse() {
        return new FahrenheitToCelsiusResponse();
    }

    /**
     * Create an instance of {@link WindChillInFahrenheitResponse }
     * 
     */
    public WindChillInFahrenheitResponse createWindChillInFahrenheitResponse() {
        return new WindChillInFahrenheitResponse();
    }

}
