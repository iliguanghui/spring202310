package com.lgypro.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.lgypro.dao.BookDao.update())")
    private void pt() {
    }

    @Pointcut("execution(int com.lgypro.dao.BookDao.select())")
    private void pt2() {
    }

    //    @Before("pt()")
    public void before() {
        System.out.println("before advice ...");
    }

    //    @After("pt()")
    public void after() {
        System.out.println("after advice ...");
    }

    //    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice...");
        Object ret = pjp.proceed();
        System.out.println("after advice...");
        return ret;
    }


    //    @Around("pt2()")
    public Object around2(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before advice...");
        Object ret = pjp.proceed();
        System.out.println("after advice...");
        return ret;
    }

    //    @AfterReturning("pt()")
    public void afterReturning() {
        System.out.println("afterReturning advice...");
    }

    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("afterThrowing advice...");
    }
}
