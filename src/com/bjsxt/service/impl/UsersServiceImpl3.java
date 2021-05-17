package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.pojo.UsersExample;
import com.bjsxt.service.UsersService;

import java.util.List;

public class UsersServiceImpl3 implements UsersService {
    private UsersMapper usersMapper;

    public UsersMapper getUsersMapper() {
        return usersMapper;
    }

    public void setUsersMapper(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public void addUsers(Users users) {

    }

    @Override
    public List<Users> findUsersAll() {
        UsersExample usersExample = new UsersExample();
        return this.usersMapper.selectByExample(usersExample);
    }
}
