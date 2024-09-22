package com.lc.Controller;

import com.lc.Entry.User;
import com.lc.pojo.Result;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SplittableRandom;

@RestController
public class Hello {
    @RequestMapping("/hello")
    public Result hello(){
        System.out.println("Hello Spring!");
        return Result.success("Hello Spring!");
    }
//public class Hello {
//    @RequestMapping("/hello")
//    public String hello(){
//        System.out.println("Hello Spring!");
//        return "hello Spring!";
//    }
//    简单数据1
@RequestMapping("/simpleData1")
    public String simpleData1(String name,Integer age){
        System.out.println(name + ":" + age);
        return name+":"+age;
    }

    //    简单数据2
    @RequestMapping("/simpleData2")
    public String simpleData2(@RequestParam(value = "name")String username, Integer age){
        System.out.println(username + ":" + age);
        return username+":"+age;
    }

    // 简单实体数据
    @RequestMapping("/simpleEntry")
    public String simpleEntry(User user){
        System.out.println(user);
        return "OK";
    }

    // 复杂实体数据
    @RequestMapping("/complexEntry")
    public String complexEntry(User user){
        System.out.println(user);
        return "OK";
    }

    //数组参数
    @RequestMapping("/arr")
    public String arr(String[] arr){
        System.out.println(Arrays.toString(arr));
        return "OK";
    }

    //集合参数
    @RequestMapping("/list")
    public String list(@RequestParam ArrayList<String > list){
        System.out.println(list);
        return "OK";
    }

    //时间日期类的参数
    @RequestMapping("/time")
    public String time(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime ld){
        System.out.println(ld);
        return "OK";
    }

    //Json参数
    @RequestMapping("/jsonParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    //路径参数
    @RequestMapping("/pathParam/{path1}/{path2}")
    public String pathParam(@PathVariable String path1,@PathVariable String path2){
        System.out.println(path1 + "    "+ path2);
        return "OK";
    }
}

