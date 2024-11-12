package edu.dzkj.cloud.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import edu.dzkj.cloud.mybatisx.entity.User;
import edu.dzkj.cloud.mybatisx.service.UserService;
import edu.dzkj.cloud.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【user】的数据库操作Service实现
* @createDate 2024-11-12 10:18:07
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




