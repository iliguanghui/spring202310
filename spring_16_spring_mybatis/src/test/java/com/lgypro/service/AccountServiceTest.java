package com.lgypro.service;

import com.lgypro.config.SpringConfig;
import com.lgypro.domain.Account;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        Account account = accountService.findById(2);
        Assert.assertNotNull(account);
    }

    @Test
    public void testFindAll() {
        List<Account> allAccounts = accountService.findAll();
        Assert.assertFalse(allAccounts.isEmpty());
    }
}
