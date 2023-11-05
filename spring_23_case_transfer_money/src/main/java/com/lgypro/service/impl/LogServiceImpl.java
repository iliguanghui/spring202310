package com.lgypro.service.impl;

import com.lgypro.dao.LogDao;
import com.lgypro.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    private LogDao logDao;

    @Autowired
    public void setLogDao(LogDao logDao) {
        this.logDao = logDao;
    }

    @Override
    public void log(String outAccountName, String inAccountName, double amount) {
        logDao.log("转账操作由" + outAccountName + "到" + inAccountName + ",金额是" + amount);
    }
}
