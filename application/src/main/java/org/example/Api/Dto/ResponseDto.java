package org.example.Api.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto<T> {


    private boolean success;
    private T data;
    private Error error;

    public static <T> ResponseDto<T> Success(T data){

        return new ResponseDto<>(true,data,null);
    }
}
