package com.spring.orm.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_user")
@Data
public class User {
    //标注主键和生成策略
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //类型必须为封装类型的Long大写的L
    private Long id;
    private String account;
    private String password;
    private Integer credits;


}
