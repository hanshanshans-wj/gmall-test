package com.wuju.gmall.gmalluser.Service;

import com.wuju.gmall.gmalluser.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**
     * 返回所有数据
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据条件查询
     * @param userInfo
     * @return
     */
    List<UserInfo> findUserInfo(UserInfo userInfo);

    /**
     * 根据条件严格查询
     * @param userInfo
     * @return
     */
    List<UserInfo> getUserByName(UserInfo userInfo);

    /**
     * 模糊查询
     * @param nickName
     * @return
     */
    List<UserInfo> getUserByNickName(String nickName);

    /**
     * 增加
     * @param userInfo
     */
    void addUser(UserInfo userInfo);

    /**
     * 根据主键修改
     * @param userInfo
     */
    void updateUserInfo(UserInfo userInfo);

    void updateUserInfoExample(UserInfo userInfo);
}
