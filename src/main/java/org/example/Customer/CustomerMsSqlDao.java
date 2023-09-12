package org.example.Customer;

public class CustomerMsSqlDao implements ICustomerDao {
    @Override
    public void add() {
        System.out.println(" data is added to Ms sql");
    }
}
