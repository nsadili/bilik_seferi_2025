package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect.annotation.CustomRetryable;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RetryAspect {
    private static final Logger logger = LoggerFactory.getLogger(RetryAspect.class);

    @Around("@annotation(customRetryable)")
    public Object retryMethod(ProceedingJoinPoint joinPoint, CustomRetryable customRetryable) throws Throwable {
        int maxAttempts = customRetryable.maxAttempts();
        if (maxAttempts <= 0) throw new IllegalArgumentException("@CustomRetryable.maxAttempts must be > 0");
        int attempt = 0;
        Throwable lastException = null;
        while (attempt < maxAttempts) {
            try {
                logger.info("[RETRY] Attempt {} for method: {}", attempt + 1, joinPoint.getSignature());
                Object result = joinPoint.proceed();
                logger.info("[RETRY] Success on attempt {} for method: {}", attempt + 1, joinPoint.getSignature());
                return result;
            } catch (Throwable ex) {
                lastException = ex;
                logger.warn("[RETRY] Exception on attempt {} for method: {}: {}", attempt + 1, joinPoint.getSignature(), ex.getMessage());
                attempt++;
            }
        }
        logger.error("[RETRY] All {} attempts failed for method: {}", maxAttempts, joinPoint.getSignature());
        throw lastException;
    }
}
