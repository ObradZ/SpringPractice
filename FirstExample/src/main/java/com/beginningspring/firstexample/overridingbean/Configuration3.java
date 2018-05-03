/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample.overridingbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 *
 * @author javaBrat
 */
@Configuration
public class Configuration3 {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    @Profile("dev")
    public Foo devFoo(@Value("${name}") String name) {
        Foo foo = new Foo();
        foo.setName("dev " + name);
        return foo;
    }

    @Bean
    @Profile("prod")
    public Foo prodFoo(@Value("${name}") String name) {
        Foo foo = new Foo();
        foo.setName("prod " + name);
        return foo;
    }

}
