package com.study.common.constants;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Schema(description = "API 응답 코드 및 메세지")
@AllArgsConstructor
@Getter
public enum ServerStatusCode {
    // 200 성공 관련
    SUCCESS(200, "OK")
    
    // 404 NOT_FOUND 관련
    , FILE_NOT_FOUND(404, "존재하지 않는 파일입니다.")
    , API_NOT_FOUND(404, "존재하지 않는 API 주소입니다.")
    
    // 500 INTERNAL_SERVER_ERROR 관련
    , INTERNAL_SERVER_ERROR(500, "서버에서 에러가 발생했습니다.")
    ;

    private final int status;
    private final String message;
}
