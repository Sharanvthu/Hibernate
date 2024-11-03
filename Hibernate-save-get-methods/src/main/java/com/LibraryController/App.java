package com.LibraryController;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.LibraryDao.Comics;
import com.LibraryDao.Fiction;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Comics c= new Comics();
    	c.setbName("The God");
    	c.setbPrice(89.0f);
    	c.setbAuthor("sneha");
    	
    	Fiction f= new Fiction();
    	f.setbName("Lust");
    	f.setbPrice(125.08f);
    	f.setbAuthor("basava");
    	
    	
    	
    	Configuration con=new Configuration().configure().addAnnotatedClass(Comics.class).addAnnotatedClass(Fiction.class);
    	ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session= sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(c);
    	session.save(f);
//    	c=(Comics)session.get(Comics.class, "The king");
    	tx.commit();
//    	System.out.println(c);
    }
}
