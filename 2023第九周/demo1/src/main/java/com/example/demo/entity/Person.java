package com.example.demo.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@TableName("person")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    /**
     *  id为主键，且自动增长
    */
    @TableId(type = IdType.AUTO)
    @Column(name = "id")
    private int person_id;

    private String name;

    private Integer age;


    public Person(String name, Integer age) {
    }
}
