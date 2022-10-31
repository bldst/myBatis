package com.example.mybatis;

import com.example.mybatis.Class.Class;
import com.example.mybatis.mapper.Classmapper;
import com.example.mybatis.mapper.studentmapper;
import com.example.mybatis.student.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class ClassTest {
    @Autowired
    Classmapper classmapper;
    @Test
    public void testselectByParamas(){
        Class Class=new Class();
        Class.setName("");
        Class.setGrade("");
        Class.setNumber("");
        System.out.println(classmapper.selectByParamas(Class));
    }
    @Test
    public void testselectByParamas2(){
        Class Class=new Class();
        Class.setName("");
        Class.setGrade("");
        Class.setNumber("");
        System.out.println(classmapper.selectByParamas2(Class));
    }
    @Test
    public void testselectByParamas3(){
        Class Class=new Class();
        Class.setName("");
        Class.setGrade("");
        Class.setNumber("");
        System.out.println(classmapper.selectByParamas3(Class));
    }
    @Test
    public void updataclass(){
        Class Class=new Class();
        Class.setId(1);
        Class.setName("111班");
        Class.setGrade("");

        System.out.println(classmapper.updataclass(Class));
    }
    @Test
    public void findclassbyid(){
        List<String> nameList=new ArrayList<>();
        nameList.add("计本");nameList.add("信工");


        System.out.println(classmapper.findclassbyid(nameList));
    }

}
