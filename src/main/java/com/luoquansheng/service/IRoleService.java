package com.luoquansheng.service;

import com.luoquansheng.entity.Role;

import java.util.List;

public interface IRoleService{

    public List<Role> findAll();

    public void insertRole(Role role);

}
