package com.luoquansheng.entity;

import netscape.security.Privilege;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @project_name：framework-ssh
 * @classname：permission
 * @description: 权限实体类
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/15 9:27
 */
public class Permission implements Serializable {

    /**
     * 序列化id
     */
    private static final long serialVersionUID = 233599616177179392L;

    /**
     * 编号
     */
    private String id;

    /**
     * 权限名
     */
    private String name;

    /**
     * 权限url
     */
    private String uri;

    /**
     * 图标
     */
    private String icon;

    /**
     * 角色
     */
    private Set<Role> roles = new HashSet<Role>();

    /**
     * 父权限
     */
    private Permission parent;

    /**
     * 子权限
     */
    private Set<Permission> children = new HashSet<Permission>();

    public Permission() {
    }

    public Permission(String name, String uri, String icon, Permission parent) {
        this.name = name;
        this.uri = uri;
        this.icon = icon;
        this.parent = parent;
    }

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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Permission getParent() {
        return parent;
    }

    public void setParent(Permission parent) {
        this.parent = parent;
    }

    public Set<Permission> getChildren() {
        return children;
    }

    public void setChildren(Set<Permission> children) {
        this.children = children;
    }
}
