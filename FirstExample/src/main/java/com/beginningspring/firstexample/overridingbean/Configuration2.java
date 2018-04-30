/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample.overridingbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author javaBrat
 */
@Configuration
public class Configuration2 {
@Bean
    public Foo foo(){
        Foo foo = new Foo();
        foo.setName("firstFoo");
        return foo;
    }
}
