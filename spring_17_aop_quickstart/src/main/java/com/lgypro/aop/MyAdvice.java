package com.lgypro.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.lgypro.dao.BookDao.update())")
    private void pt() {
    }

    @Before("pt()")
    public void printCurrentTime() {
        System.out.println("now: " + new Date());
    }
}
