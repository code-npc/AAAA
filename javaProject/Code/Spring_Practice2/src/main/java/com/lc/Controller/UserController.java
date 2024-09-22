package com.lc.Controller;

import com.lc.pojo.Result;
import com.lc.pojo.User;
import com.lc.pojo.User_re;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


    @RequestMapping("/getList")
    public Result getList(){
        // 模拟将数据读入到了这里
        List<User> users = new ArrayList<>();
        users.add(new User("张三",19,1));
        users.add(new User("李四",22,1));
        users.add(new User("王五",13,1));
        users.add(new User("陈六",45,0));
        users.add(new User("孙七",26,0));

        List<User_re> userRes = new ArrayList<>();
        // 逻辑处理,处理完的结果给放到userRes集合中去
        for (User user : users) {
            User_re ur = new User_re();
            if (user.getSex() == 1){
                ur.setName(user.getName());
                ur.setAge(user.getAge());
                ur.setSex("男");
            }else if(user.getSex() == 0){
                ur.setName(user.getName());
                ur.setAge(user.getAge());
                ur.setSex("女");
            }
            userRes.add(ur);
        }

        return Result.success(userRes);
    }
}
