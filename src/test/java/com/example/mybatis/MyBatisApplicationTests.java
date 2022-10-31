package com.example.mybatis;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis.Class.Class;
import com.example.mybatis.mapper.studentMPmapper;
import com.example.mybatis.mapper.studentmapper;
import com.example.mybatis.student.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
class MyBatisApplicationTests {
    @Autowired
    studentmapper studentmapper;
    @Autowired
    com.example.mybatis.mapper.studentMPmapper studentMPmapper;

    @Test
    void testplus(){

    }



    @Test
    void contextLoads() {
    }
    @Test
    public void testInsert() throws Exception{
        studentmapper.insert(new student(1,"tt","wt","dt","tf"));
    }
    @Test
    public void testGetOne() throws Exception{
        student stu=studentmapper.getOne(1);
        System.out.println(stu.toString());
    }
    @Test
    public void testDelete(){
        studentmapper.delete(2);
    }
    @Test
    public void testUpdate() throws Exception{
        student stu=studentmapper.getOne(3);
        System.out.println(stu.toString());
        stu.setName("sb");
        studentmapper.update(stu);
        System.out.println(stu.toString());
    }
}
