package com.revature.airline.servlets;

import com.revature.airline.repos.Flight;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FlightsServlet extends HttpServlet {
    private Dispatcher dispatcher= new Dispatcher();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        dispatcher.dataDispatch (req, resp);
        resp.setStatus(202);


        //Flight flight = new Flight (departureLocation, destinationLocation);

        //TODO









    }
}