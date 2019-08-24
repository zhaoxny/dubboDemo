package com.example.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhaoxingyu
 * @description
 * @created 2019/8/23
 * @modified by zhaoxingyu on 2019/8/23
 */
@Data
public class User implements Serializable {
    private Integer age;
    private Integer id;
    private String name;
    private Integer sex;

}
