package com.luoquansheng.service.impl;

import com.luoquansheng.dao.UserInfoDao;
import com.luoquansheng.entity.UserInfo;
import com.luoquansheng.service.UserInfoService;
import com.luoquansheng.util.ShiroUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @project_name：framework-ssh
 * @classname：UserInfoServiceImpl
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/14 15:21
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    @Transactional
    public void register(UserInfo userInfo) {
        userInfo.setCiphers(ShiroUtil.simpleMd5Hash(Md5Hash.ALGORITHM_NAME, userInfo.getCiphers(), userInfo.getUserName(), 1));
        userInfo.setCreateDate(new Date());
        userInfoDao.save(userInfo);
    }

    @Override
    public void login(UserInfo userInfo) {

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken(userInfo.getUserName(), userInfo.getCiphers());

        // 调用安全认证框架的登录方法
        subject.login(token);

    }

    @Override
    public void logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
    }


}
