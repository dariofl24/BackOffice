package com.app.hibernate.srcs;
// Generated Oct 6, 2017 3:23:39 PM by Hibernate Tools 4.3.1.Final



/**
 * LovPropertyBoolean generated by hbm2java
 */
public class LovPropertyBoolean  implements java.io.Serializable {


     private Integer id;
     private boolean value;
     private int propertyId;

    public LovPropertyBoolean() {
    }

    public LovPropertyBoolean(boolean value, int propertyId) {
       this.value = value;
       this.propertyId = propertyId;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public boolean isValue() {
        return this.value;
    }
    
    public void setValue(boolean value) {
        this.value = value;
    }
    public int getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }




}


