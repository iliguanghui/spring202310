package com.lgypro.service.impl;

import com.lgypro.dao.AccountDao;
import com.lgypro.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String outAccountName, String inAccountName, double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount must >=0");
        }
        accountDao.changeBalance(outAccountName, -amount);
//        if (true) throw new NullPointerException();
        accountDao.changeBalance(inAccountName, amount);
    }
}