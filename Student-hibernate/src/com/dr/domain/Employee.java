package com.dr.domain;

public class Employee implements java.io.Serializable {  
	  
    private static final long serialVersionUID = -684317571614793717L;  
      
    private Integer id;  
    private String name;  
    private String email;  
    private java.util.Date hiredate;  
    
    public Integer getId() {  
        return id;  
    }  
    public void setId(Integer id) {  
        this.id = id;  
    }  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }  
    public java.util.Date getHiredate() {  
        return hiredate;  
    }  
    public void setHiredate(java.util.Date hiredate) {  
        this.hiredate = hiredate;  
    }  
}  