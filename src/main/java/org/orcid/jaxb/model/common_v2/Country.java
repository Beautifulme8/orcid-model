//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.19 at 01:44:12 PM BST 
//

package org.orcid.jaxb.model.common_v2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * ISO 3611 country
 * 
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType( propOrder = { "value" })
@XmlRootElement(name = "country")
@Schema(description = "CountryV2_0")
public class Country implements Serializable, Comparable<Country> {
    /**
     * 
     */
    private static final long serialVersionUID = 5965964351838303378L;
    @XmlValue
    protected Iso3166Country value;

    public Country() {
        super();
    }

    public Country(Iso3166Country value) {
        super();
        this.value = value;
    }

    /**
     * ISO 3166 country codes
     * 
     * @return possible object is {@link Iso3166Country }
     * 
     */
    public Iso3166Country getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *            allowed object is {@link Iso3166Country }
     * 
     */
    public void setValue(Iso3166Country value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Country other = (Country) obj;
        if (value != other.value)
            return false;
        return true;
    }
    
    @Override
    public int compareTo(Country o) {
    	if(o == null || o.getValue() == null) {
    		return 1;
    	}
                
   		if(getValue() == null) {
   			return -1;
    	}       
    	return this.getValue().compareTo(o.getValue());
    }

}
