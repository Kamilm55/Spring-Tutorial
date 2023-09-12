package org.example;

import org.example.Customer.CustomerDao;
import org.example.Customer.CustomerDaoWithMySql;
import org.example.Customer.CustomerService;
import org.example.Customer.ICustomerDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // 1. XML based config

//        Vehicle vehicle = new Car(); // in interface case we don't need to change 2 code (type,constructor)
        // but if we want to change we must change source code how to prevent it
        // in spring we can note in spring.xml and when change xml file we can change outcome without refactoring source code
        // spring.xml make decision for which class should be compatible with vehicle keyword

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle vehicle = (Vehicle) applicationContext.getBean("vehicle");
//        vehicle.drive();

        // 2. Annotation-based config @Component

//        Inversion of Control is a principle in software engineering which transfers the control of objects or portions of a program
//        to a container or framework.

//        Vehicle vehicle1 = new Bus();
//        Vehicle vehicle = (Vehicle) applicationContext.getBean("bus");
//        vehicle.drive();

      //  3.Dependency injection

//        Item item1 = new ItemImpl();
//        Store store = new Store();
//        store.setItem(item1);
        //case1:non-parameterized Conntructor: if i want to create store variable with other Item i should change Store constructor manually
        //case2:Setter : exception occurs if we don't define its field before , but there is no compile-time problem and it might be we are not aware of this => Cannot invoke "org.example.Item.feauture1()" because "this.item" is null
        // case2:Setter : but again not working in this situation , because it should know type of item when create within constructor
        //it is not secure

//        Item item2 = new ItemImpl2();
//        Item item3 = new ItemImpl();
//        Store store1 = new Store(item3);
        // But if we create obj that it defines field in parameterized constructor
        //  It does not need to create Item item => it already created => IOC (inversion of control)
        //  If any exception occurs we know beforehand => we cannot create store without item field if we do we get exception
        // Defining item before creating store helps us define implementation before , it is not dependent store

        // 4. Practice DI and IOC with real examples => https://www.youtube.com/watch?v=YqDLfjE-mes&list=RDCMUCRjiquPh4mjPNoOV9eCilXQ&start_radio=1&rv=YqDLfjE-mes&t=3

        //task: we need operations for customer then save customer data in Oracle sql
        // then we add feature => save customer in mysql
        // SOLID principle => O => open for extension closed for modification => not modify code only extend (add new class)


        // We avoid NEW keyword if we use new when change value we should search and change source code and new impacts performanca and memory
        // if we don't need additional object we  instantiate only once whenever we need use it
        // in our case (dao) we don't have any type we use this as a function we don't need create new instance obj when every call
        // spring container detect it automatically. (IOC) we give control to spring
        // behind the scene it create obj  with new , but it makes more with performant , scalable and testable way.
//        ICustomerDao customerDao = new CustomerDao();
        ICustomerDao customerDao = (ICustomerDao) applicationContext.getBean("database");
//        CustomerService customerService = new CustomerService(customerDao);
        CustomerService customerService = (CustomerService) applicationContext.getBean("service");
        customerService.addCustomer();// add to oracle
        // i must change source code i should modify customerService code add if block or add new method
        // interface is useful define similar class we define interface as reference type

    }
}
