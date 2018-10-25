package com.zw.admin.server.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


public interface BaseDao<T> {
    int create(T t);

    int creates(List<T> t);

    int delete(Long id);

    int update(T t);

    T load(Long id);

    List<T> loads(List<Long> ids);

    List<T> getAll();

    List<T> list(Map<String, Object> criteria);

    List<T> paging(Map<String, Object> criteria);

    Long count(Map<String, Object> criteria);
}
