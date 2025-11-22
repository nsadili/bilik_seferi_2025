package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Component
public class CacheAspect {
    private static final Logger logger = LoggerFactory.getLogger(CacheAspect.class);

    private final Map<String, Object> cache = new ConcurrentHashMap<>();

    @Around("@annotation(az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect.annotation.CustomCacheable)")
    public Object cacheMethod(ProceedingJoinPoint joinPoint) throws Throwable {
        String key = joinPoint.getSignature().toLongString() + java.util.Arrays.toString(joinPoint.getArgs());
        if (cache.containsKey(key)) {
            logger.info("[CACHE] Returning cached result for: {}", joinPoint.getSignature());
            return cache.get(key);
        }
        logger.info("[CACHE] Executing and caching result for: {}", joinPoint.getSignature());
        Object result = joinPoint.proceed();
        cache.put(key, result);
        return result;
    }
}
