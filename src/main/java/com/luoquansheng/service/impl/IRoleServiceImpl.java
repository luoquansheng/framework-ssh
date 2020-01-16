package com.luoquansheng.service.impl;

import com.luoquansheng.dao.RoleDao;
import com.luoquansheng.entity.Role;
import com.luoquansheng.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @project_name：framework-ssh
 * @classname：IRoleServiceImpl
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/15 10:48
 */
@Service
public class IRoleServiceImpl implements IRoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> findAll() {
        return roleDao.findAll();
    }

    @Override
    @Transactional
    public void insertRole(Role role) {
        roleDao.save(role);
    }
}
