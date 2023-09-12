package org.example.Customer;

public class CustomerDaoWithMySql implements ICustomerDao
{
    @Override
    public void add(){
        // jdbc or orm codes
        System.out.println("Data is added to Mysql db!");
    }
}
