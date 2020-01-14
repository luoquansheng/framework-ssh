package com.luoquansheng.car.service;

import com.luoquansheng.car.entity.UserInfo;

public interface UserInfoService {

    public void register(UserInfo userInfo);

    public void login(UserInfo userInfo);

    public void logout();

}
