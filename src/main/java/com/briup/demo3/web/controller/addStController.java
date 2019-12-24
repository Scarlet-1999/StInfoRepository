package com.briup.demo3.web.controller;

import com.briup.demo3.util.Message;
import com.briup.demo3.bean.Student;
import com.briup.demo3.util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "学生控制器")

public class addStController {

    @GetMapping("/addStudent")
    @ApiOperation(value = "添加学生")

    public String addStudent(Student student){
        System.out.println(student);
        return "信息录入成功！你真棒！";
    }

    @PostMapping("/addStudnet1")
    @ApiOperation(value = "再添加一次")
    public Message addStudent1(){
        return MessageUtil.success("添加成功！");
    }

    @GetMapping("/delStudent")
    //对方法的请求进行注解
    @ApiOperation(value = "删除学生")
    //对参数（一个）进行说明
    //@ApiImplicitParam(name = "stuId",value = "学生学号",paramType = "query",dataType = "int")

    //对多个参数进行说明
    @ApiImplicitParams({
            @ApiImplicitParam(name="stuId",value = "学生学号",paramType ="query",dataType = "int",required = true),
            @ApiImplicitParam(name = "name",value = "学生姓名",paramType="query",dataType = "String")

    })
    public Message delStudent(int stuId,String name){

        return MessageUtil.success("删除成功！");
    }

}
