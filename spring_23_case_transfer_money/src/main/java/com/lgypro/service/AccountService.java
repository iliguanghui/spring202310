package com.lgypro.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {
    @Transactional
    void transfer(String outAccountName, String inAccountName, double amount);
}
