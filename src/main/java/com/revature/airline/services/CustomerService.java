package com.revature.airline.services;

import com.revature.airline.repos.Customer;
import exceptions.DBConnectionException;
import exceptions.MalformedTableException;
import utils.ConnectionFactory;
import utils.TableInitializer;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

public class CustomerService {
    Connection conn;

    public void register(String firstName, String lastName){
        try {
            conn = ConnectionFactory.getConnection ("project0.cksippr4cmc5.us-east-1.rds.amazonaws.com", 5432, "postgres", "project1", "jfallon", "revature", "org.postgresql.Driver");
        } catch (DBConnectionException e) {
            e.printStackTrace ();
        }
        UUID customerId = UUID.randomUUID ();

        Customer newCustomer = new Customer (conn);
        newCustomer.setCustomerId (UUID.randomUUID ());
        try {
            TableInitializer.initializeTable (newCustomer);
        } catch (MalformedTableException e) {
            e.printStackTrace ();
        } catch (SQLException throwables) {
            throwables.printStackTrace ();
        }
        newCustomer.setFirstName (firstName);
        newCustomer.setLastName(lastName);
        newCustomer.setCustomerId (customerId);
        try {
            newCustomer.save ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (SQLException throwables) {
            throwables.printStackTrace ();
        }

    }

}
