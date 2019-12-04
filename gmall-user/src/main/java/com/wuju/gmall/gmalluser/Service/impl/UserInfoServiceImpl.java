package com.wuju.gmall.gmalluser.Service.impl;

import com.wuju.gmall.gmalluser.Service.UserInfoService;
import com.wuju.gmall.gmalluser.bean.UserInfo;
import com.wuju.gmall.gmalluser.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService{
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public List<UserInfo> findAll() {
        List<UserInfo> userInfos = userInfoMapper.selectAll();
        return userInfos;
    }

    @Override
    public List<UserInfo> findUserInfo(UserInfo userInfo) {
        List<UserInfo> select = userInfoMapper.select(userInfo);
        return select;
    }

    @Override
    public List<UserInfo> getUserByName(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("name",userInfo.getName());
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);

        return userInfos;
    }

    @Override
    public List<UserInfo> getUserByNickName(String nickName) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andLike("nickName","%"+nickName+"%");
        List<UserInfo> userInfos = userInfoMapper.selectByExample(example);
        return userInfos;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userInfoMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        userInfoMapper.updateByPrimaryKey(userInfo);
    }

    @Override
    public void updateUserInfoExample(UserInfo userInfo) {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andEqualTo("email",userInfo.getEmail());
        userInfoMapper.updateByExampleSelective(userInfo,example);
    }
    @Override
    public void delete(UserInfo userInfo) {
    userInfoMapper.delete(userInfo);
    }

    @Override
    public void deleteByExample() {
        Example example = new Example(UserInfo.class);
        example.createCriteria().andBetween("phoneNum",4000,6000);

        userInfoMapper.deleteByExample(example);
    }

    @Override
    public void deleteByPrimaryKey(String id) {
        userInfoMapper.deleteByPrimaryKey(id);
    }
}
