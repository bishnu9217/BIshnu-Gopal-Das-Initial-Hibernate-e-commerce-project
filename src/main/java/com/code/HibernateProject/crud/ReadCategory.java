package com.code.HibernateProject.crud;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.Category;



public class ReadCategory {
//create a SessionFactory 
	private SessionFactory sessionFactory;
	//create constructor with arg SessionFactory
	public ReadCategory(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		int categoryId=1;
		
		
		
		
		Category category = session.get(Category.class, categoryId);
        if (category == null) {

            System.out.println(
                "Category with id " + categoryId + " not found"
            );

        } else {

            System.out.println("Category found:");
            System.out.println(category);
        }
		
		
		//session.persist(category);	
		
	
		

		//to save into the table 
		session.getTransaction().commit();
		//close the session
		session.close(); //detached
		
		
	}
}
