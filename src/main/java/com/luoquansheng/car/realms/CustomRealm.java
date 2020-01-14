package com.luoquansheng.car.realms;

import com.luoquansheng.car.constant.ShiroConstant;
import com.luoquansheng.car.dao.UserInfoDao;
import com.luoquansheng.car.entity.UserInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @project_name：car-manager
 * @classname：CustomRealm
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/14 14:43
 */
@Component
public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserInfoDao userInfoDao;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        //获取用户账号
        String username = (String) token.getPrincipal();
        char[] credentials = (char[]) token.getCredentials();
        String password = new SimpleHash(Md5Hash.ALGORITHM_NAME, new String(credentials), username, 1).toString();

        List<UserInfo> byUnamePwd = getByUname(username);

        // 处理错误
        if (null == byUnamePwd || byUnamePwd.size() < 1) {
            return null;
        }

        // 比对密码
        if (byUnamePwd.size() > 0) {
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(username, password, getName());
            simpleAuthenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(username));
            return simpleAuthenticationInfo;
        }

        return null;

    }

   @Transactional(propagation = Propagation.REQUIRED)
    public List<UserInfo> getByUname(String userName) {

        StringBuffer hqlBuffer =  new StringBuffer(" FROM " + userInfoDao.getSimpleName());
        hqlBuffer.append(" WHERE user_name = ? ");

        return userInfoDao.findByCondition(hqlBuffer.toString(), userName);
    }


    public static void main(String[] args) {

        ByteSource admin = ByteSource.Util.bytes("zhangsan");
        SimpleHash simpleHash = new SimpleHash(Md5Hash.ALGORITHM_NAME, "123456", admin, 1);

        String s = simpleHash.toString();
        System.out.println(s);

    }

}
