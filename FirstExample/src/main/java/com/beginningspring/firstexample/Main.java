/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author javaBrat
 */
public class Main {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext applicationContext =
new AnnotationConfigApplicationContext(BeanConfiguration.class);
        
    AccountService accountService = applicationContext.getBean("accountService",AccountService.class);
    
    System.out.println("Before money transfer");
    
    System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
    System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());
    
    accountService.transferMoney(1, 2, 5.0);
    System.out.println("After money transfer");
    
    System.out.println("Account 1 balance :" + accountService.getAccount(1).getBalance());
    System.out.println("Account 2 balance :" + accountService.getAccount(2).getBalance());

    }
}
