package com.code.HibernateProject.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.Category;

public class UpdateCategory {

    private SessionFactory sessionFactory;

    public UpdateCategory(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;

        // Create a detached object
        Category category = new Category();

        category.setId(1);
        category.setName("Mobile Electronics");
        category.setDiscription("Mobile and electronic products");

        // Get session
        Session session = sessionFactory.getCurrentSession();

        // Start transaction
        session.beginTransaction();

        // Merge the detached object
        session.merge(category);

        // Commit transaction
        session.getTransaction().commit();

        // Close session
        session.close();

        System.out.println("Category is Updated successfully");
    }
}