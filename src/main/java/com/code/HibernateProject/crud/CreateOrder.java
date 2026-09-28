package com.code.HibernateProject.crud;

import java.time.LocalDateTime;

//import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.Category;
import com.code.HibernateProject.entity.OrderDetails;
import com.code.HibernateProject.entity.Orders;
import com.code.HibernateProject.entity.Product;
import com.code.HibernateProject.entity.Users;



public class CreateOrder {
//create a SessionFactory 
	private SessionFactory sessionFactory;
	//create constructor with arg SessionFactory
	public CreateOrder(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		
		Session session=sessionFactory.getCurrentSession();
		
		session.beginTransaction();
		
		
		Users user = session.get(Users.class, 1);
		
	    Product product1 = session.get(Product.class, 1);
	    Product product2 = session.get(Product.class, 2);		
		
        Orders order = new Orders(
                LocalDateTime.now(),
                170000,
                user
        );
        
        OrderDetails detail1 = new OrderDetails(
                1,
                80000,
                order,
                product1
        );

        OrderDetails detail2 = new OrderDetails(
                1,
                90000,
                order,
                product2
        );

        order.getOrderDetails().add(detail1);
        order.getOrderDetails().add(detail2);
        
        session.persist(order);
		//to save into the table 
		session.getTransaction().commit();
		//close the session
		session.close(); //detached
		System.out.println("Order is Created sucessfully");
		
	}
}
