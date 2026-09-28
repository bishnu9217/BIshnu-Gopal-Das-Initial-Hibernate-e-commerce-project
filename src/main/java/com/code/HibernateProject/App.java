package com.code.HibernateProject;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.code.HibernateProject.crud.CreateCategory;
import com.code.HibernateProject.crud.CreateOrder;
import com.code.HibernateProject.crud.CreateProduct;
import com.code.HibernateProject.crud.CreateUsers;
import com.code.HibernateProject.crud.ReadCategory;
import com.code.HibernateProject.crud.ReadOrder;
import com.code.HibernateProject.crud.UpdateCategory;
import com.code.HibernateProject.entity.Category;
import com.code.HibernateProject.entity.OrderDetails;
import com.code.HibernateProject.entity.Orders;
import com.code.HibernateProject.entity.Product;
import com.code.HibernateProject.entity.Users;

public class App {
    public static void main(String[] args) {

        SessionFactory sessionFactory =
                new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Category.class)
                    .addAnnotatedClass(Product.class)
                    .addAnnotatedClass(Users.class)
                    .addAnnotatedClass(Orders.class)
                    .addAnnotatedClass(OrderDetails.class)
                    .buildSessionFactory();

        // CRUD operations will be called here later
        //new CreateCategory(sessionFactory);
        //new ReadCategory(sessionFactory);
        //new UpdateCategory(sessionFactory);
        //new CreateProduct(sessionFactory);
        //new CreateUsers(sessionFactory);
        //new CreateOrder(sessionFactory);
        new ReadOrder(sessionFactory);
        sessionFactory.close();
        
        System.out.println("hello");
    }
}
