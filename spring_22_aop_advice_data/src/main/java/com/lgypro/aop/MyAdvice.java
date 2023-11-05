package com.lgypro.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(* com.lgypro.dao.BookDao.findName(..))")
    private void pt() {
    }

    //    @Before("pt()")
    public void before(JoinPoint jp) {
        System.out.println("before advice ...");
        System.out.println("args = " + Arrays.toString(jp.getArgs()));
    }

    //    @After("pt()")
    public void after(JoinPoint jp) {
        System.out.println("args = " + Arrays.toString(jp.getArgs()));
        System.out.println("after advice ...");
    }

    //    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("args = " + Arrays.toString(pjp.getArgs()));
        System.out.println("before advice...");
        Object ret = pjp.proceed(pjp.getArgs());
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

    //    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(Object ret) {
        System.out.println("afterReturning advice...");
        System.out.println("ret = " + ret);
    }

    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice...");
        String message = t.getMessage();
        System.out.println(message);
    }
}
