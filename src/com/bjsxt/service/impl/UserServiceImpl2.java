package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.pojo.UsersExample;
import com.bjsxt.service.UsersService;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserServiceImpl2 extends SqlSessionDaoSupport implements UsersService {
    @Override
    public void addUsers(Users users) {

    }

    @Override
    public List<Users> findUsersAll() {
        UsersMapper usersMapper = this.getSqlSessionTemplate().getMapper(UsersMapper.class);
        UsersExample usersExample = new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }
}
