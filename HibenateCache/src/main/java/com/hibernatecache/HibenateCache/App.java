package com.hibernatecache.HibenateCache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernatecache.dao.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Product.class);
    	ServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
    	SessionFactory sf=con.buildSessionFactory(reg);
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	Product p= session.get(Product.class, 101);
//    	Product p1= session.get(Product.class, 101);//First Level Cache =>session level cache[we can fetch similer data several times within a session using first level cache, it won't hit the database to fetch data]
    	
    	tx.commit();
    	Session session1=sf.openSession();
    	Transaction tx1=session1.beginTransaction();
    	Product p1=session1.get(Product.class, 101);
//    	Second Level Cache =>Application level cahe [fetch data from second level cahce ,it wont hit DBMS to fetch]
    	tx1.commit();
    	System.out.println(p);
    	System.out.println(p1);
    }
}
