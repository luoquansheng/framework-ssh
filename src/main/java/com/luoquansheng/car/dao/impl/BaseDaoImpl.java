package com.luoquansheng.car.dao.impl;

import com.luoquansheng.car.dao.BaseDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.util.Collections;
import java.util.List;

/**
 * @project_name：car-manager
 * @classname：BaseDaoImpl
 * @description:
 * @author: 罗铨生
 * @version: 0.1
 * @date: 2020/1/14 13:01
 */
public class BaseDaoImpl<T> implements BaseDao<T> {

    @Autowired
    private SessionFactory sessionFactory;
    protected Class<T> clazz; // 这是一个问题！

    public BaseDaoImpl() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        this.clazz = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public void save(T entity) {
        getSession().save(entity);
    }

    @Override
    public void delete(String id) {
        Object obj = getSession().get(clazz, id);
        getSession().delete(obj);
    }

    @Override
    public void update(T entity) {
        getSession().update(entity);
    }

    @Override
    public T getById(String id) {
        if (id == null) {
            return null;
        }
        return (T) getSession().get(clazz, id);
    }

    @Override
    public List<T> getByIds(String[] ids) {
        if (ids == null || ids.length == 0) {
            return Collections.EMPTY_LIST;
        }

        return getSession().createQuery(" FROM " + clazz.getSimpleName() + " WHERE id IN (:ids)").setParameterList("ids", ids).list();
    }

    @Override
    public List<T> findAll() {
        return getSession().createQuery("FROM " + clazz.getSimpleName()).list();
    }

    @Override
    public List<T> findByCondition(String hql, Object... obj) {

        Query query = getSession().createQuery(hql);

        for (int i = 0; i < obj.length; i++) {
            query.setParameter(i, obj[i]);
        }

        return query.list();
    }

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public String getSimpleName() {
        return clazz.getSimpleName();
    }

}
