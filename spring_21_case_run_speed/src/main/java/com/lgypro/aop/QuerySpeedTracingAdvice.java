package com.lgypro.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QuerySpeedTracingAdvice {

    @Pointcut("execution(* com.lgypro.service.*Service.*(..))")
    private void servicePointcut() {
    }

    @Around("servicePointcut()")
    public Object runSpeed(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100 - 1; i++) {
            pjp.proceed();
        }
        Object ret = pjp.proceed();
        long elapsedTime = System.currentTimeMillis() - startTime;
        System.out.println("业务层方法" + className + "." + methodName + "百次执行时间: " + elapsedTime + "ms");
        return ret;
    }
}
