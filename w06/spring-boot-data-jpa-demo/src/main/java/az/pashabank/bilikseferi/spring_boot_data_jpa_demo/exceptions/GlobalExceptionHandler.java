package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.exceptions;

import az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto.ErrorResponseDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.Instant;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponseDto> handleException(MethodArgumentNotValidException ex,
                                                            HttpServletRequest request) {
        var fieldErrors = ex.getBindingResult().getFieldErrors().stream().collect(
                Collectors.toMap(
                        FieldError::getField,
                        fe -> Objects.toString(fe.getDefaultMessage(), "invalid value"),
                        (m1, m2) -> m1.concat(", ").concat(m2)));

        return Objects.requireNonNull(
                buildResponse(HttpStatus.INTERNAL_SERVER_ERROR, request, fieldErrors));
    }


    @ExceptionHandler(EmployeeNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponseDto handleEmployeeNotFound(EmployeeNotFoundException ex, HttpServletRequest request) {
        return buildResponse(HttpStatus.NOT_FOUND, request, ex.getMessage());
    }


    private ErrorResponseDto buildResponse(HttpStatus status,
                                           HttpServletRequest req,
                                           String errorMessage) {
        return new ErrorResponseDto(status.value(), req.getRequestURI(),
                Instant.now(), Map.of("errorMessage", errorMessage));
    }


    private ResponseEntity<ErrorResponseDto> buildResponse(HttpStatus status,
                                                           HttpServletRequest req,
                                                           Map<String, String> errors) {
        ErrorResponseDto body = new ErrorResponseDto(status.value(), req.getRequestURI(), Instant.now(), errors);
        return ResponseEntity.status(status).body(body);
    }

}
