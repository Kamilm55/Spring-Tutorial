package org.example.Customer;

import org.springframework.stereotype.Component;

@Component("customerdao")
public class CustomerDao implements ICustomerDao {
    @Override
    public void add() {

        // jdbc or orm codes
        System.out.println("Data is added to Oracle db!");
        // success codes
    }
}
