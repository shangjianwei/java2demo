package com.java.test.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.java.test.model.Book;
import com.java.test.model.User;
import com.java.test.service.IBookService;
import com.java.test.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author test
 * @since 2018-08-12
 */
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    IBookService iBookService;
    @Autowired
    IUserService userService;
    @RequestMapping("/add")
    public Object add(Book book){
//        User user = new User();
//        //user.setId(0);
//        user.setName("aaaa");
//        user.setAge(18);
//        user.setPassword("123456");
        return  iBookService.insert(book);
    }
    @RequestMapping("/select")
    public Object select(Book book){
//        User user = new User();
//        user.setName("aaaa");
        EntityWrapper entityWrapper = new EntityWrapper(book);
        return iBookService.selectList(entityWrapper);
    }

    @RequestMapping("/select2")
    public Object select2() {
        Book book = new Book();
        book.setName("小妹");
        EntityWrapper entityWrapper = new EntityWrapper(book);
        List<Book> list =  iBookService.selectList(entityWrapper);
        List<Map> mapList = new ArrayList<>();
        for (Book book1:list){
            User user = new User();
            user.setName(book1.getName());
            EntityWrapper wrapper = new EntityWrapper(user);
            List<User> list1 = userService.selectList(wrapper);
        }
         return null;
    }
}

