package com.dr;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.dr.domain.Employee;

public class Test {  
  
    public static void main(String[] args) {  
        Configuration cfg = new Configuration().configure();  
        ServiceRegistry sr = new ServiceRegistryBuilder()  
            .applySettings(cfg.getProperties()).buildServiceRegistry();  
        SessionFactory sf = cfg.buildSessionFactory(sr);  
          
        Session session = sf.openSession();  
        Transaction ts = session.beginTransaction();  
        Employee employee = new Employee();  
        employee.setName("ÄúºÃ");  
        employee.setEmail("hibernateÄúºÃ@126.com");  
        employee.setHiredate(new java.util.Date());  
        session.save(employee);
        //session.
        
        ts.commit();  
        session.close();  
    }  
}  