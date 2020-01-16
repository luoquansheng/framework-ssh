package com.luoquansheng.entity;

import netscape.security.Privilege;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @project_name：framework-ssh
 * @classname：Role
 * @description: 角色实体类
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/15 9:25
 */
public class Role implements Serializable {

    private static final long serialVersionUID = -2525799442564525959L;
    private String id;
    private String name;
    private String description;
    private Set<UserInfo> users = new HashSet<UserInfo>();
    private Set<Permission> permissions = new HashSet<Permission>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<UserInfo> getUsers() {
        return users;
    }

    public void setUsers(Set<UserInfo> users) {
        this.users = users;
    }

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }
}
