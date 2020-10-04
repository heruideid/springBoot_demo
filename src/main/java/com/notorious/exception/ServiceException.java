package com.notorious.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rui
 * @date 2020/10/3 10:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceException extends Exception{
    protected String msg;
    protected ExceptionType exceptionType;
}
