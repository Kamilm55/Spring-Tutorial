package org.example.Customer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class DBservice {
    @Before("execution(public void add())")
    public  void dbOperations(){
        System.out.println("database operations");
    }

    @After("execution(public void add())")
    public  void succesMsg(){
        System.out.println("Success");
    }
}
