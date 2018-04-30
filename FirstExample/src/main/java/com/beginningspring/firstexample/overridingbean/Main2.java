/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample.overridingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author javaBrat
 */
public class Main2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration1.class, Configuration2.class);

        Foo foo = applicationContext.getBean(Foo.class);
        System.out.println(foo.getName());
        
        AnnotationConfigApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(Configuration2.class,Configuration1.class);
        
        Foo foo2 = applicationContext2.getBean(Foo.class);
        System.out.println(foo2.getName());
    }
}
