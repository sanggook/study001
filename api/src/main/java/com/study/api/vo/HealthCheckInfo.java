package com.study.api.vo;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import javax.validation.constraints.NotNull;

@Schema(description = "서버 상태 확인용 Response")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthCheckInfo {

    @NotNull
    @Schema(description = "접속 IP", example = "127.0.0.1")
    private String clientIp;

    @NotNull
    @Schema(description = "현재 시간", example = "2023-09-09T19:34:58.5373475")
    private LocalDateTime currentTime;

    @NotNull
    @Schema(description = "서버 상태", example = "true")
    private boolean isHealth;
}
