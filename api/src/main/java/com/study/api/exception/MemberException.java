package com.study.api.exception;

public class MemberException extends RuntimeException {
    
    public MemberException(){
        super();
    }

    public MemberException(String message){
        super(message);
    }
}
