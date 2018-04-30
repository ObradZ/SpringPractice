/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beginningspring.firstexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author javaBrat
 */
public class AccountServiceImpl implements AccountService{
    private AccountDao accountDao;
    
    public void setAccountDao(AccountDao accountDao){
        this.accountDao=accountDao;
    }
    @Override
    public void transferMoney(long sourceAccountId, long targetAccountId, double amount) {
       Account srcAccount = accountDao.find(sourceAccountId);
       Account trgAccount = accountDao.find(targetAccountId);
       srcAccount.setBalance(srcAccount.getBalance()-amount);
       trgAccount.setBalance(trgAccount.getBalance()+amount);
       accountDao.update(srcAccount);
       accountDao.update(trgAccount);
    }

    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountDao.find(accountId);
        account.setBalance(account.getBalance() + amount);
        accountDao.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountDao.find(accountId);
    }


    
}
