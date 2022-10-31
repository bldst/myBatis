package com.example.mybatis.mapper;

import com.example.mybatis.student.student;

public interface studentmapper2 {
    void insert(student student);
    void delete(int id);
    student getOne(int id);
    void update(student student);
}
