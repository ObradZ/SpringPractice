/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author javaBrat
 */
@Configuration
public class BeanConfiguration {
    @Bean(autowire=Autowire.BY_NAME)
    public AccountService accountService(){
        AccountServiceImpl bean = new AccountServiceImpl();
        return bean;
    }
    @Bean
    public AccountDao accountDao(){
        AccountDaoInMemoryImpl bean = new AccountDaoInMemoryImpl();
        return bean;
    }
    @Bean
    public AccountDaoJdbcImpl accountDaoJdbcImpl(){
        AccountDaoJdbcImpl bean = new AccountDaoJdbcImpl();
        return bean;
    }
    
}
