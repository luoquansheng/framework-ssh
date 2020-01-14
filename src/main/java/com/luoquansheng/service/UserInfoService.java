package com.luoquansheng.service;

import com.luoquansheng.entity.UserInfo;

public interface UserInfoService {

    public void register(UserInfo userInfo);

    public void login(UserInfo userInfo);

    public void logout();

}
