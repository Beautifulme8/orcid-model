//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.18 at 10:32:14 AM GMT 
//

package org.orcid.jaxb.model.record_v2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_v2.LastModifiedDate;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Java class for anonymous complex type.
 * 
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "work" })
@XmlRootElement(name = "works")
@Schema(description = "WorksV2_0")
public class Works implements Serializable, ActivitiesContainer {

    private static final long serialVersionUID = 1L;
    
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "work")
    protected List<Work> works;

    /**
     * Gets the value of the orcidWork property.
     * 
     * This accessor method returns a reference to the live list, not a
     * snapshot. Therefore any modification you make to the returned list will
     * be present inside the JAXB object. This is why there is not a
     * <CODE>set</CODE> method for the orcidWork property.
     * 
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOrcidWork().add(newItem);
     * </pre>
     * 
     * Objects of the following type(s) are allowed in the list {@link Work }
     * 
     * @return a List of Work objects
     * 
     */
    public List<Work> getWorks() {
        if (works == null) {
            works = new ArrayList<Work>();
        }
        return this.works;
    }

    public Map<Long, Work> retrieveActivitiesAsMap() {
        Map<Long, Work> workMap = new HashMap<>();
        if (works != null) {
            for (Work work : works) {
                if (work.putCode != null) {
                    workMap.put(work.putCode, work);
                }
            }
        }
        return workMap;
    }

    @Override
    public List<Work> retrieveActivities() {
        return getWorks();
    }


    public void setOrcidWork(List<Work> orcidWork) {
        this.works = orcidWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Works that = (Works) o;

        if (works != null ? !works.equals(that.works) : that.works != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = works != null ? works.hashCode() : 0;
        result = 31 * result;
        return result;
    }

    @Override
    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        // TODO Auto-generated method stub        
    }
}
