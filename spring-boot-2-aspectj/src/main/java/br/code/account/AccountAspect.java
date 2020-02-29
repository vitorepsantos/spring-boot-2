package br.code.account;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
public class AccountAspect {

    private Logger logger = Logger.getLogger(AccountAspect.class.getName());

    @Pointcut("execution(* br.code.account.*.*(..))")
    public void allMethodsInPackage() {}

    @Before("allMethodsInPackage()")
    public void logAllMethodsInPackageBefore(JoinPoint jp) {
        logger.info("logAllMethodsInPackageBefore");
    }

}
