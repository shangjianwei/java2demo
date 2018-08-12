package com.java.test.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.java.test.model.User;
import com.java.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author test
 * @since 2018-08-12
 * @RestControllerRestController
 * @Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/add")
    public Object add(User user){
//        User user = new User();
//        //user.setId(0);
//        user.setName("aaaa");
//        user.setAge(18);
//        user.setPassword("123456");
        return  userService.insert(user);
    }
    @RequestMapping("/select")
    public Object select(User user ){
//        User user = new User();
//        user.setName("aaaa");
        EntityWrapper entityWrapper = new EntityWrapper(user);
       return userService.selectList(entityWrapper);
    }


}

