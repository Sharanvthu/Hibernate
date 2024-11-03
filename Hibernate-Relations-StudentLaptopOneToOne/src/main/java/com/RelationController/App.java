package com.RelationController;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.RelationsDao_OneToOne.Laptop;
import com.RelationsDao_OneToOne.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop lap= new Laptop();
    	lap.setLid(101);
    	lap.setlBrand("lenova");
    	lap.setLprice(50000);
    	
    	
    	Student st= new Student();
    	st.setsId(1);
    	st.setsName("sharan");
    	st.setLaptop(lap);
    	lap.setStud(st);
    	
    	Configuration con= new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
    	ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session1=sf.openSession();
    	Transaction tx=session1.beginTransaction();
    	session1.save(lap);
    	session1.save(st);
    	tx.commit();
    	
    	
    	
    	
    }
}
