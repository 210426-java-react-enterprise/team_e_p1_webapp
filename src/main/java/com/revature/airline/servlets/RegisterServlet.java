package com.revature.airline.servlets;

import com.revature.airline.repos.Customer;
import com.revature.airline.services.CustomerService;
import exceptions.DBConnectionException;
import exceptions.MalformedTableException;
import utils.ConnectionFactory;
import utils.TableInitializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;
import java.util.UUID;





public class RegisterServlet extends HttpServlet {
    CustomerService customerService = new CustomerService ();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String firstName = req.getParameter ("First Name");
        String lastName = req.getParameter ("Last Name");
        customerService.register (firstName, lastName);
        resp.setStatus(202);



    }


}
