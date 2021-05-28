package com.revature.airline.repos;


import annotations.Column;
import annotations.Table;
import enums.SQLType;
import utils.Repository;
import java.sql.Connection;
import java.util.UUID;


@Table (tableName = "customer")
public class Customer extends Repository {

    public Customer(Connection conn) {
        super (conn);
    }



    @Column(type = SQLType.UUID, primaryKey = true)
    private UUID customer_id;

    @Column (type = SQLType.VARCHAR, nonNull = true)
    private String firstName;

    @Column (type = SQLType.VARCHAR, nonNull = true)
    private String lastName;


    public String getFirstName() {
        return firstName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UUID getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(UUID customerId) {
        this.customer_id = customerId;
    }



}
