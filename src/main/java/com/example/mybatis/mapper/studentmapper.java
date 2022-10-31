package com.example.mybatis.mapper;


import com.example.mybatis.student.student;
import org.apache.ibatis.annotations.*;

//INSERT INTO `student`( `student_name`, `student_sex`, `grade`, `major`) VALUES (#{student_name},#{student_sex},#{grade},#{major})

public interface studentmapper {
    @Insert("INSERT INTO `student`( `student_name`, `student_sex`, `grade`, `major`) VALUES (#{name},#{sex},#{grade},#{major})")
    void insert(student stu);
    @Select("SELECT * FROM `student` WHERE id=#{id}")
    @Results({
            @Result(property = "name",column = "student_name"),
            @Result(property = "sex",column = "student_sex"),
            @Result(property = "grade",column = "student_grade"),
            @Result(property = "major",column = "student_major")
    })
    student getOne(int id);
    @Delete("DELETE FROM `student` WHERE id=#{id}")
    void delete(int id);
    @Update("UPDATE `student` SET `student_name`=#{name} WHERE id=#{id}")
    void update(student student);
}
