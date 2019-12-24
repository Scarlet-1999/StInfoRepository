package com.briup.demo3.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel
public class Student implements Serializable {
    @ApiModelProperty(value = "学生id")
    private String name;
    @ApiModelProperty(value = "学生姓名")
    private  int age;
    @ApiModelProperty(value = "学生id",required = true)
    private  String id;
    @ApiModelProperty(value = "学生性别")
    private String gender;
    @ApiModelProperty(value = "学生院系")
    private String major;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", gender='" + gender + '\'' +
                ", major='" + major + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
