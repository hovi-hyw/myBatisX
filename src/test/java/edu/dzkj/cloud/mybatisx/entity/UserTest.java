package edu.dzkj.cloud.mybatisx.entity;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.dzkj.cloud.mybatisx.mapper.UserMapper;
import edu.dzkj.cloud.mybatisx.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void test01() {
        User user = userMapper.selectById(1);
        System.out.println(user);
        user.setEmail("cooper@qq.com");
        userMapper.updateById(user);
        System.out.println(user);

    }

    @Test
    public void test02() {
        IPage<User> page = new Page<>(2, 3);
        Page<User> userPage = (Page<User>) userService.page(page);
        userPage.getRecords().forEach(System.out::println);
    }

//    @Test
//    public void test03() {
//        userService.update()
//    }
}