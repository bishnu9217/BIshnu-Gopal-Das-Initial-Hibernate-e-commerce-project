package com.code.HibernateProject.crud;

import java.util.List;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.Category;
import com.code.HibernateProject.entity.Product;
import com.code.HibernateProject.entity.Users;
import com.code.HibernateProject.entity.Users.Role;



public class CreateUsers {
//create a SessionFactory 
	private SessionFactory sessionFactory;
	//create constructor with arg SessionFactory
	public CreateUsers(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
	
		Users user = new Users("Rahul", "Rahul@123", "rahul@gmail.com", Role.CUSTOMER);

        

		
		session.persist(user);	
		
	
		

		//to save into the table 
		session.getTransaction().commit();
		//close the session
		session.close(); //detached
		System.out.println("User is Created sucessfully");
		
	}
}
