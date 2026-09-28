package com.code.HibernateProject.crud;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.Category;
import com.code.HibernateProject.entity.Product;



public class CreateProduct {
//create a SessionFactory 
	private SessionFactory sessionFactory;
	//create constructor with arg SessionFactory
	public CreateProduct(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		
		Category category = session.get(Category.class, 1);
        Product product = new Product("Samsung Galaxy S25", 80000, 10, category);
		
        

		
		session.persist(product);	
		
	
		

		//to save into the table 
		session.getTransaction().commit();
		//close the session
		session.close(); //detached
		System.out.println("Product is Created sucessfully");
		
	}
}
