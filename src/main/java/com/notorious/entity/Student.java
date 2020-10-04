package com.notorious.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long id;
    @NotNull(message = "名字不能为空")
    private String name;
    @NotNull(message = "年龄不能为空")
    @Min(value = 0,message = "年龄最小不能小于0")
    private Integer age;
}
