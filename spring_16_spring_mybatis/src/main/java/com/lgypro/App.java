package com.lgypro;

import com.lgypro.dao.AccountDao;
import com.lgypro.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory =
                new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
            List<Account> allAccounts = accountDao.findAll();
            allAccounts.forEach(System.out::println);
        }
        System.out.println("---- another query");
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
            Account account = accountDao.findById(2);
            System.out.println(account);
        }
    }
}
