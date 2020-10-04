package com.notorious.vo;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.Map;

/**
 * @author Rui
 * @date 2020/10/4 16:47
 */
@Data
@Slf4j
public class ErrorVO {
    private Date timestamp;
    private Map<String, String[]> params;
    private String desc;

    public ErrorVO(Date timestamp, Map<String, String[]> params, String desc) {
        this.timestamp = timestamp;
        this.params = params;
        this.desc = desc;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (Exception e) {
            log.warn("toString error.", e);
            return String.format("ErrorDTO{timestamp=%s, params=%s, desc='%s'}",timestamp,params,desc);
        }
    }
}