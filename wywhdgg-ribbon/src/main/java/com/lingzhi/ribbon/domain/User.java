package com.lingzhi.ribbon.domain;

import lombok.Data;
import lombok.ToString;

/**
 * 功能说明
 * @author dongzhb
 * @version 1.0.0
 * @date 2020/11/21 14:54
 */
@Data
@ToString
public class User {
    private String name;
    private  int age;
    private String sex;
}
