package com.example.demo.pojo;


import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * 〈实体类〉
 *
 * @author hanxulei
 * @create 2018/10/11
 * @since 1.0.0
 */
@Entity
@Table(name = "User")
@DynamicUpdate
@DynamicInsert
@Data//get-set方法
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, columnDefinition = "int(30) COMMENT '自增ID，主键'")
    private Integer id;

    @Column(name = "username", columnDefinition = "varchar(255) COMMENT '姓名'")
    private String name;

    @Column(name = "age", columnDefinition = "int(30) COMMENT '年龄'")
    private Integer age;


}
