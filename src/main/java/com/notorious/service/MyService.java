package com.notorious.service;

import com.notorious.exception.ExceptionType;
import com.notorious.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Rui
 * @date 2020/10/4 15:00
 */
@Service
@Slf4j
public class MyService {
    public void method1() throws ServiceException {
        try{
            /**
             * your service code
             */
            throw new Exception();
        }catch (Exception e){
            log.warn("mysql update exception",e);
            throw new ServiceException("mysql update exception", ExceptionType.MYSQL_EXCEPTION);
        }
    }
}
