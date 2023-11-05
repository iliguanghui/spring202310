package com.lgypro.service.impl;

import com.lgypro.dao.AccountDao;
import com.lgypro.service.AccountService;
import com.lgypro.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    private LogService logService;

    @Autowired
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Autowired
    public void setLogService(LogService logService) {
        this.logService = logService;
    }

    @Override
    public void transfer(String outAccountName, String inAccountName, double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("amount must >=0");
            }
            accountDao.changeBalance(outAccountName, -amount);
//            int i = 1/0;
//        if (true) throw new NullPointerException();
            accountDao.changeBalance(inAccountName, amount);
        } finally {
            logService.log(outAccountName, inAccountName, amount);
        }
    }
}