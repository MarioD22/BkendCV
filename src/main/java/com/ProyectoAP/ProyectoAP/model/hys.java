
package com.ProyectoAP.ProyectoAP.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hys")
public class hys {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "nombrehys")
    private String nombreHys;

    @Column(name = "percent")
    private String percent;

    public hys() {
    }

    public hys(long id, String nombreHys, String percent) {
        this.id = id;
        this.nombreHys = nombreHys;
        this.percent = percent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreHys() {
        return nombreHys;
    }

    public void setNombreHys(String nombreHys) {
        this.nombreHys = nombreHys;
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }
 
    
    
    
}
