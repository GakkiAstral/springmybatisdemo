package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.pojo.UsersExample;
import com.bjsxt.service.UsersService;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UsersServiceImpl implements UsersService {
    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    /**
     * 添加用户
     * @param users
     */
    @Override
    public void addUsers(Users users) {
        UsersMapper usersMapper = this.getSqlSessionTemplate().getMapper(UsersMapper.class);
        usersMapper.insertSelective(users);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<Users> findUsersAll() {
        UsersMapper usersMapper = this.getSqlSessionTemplate().getMapper(UsersMapper.class);
        UsersExample usersExample = new UsersExample();
        return usersMapper.selectByExample(usersExample);
    }
}
