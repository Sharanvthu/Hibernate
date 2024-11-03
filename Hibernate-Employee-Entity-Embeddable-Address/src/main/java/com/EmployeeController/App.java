package com.EmployeeController;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.EmployeDao.Address;
import com.EmployeDao.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{

		Employee emp= new Employee();
		Address ad=new Address();
		ad.setVillage_name("Gavigat");
		ad.setTaluq_name("manvi");
		ad.setDistrict_name("Raichur");
		emp.seteId(101);
		emp.seteName("sharan");
		emp.seteLoc(ad);
		try {
			Configuration con= new Configuration().configure().addAnnotatedClass(Employee.class);
			ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
			SessionFactory sf=con.buildSessionFactory(reg);
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();


			session.save(emp);
			tx.commit();
		
			System.out.println(emp);
		}
		catch (Exception e) 
		{
			e.printStackTrace();;
		}

	}
}
