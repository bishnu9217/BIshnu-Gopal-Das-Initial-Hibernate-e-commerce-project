package com.code.HibernateProject.crud;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.Category;



public class CreateCategory {
//create a SessionFactory 
	private SessionFactory sessionFactory;
	//create constructor with arg SessionFactory
	public CreateCategory(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		
		Category category = new Category("Electronics", "Electronic products");
		
		
		session.persist(category);	
		
	
		

		//to save into the table 
		session.getTransaction().commit();
		//close the session
		session.close(); //detached
		System.out.println("Category is Created sucessfully");
		
	}
}
