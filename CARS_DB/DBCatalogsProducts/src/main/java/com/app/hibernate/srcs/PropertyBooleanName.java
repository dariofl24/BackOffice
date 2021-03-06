package com.app.hibernate.srcs;
// Generated Oct 6, 2017 3:23:39 PM by Hibernate Tools 4.3.1.Final



/**
 * PropertyBooleanName generated by hbm2java
 */
public class PropertyBooleanName  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String description;
     private Boolean defaultValue;
     private Integer defaultValueLov;
     private boolean multyval;
     private boolean lov;
     private Boolean indexable;

    public PropertyBooleanName() {
    }

	
    public PropertyBooleanName(String name, boolean multyval, boolean lov) {
        this.name = name;
        this.multyval = multyval;
        this.lov = lov;
    }
    public PropertyBooleanName(String name, String description, Boolean defaultValue, Integer defaultValueLov, boolean multyval, boolean lov, Boolean indexable) {
       this.name = name;
       this.description = description;
       this.defaultValue = defaultValue;
       this.defaultValueLov = defaultValueLov;
       this.multyval = multyval;
       this.lov = lov;
       this.indexable = indexable;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean getDefaultValue() {
        return this.defaultValue;
    }
    
    public void setDefaultValue(Boolean defaultValue) {
        this.defaultValue = defaultValue;
    }
    public Integer getDefaultValueLov() {
        return this.defaultValueLov;
    }
    
    public void setDefaultValueLov(Integer defaultValueLov) {
        this.defaultValueLov = defaultValueLov;
    }
    public boolean isMultyval() {
        return this.multyval;
    }
    
    public void setMultyval(boolean multyval) {
        this.multyval = multyval;
    }
    public boolean isLov() {
        return this.lov;
    }
    
    public void setLov(boolean lov) {
        this.lov = lov;
    }
    public Boolean getIndexable() {
        return this.indexable;
    }
    
    public void setIndexable(Boolean indexable) {
        this.indexable = indexable;
    }




}


