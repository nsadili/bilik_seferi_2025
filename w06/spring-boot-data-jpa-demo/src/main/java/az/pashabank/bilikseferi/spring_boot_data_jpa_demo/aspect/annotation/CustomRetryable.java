package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.aspect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomRetryable {
    int maxAttempts() default 5;
}
