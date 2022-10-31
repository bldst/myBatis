package com.example.mybatis.Teacher;

import com.baomidou.mybatisplus.annotation.TableField;

public class teacher {
    private int id;
    private String name;
    private String sex;
    @TableField("work_number")
    private String worknumber;
    @TableField("id_card")
    private String idcard;
    private String school;
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", worknumber='" + worknumber + '\'' +
                ", idcard='" + idcard + '\'' +
                ", school='" + school + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(String worknumber) {
        this.worknumber = worknumber;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
