package com.project.eleapi.service.impl;

import com.project.eleapi.entity.User;
import com.project.eleapi.mapper.UserMapper;
import com.project.eleapi.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hudan
 * @since 2020-12-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
