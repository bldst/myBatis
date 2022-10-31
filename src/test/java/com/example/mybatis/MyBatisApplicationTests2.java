package com.example.mybatis;

import com.example.mybatis.Card.Card;
import com.example.mybatis.mapper.studentmapper;
import com.example.mybatis.mapper.studentmapper2;
import com.example.mybatis.student.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyBatisApplicationTests2 {
    @Autowired
    com.example.mybatis.mapper.studentmapper2 studentmapper2;
    @Test
    void contextLoads() {
    }
    @Test
    public void testInsert() throws Exception{
        studentmapper2.insert(new student(1,"tt2","wt2","dt2","t"));
    }
    @Test
    public void testGetOne() throws Exception{
        student stu=studentmapper2.getOne(1);
        System.out.println(stu.toString());
    }
    @Test
    public void testDelete(){
        studentmapper2.delete(5);
    }
    @Test
    public void testUpdate() throws Exception{
        student stu=studentmapper2.getOne(6);
        System.out.println(stu.toString());
        stu.setName("sb");
        studentmapper2.update(stu);
        System.out.println(stu.toString());
    }
}
