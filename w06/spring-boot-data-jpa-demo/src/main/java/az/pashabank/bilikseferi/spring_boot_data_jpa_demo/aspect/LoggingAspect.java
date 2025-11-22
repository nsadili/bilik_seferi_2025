package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service..*(..))")
    public void logBefore(JoinPoint joinPoint) {
        logger.info("start: {}", joinPoint.getSignature());
    }

    @AfterReturning(pointcut = "execution(* az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service..*(..))", returning = "result")
    public void logAfterReturning(JoinPoint joinPoint, Object result) {
        logger.info("end: {} with return {}", joinPoint.getSignature(), result);
    }

    @AfterThrowing(pointcut = "execution(* az.pashabank.bilikseferi.spring_boot_data_jpa_demo.service..*(..))", throwing = "ex")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable ex) {
        logger.error("exception in: {}", joinPoint.getSignature(), ex);
    }
}
