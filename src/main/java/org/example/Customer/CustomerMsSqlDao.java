package org.example.Customer;

import org.springframework.stereotype.Component;

@Component("msSql")
public class CustomerMsSqlDao implements ICustomerDao {
    @Override
    public void add() {
        System.out.println(" data is added to Ms sql");
    }
}
