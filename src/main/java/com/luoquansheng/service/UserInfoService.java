package com.luoquansheng.service;

import com.luoquansheng.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    public void register(UserInfo userInfo);

    public void login(UserInfo userInfo);

    public void logout();

    public List<UserInfo> findAll();

}
