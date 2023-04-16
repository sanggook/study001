package com.study.study001.domain.response;

import com.study.study001.constants.ServerStatusCode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ApiResponse<T> {
    private ServerStatusCode code;
    private String message;
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
