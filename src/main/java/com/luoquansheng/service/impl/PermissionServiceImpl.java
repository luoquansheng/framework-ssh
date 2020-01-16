package com.luoquansheng.service.impl;

import com.luoquansheng.dao.PermissionDao;
import com.luoquansheng.entity.Permission;
import com.luoquansheng.service.IPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @project_name：framework-ssh
 * @classname：PermissionServiceImpl
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/16 9:38
 */
@Service
public class PermissionServiceImpl implements IPermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }
}
