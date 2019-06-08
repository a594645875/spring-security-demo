package com.czc.oauth2.service.impl;

import com.czc.oauth2.entity.User;
import com.czc.oauth2.mapper.UserMapper;
import com.czc.oauth2.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-06-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
