package com.ssm.teamgys.appcomm;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * Desc: jpa业务接口父类设计中
 * author : teacherzhu
 * 2019/3/23 0023
 */
public interface BaseService<T> {

     /**
      *  查询全部
      * @return
      */
     List<T> findAll();

     /**
      * 查询全部，带排序条件
      * @param sort
      * @return
      */
     List<T> findAll(Sort sort);

     /**
      * 查询带分页
      * @param pageable
      * @return Page
      */
     Page<T> findAll(Pageable pageable);

     /**
      * 指定ID的集合查询（大数据环境）
      * @param iterable
      * @return
      */
     List<T> findAllById(Iterable<String> iterable);

     /**
      * 返回条数
      * @return
      */
     long count();

     /**
      * 根据主键删除
      * @param strId
      */
     void deleteById(String strId);

     /**
      * 根据对象删除
      *
      */
     void delete(T t);

     /**
      * 批量删除
      * @param iterable
      */
     void deleteAll(Iterable<? extends T> iterable);

     /**
      * 删除所有实体,不用或慎用!
      * 删除全部
      */
     void deleteAll() ;

     /**
      * 保存对象
      * @param s
      * @param <S>
      * @return
      */
     <S extends T> S save(S s);

     /**
      * 批量添加
      * @param iterable
      * @param <S>
      * @return
      */
     <S extends T> List<S> saveAll(Iterable<S> iterable) ;

     /**
      *
      * @param strId
      * @return
      */
     Optional<T> findById(String strId);

     /**
      * 有没有这个对象
      * @param strId
      * @return
      */
     boolean existsById(String strId) ;

     /**
      * 执行缓存与数据库同步
      */
     void flush();

     /**
      * 强制执行持久化
      * @param s
      * @param <S>
      * @return
      */
     <S extends T> S saveAndFlush(S s) ;

     /**
      *删除一个实体集合
      * @param iterable
      */
     void deleteInBatch(Iterable<T> iterable);

     /**
      *删除所有实体集合
      */
     void deleteAllInBatch();

     /**
      * 返回一个实体
      * @param strId
      * @return
      */
     T getOne(String strId) ;

     /**
      * 返回一个实体

      */
     <S extends T> Optional<S> findOne(Example<S> example);

     /**
      * 对象条件查询
      * @param example
      * @param <S>
      * @return
      */
     <S extends T> List<S> findAll(Example<S> example);

     /**
      * 条件排序
      * @param example
      * @param sort
      * @param <S>
      * @return
      */
     <S extends T> List<S> findAll(Example<S> example, Sort sort);


     /**
      * 条件分页
      * @param example
      * @param pageable
      * @param <S>
      * @return
      */
     <S extends T> Page<S> findAll(Example<S> example, Pageable pageable);

     /**
      * 多条件带分页
      * @param example
      * @param <S>
      * @return
      */
     <S extends T> long count(Example<S> example) ;

     /**
      *  查询条件下对象
      * @param example
      * @param <S>
      * @return
      */
     <S extends T> boolean exists(Example<S> example) ;
}



