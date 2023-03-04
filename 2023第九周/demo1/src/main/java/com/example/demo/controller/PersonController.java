package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonMapper personMapper;

    /** 
    * @Description: 新增Person个体 
    * @Param:  
    * @return:
    */ 
    public String insert(String name,Integer age){
        return personMapper.insert(new Person(name,age))>0?"YES":"NO";
    }

    /** 
    * @Description: 查询Person全部个体  
    * @Param:  
    * @return:  
    */ 
    public List<Person> Person_select(){
        return personMapper.selectList(null);
    }
    /**
    * @Description: 通过id查询单条Person数据
    * @Param:
    * @return:
    */
    public Person person_selectOne(int id){
        return personMapper.selectById(id);
    }
    
    /**
    * @Description: 通过id更新Person信息 
    * @Param:  
    * @return:  返回字符串
    */ 
    public String person_update(int id,String name,Integer age){
        Person person = person_selectOne(id);
        if (person!=null){
            person.setAge(age);
            person.setName(name);
            return "YES";
        }else
            return "NO";

    }

    /**
    * @Description: 删除person个体
    * @Param:  person的Id
    * @return:
    */
    public String person_deleteOne(int id){
        return personMapper.deleteById(id)>0?"YES!":"NO";
    }
}
