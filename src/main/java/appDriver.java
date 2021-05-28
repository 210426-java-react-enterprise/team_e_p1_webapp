


import com.revature.airline.repos.Customer;
import exceptions.DBConnectionException;
import exceptions.MalformedTableException;
import utils.ConnectionFactory;
import utils.Repository;
import utils.TableInitializer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

public class appDriver {

    public static void main(String[] args) {
        Connection conn = null;
        try {
           conn = ConnectionFactory.getConnection ("project0.cksippr4cmc5.us-east-1.rds.amazonaws.com", 5432, "postgres", "project1", "jfallon", "revature", "org.postgresql.Driver");
        } catch (DBConnectionException e) {
            e.printStackTrace ();
        }
        Customer newCustomer = new Customer (conn);
        newCustomer.setCustomerId (UUID.randomUUID ());
        newCustomer.setFirstName ("James");
        newCustomer.setLastName ("Fallon");
        try {
            newCustomer.save ();
        } catch (IllegalAccessException e) {
            e.printStackTrace ();
        } catch (SQLException throwables) {
            throwables.printStackTrace ();
        }


        try {
            TableInitializer.initializeTable (newCustomer);
        } catch (MalformedTableException e) {
            e.printStackTrace ();
        } catch (SQLException throwables) {
            throwables.printStackTrace ();
        }


    }
}
