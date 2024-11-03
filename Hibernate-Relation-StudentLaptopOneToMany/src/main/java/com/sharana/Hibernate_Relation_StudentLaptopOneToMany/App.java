package com.sharana.Hibernate_Relation_StudentLaptopOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.RelationsDao_OneToMany.Laptop;
import com.RelationsDao_OneToMany.Student;

public class App 
{
	
    public static void main( String[] args )
    {
    	List<Laptop> list=new ArrayList<>();
    	Laptop l= new Laptop();
    	l.setLid(1);
    	l.setlBrand("HP");
    	l.setLprice(5500.00);
    	
    	
    	Laptop l1= new Laptop();
    	l1.setLid(2);
    	l1.setlBrand("lenova");
    	l1.setLprice(8500.00);
    	
    	list.add(l);
    	list.add(l1);
    	Student st= new Student();
    	st.setsId(101);
    	st.setsName("basava");
    	st.setLaptop(list);
    	l.setStudent(st);
    	l1.setStudent(st);
    	Configuration con= new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session4=sf.openSession();
    	Transaction tx=session4.beginTransaction();
    
    	session4.save(l);
    	session4.save(l1);
    	session4.save(st);
    	tx.commit();
    	session4.close();
    	
    }
}
