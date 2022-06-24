package com.waa.lab3.aspect;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAspect {

    @Pointcut("@annotation(com.waa.lab3.aspect.annotation.Timer)")
    public void timerPointCut() {}

    @Around("timerPointCut()")
    @SneakyThrows
    public Object timer(ProceedingJoinPoint pjp) {
        StopWatch stopWatch = new StopWatch("Timer: ");
        stopWatch.start();
        var res = pjp.proceed();
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
        return res;
    }

}
