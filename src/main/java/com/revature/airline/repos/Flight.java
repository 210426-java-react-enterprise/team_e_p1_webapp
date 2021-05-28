package com.revature.airline.repos;

import utils.Repository;

import java.sql.Connection;

public class Flight  {
    int flightNumber;
    String departureLocation;
    String destinationLocation;

    public Flight(String departureLocation, String destinationLocation) {
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;

    }



}
