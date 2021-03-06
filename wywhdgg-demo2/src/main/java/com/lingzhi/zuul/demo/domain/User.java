/*
 * 天虹商场股份有限公司版权所有.
 */
package com.lingzhi.zuul.demo.domain;

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
    private int age;
    private String sex;
    private String source;
}
