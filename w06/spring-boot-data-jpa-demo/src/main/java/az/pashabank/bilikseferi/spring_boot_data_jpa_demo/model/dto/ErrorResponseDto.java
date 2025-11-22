package az.pashabank.bilikseferi.spring_boot_data_jpa_demo.model.dto;

import java.time.Instant;
import java.util.Map;

public record ErrorResponseDto(int status,
                               String path,
                               Instant timestamp,
                               Map<String, String> errors) {

}