/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample;

import java.util.List;

/**
 *
 * @author javaBrat
 */
public class AccountDaoJdbcImpl implements AccountDao{

    @Override
    public void insert(Account account) {
       
    }

    @Override
    public void update(Account account) {
        
    }

    @Override
    public void update(List<Account> accounts) {
      
    }

    @Override
    public void delete(long accountId) {
       
    }

    @Override
    public Account find(long accountId) {
        return null;
    }

    @Override
    public List<Account> find(List<Long> accountIds) {
        return null;
    }

    @Override
    public List<Account> find(String ownerName) {
        return null;
    }

    @Override
    public List<Account> find(boolean locked) {
       return null;
    }
    
}
