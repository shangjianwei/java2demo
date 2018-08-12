package com.java.test.service.impl;

import com.java.test.model.Book;
import com.java.test.mapper.BookMapper;
import com.java.test.service.IBookService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author test
 * @since 2018-08-12
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService {

}
