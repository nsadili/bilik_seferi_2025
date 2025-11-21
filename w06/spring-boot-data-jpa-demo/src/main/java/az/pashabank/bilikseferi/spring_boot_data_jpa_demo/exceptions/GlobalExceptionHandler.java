package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.exceptions;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.ErrorResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDto> handleException(MethodArgumentNotValidException ex, HttpServletRequest request) {
        var fieldErrors = ex.getBindingResult()
                .getFieldErrors()
                .stream()
                .collect(Collectors.toMap(
                        FieldError::getField,
                        FieldError::getDefaultMessage,
                        (m1, m2) -> m1.concat(", ").concat(m2))
                );
        return buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, request, fieldErrors);
    }

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleException(EmployeeNotFoundException ex, HttpServletRequest request) {
        return buildResponse(HttpStatus.NOT_FOUND, request, ex.getMessage());
    }


    private ResponseEntity<ErrorResponseDto> buildResponse(
            HttpStatus status, HttpServletRequest req, Map<String, String> errors) {

        ErrorResponseDto body = new ErrorResponseDto(
                status.value(),
                req.getRequestURI(),
                Instant.now(),
                errors);
        return ResponseEntity.status(status).body(body);
    }

    private ResponseEntity<ErrorResponseDto> buildResponse(
            HttpStatus status, HttpServletRequest req, String message) {

        ErrorResponseDto body = new ErrorResponseDto(
                status.value(),
                req.getRequestURI(),
                Instant.now(),
                Map.of("message", message));
        return ResponseEntity.status(status).body(body);
    }
}
