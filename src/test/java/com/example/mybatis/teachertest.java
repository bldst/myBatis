package com.example.mybatis;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mybatis.Teacher.teacher;
import com.example.mybatis.mapper.teacherMappermp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class teachertest {
    @Autowired
    teacherMappermp teacherMappermp;
    @Test
    void seletone(){
        QueryWrapper wrapper=new QueryWrapper<teacher>();
        wrapper.eq("school","计算机");
        wrapper.orderByAsc("name");
        wrapper.ne("sex","男");
        wrapper.orderByAsc("id");
        System.out.println(teacherMappermp.selectList(wrapper));
        //第一次
    }
    @Test
    void seletwto(){
        QueryWrapper wrapper=new QueryWrapper<teacher>();
        wrapper.gt("id","2");
        wrapper.orderByDesc("school");
        wrapper.lt("id","10");
        wrapper.orderByDesc("id_card");
        System.out.println(teacherMappermp.selectList(wrapper));
    }
    @Test
    void seletthree(){
        QueryWrapper wrapper=new QueryWrapper<teacher>();
        wrapper.likeLeft("name","王%家");
        wrapper.orderByAsc("school");
        wrapper.orderByDesc("name");

        System.out.println(teacherMappermp.selectList(wrapper));
    }
    @Test
    void selettfour(){
        QueryWrapper wrapper=new QueryWrapper<teacher>();
        wrapper.like("name","司");
        wrapper.notLike("name","书");
        wrapper.isNotNull("id_card");
        wrapper.orderByAsc("name");
        wrapper.orderByDesc("sex");

        System.out.println(teacherMappermp.selectList(wrapper));
    }
    @Test
    void selettfive(){
        QueryWrapper wrapper=new QueryWrapper<teacher>();
        wrapper.select("school","count(id) as renshu");
        wrapper.gt("count(id)",">5");
        wrapper.groupBy("school");
        wrapper.orderByAsc("name");
        wrapper.orderByDesc("sex");
        List<teacher> employeeList = teacherMappermp.selectList(wrapper);
        System.out.println(employeeList);
    }
}
