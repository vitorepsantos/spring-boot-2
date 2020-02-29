package br.code.account;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class AccountEntityAspect {

    private Logger logger = Logger.getLogger(AccountAspect.class.getName());

    // Pointcut + pointcut expression (define jointpoint)
    @Pointcut("execution(public * AccountEntity.*(..))")
    public void allMethodsInClass() {}

    // Advice
    @Before("allMethodsInClass()")
    public void logAllMethodsInClassBefore(JoinPoint jp) {
        logger.info("logAllMethodsInClassBefore");
    }

    @After("allMethodsInClass()")
    public void logAllMethodsInClassAfter(JoinPoint jp) {
        logger.info("logAllMethodsInClassAfter");
    }

}
