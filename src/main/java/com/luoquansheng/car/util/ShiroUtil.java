package com.luoquansheng.car.util;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @project_name：car-manager
 * @classname：ShiroUtil
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/14 20:40
 */
public class ShiroUtil {

    public static String simpleMd5Hash(String algorithmName, String source, String salt, Integer hashIterations) {
        return new SimpleHash(Md5Hash.ALGORITHM_NAME, source, ByteSource.Util.bytes(salt), hashIterations).toString();
    }

}
