package com.code.HibernateProject.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.code.HibernateProject.entity.OrderDetails;
import com.code.HibernateProject.entity.Orders;

public class ReadOrder {

    private SessionFactory sessionFactory;

    public ReadOrder(SessionFactory sessionFactory) {

        this.sessionFactory = sessionFactory;

        Session session = sessionFactory.getCurrentSession();

        session.beginTransaction();

        // Get Order
        int orderId = 1;

        Orders order = session.get(Orders.class, orderId);

        if (order == null) {

            System.out.println("Order with id " + orderId + " not found");

        } else {

            System.out.println("Order ID: " + order.getId());
            System.out.println("Order Date: " + order.getOrderDate());
            System.out.println("Total Amount: " + order.getTotalAmount());

            // Associated User
            System.out.println("User: " + order.getUser().getUsername());

            // Associated OrderDetails
            System.out.println("Order Details:");

            for (OrderDetails detail : order.getOrderDetails()) {

                System.out.println(
                    "Product: " +
                    detail.getProduct().getName()
                );

                System.out.println(
                    "Quantity: " +
                    detail.getQuantity()
                );

                System.out.println(
                    "Unit Price: " +
                    detail.getUnitPrice()
                );
            }
        }

        session.getTransaction().commit();

        session.close();
    }
}