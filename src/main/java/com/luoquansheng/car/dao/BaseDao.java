package com.luoquansheng.car.dao;

import java.util.List;

public interface BaseDao<T> {

    public void save(T entity);

    public void delete(String id);

    public void update(T entity);

    public T getById(String id);

    public List<T> getByIds(String[] ids);

    public List<T> findAll();

    public List<T> findByCondition(String hql, Object...obj);

    public String getSimpleName();

    // PageBean getPageBean(int pageNum, String queryListHQL, Object[] parameters);

}
