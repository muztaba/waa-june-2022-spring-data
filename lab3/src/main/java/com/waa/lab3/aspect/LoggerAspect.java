package com.waa.lab3.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(com.waa.lab3.aspect.annotation.LogMe)")
    public void a() {}

    @After("a()")
    public void log(JoinPoint jp) {
        System.out.println("Method name: " + jp.getSignature().getName());
    }
}
