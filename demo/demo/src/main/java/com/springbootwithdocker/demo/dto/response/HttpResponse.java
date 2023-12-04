package com.springbootwithdocker.demo.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Map;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class HttpResponse {
    private String timeStamp;
    private int statusCode;
    private HttpStatus httpStatus;
    private String message;
    private String developerMessage;
    private Map<?,?> data;
}
