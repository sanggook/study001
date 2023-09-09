package com.study.api.domain.response;

import com.study.common.constants.ServerStatusCode;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

@Schema(description = "API 공통 응답 DTO")
@Data
@Builder
@AllArgsConstructor
public class ApiResponse<T> {

    @Schema(description = "API 응답 코드")
    private ServerStatusCode code;

    @Schema(description = "API 응답 메세지")
    private String message;

    @Schema(description = "응답 DATA")
    private  T data;

    private static <T> ApiResponse<T> create(ServerStatusCode code, String message, T data){
        return ApiResponse.<T>builder().code(code).message(code.getMessage()).data(data).build();
    }

    public static <T> ApiResponse<T> success(T data){
        return create(ServerStatusCode.SUCCESS, ServerStatusCode.SUCCESS.getMessage(), data);
    }

    public static <T> ApiResponse<T> fail(ServerStatusCode code){
        return create(code, code.getMessage(), null);
    }

    public static <T> ApiResponse<T> fail(ServerStatusCode code, String message){
        return create(code, message, null);
    }
}
