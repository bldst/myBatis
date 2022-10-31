package com.example.mybatis.mapper;

import com.example.mybatis.Class.Class;

import java.util.List;

public interface Classmapper {
    List<Class>selectByParamas(Class Class);
    List<Class>selectByParamas2(Class Class);
    List<Class>selectByParamas3(Class Class);
    List<Class>updataclass(Class Class);
    List<Class>findclassbyid(List Class);
}
