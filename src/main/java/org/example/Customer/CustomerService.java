package org.example.Customer;

public class CustomerService {
    private ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    //public void addCustomerToMySql(){}
    public void addCustomer(){
        // Check conditions
        // Operations
        //if valid
//        CustomerDao customerDao = new CustomerDao();
        customerDao.add();
    }
}
