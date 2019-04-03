package com.ssm.teamgys.appcomm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Desc: JPA业务接口父类设计中，使用常景快速开发，无业务关联
 * author : teacherzhu
 * 2019/3/23 0023
 */

public class  BaseServiceImpl<T> //implements BaseService<T>
 {


 /*   JpaRepository jpa;

    @Override
    public List<T> findAll() {
        return jpa.findAll();
    }

    @Override
    public List<T> findAll(Sort sort) {
        return jpa.findAll(sort);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return jpa.findAll(pageable);
    }

    @Override
    public List<T> findAllById(Iterable<String> iterable) {
        return jpa.findAllById(iterable);
    }

    @Override
    public long count() {
        return jpa.count();
    }

    @Override
    public void deleteById(String strId) {
        jpa.deleteById(strId);
    }

    @Override
    public void delete(T t) {
        jpa.delete(t);
    }

    @Override
    public void deleteAll(Iterable<? extends T> iterable) {
        jpa.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        jpa.deleteAll();
    }

    @Override
    public <S extends T> S save(S s) {
        return jpa.save(s);
    }

    @Override
    public <S extends T> List<S> saveAll(Iterable<S> iterable) {
        return jpa.saveAll(iterable);
    }

    @Override
    public Optional<T> findById(String strId) {
        return jpa.findById(strId);
    }

    @Override
    public boolean existsById(String strId) {
        return jpa.existsById(strId);
    }

    @Override
    public void flush() {
        jpa.flush();
    }

    @Override
    public <S extends T> S saveAndFlush(S s) {
        return jpa.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<T> iterable) {
        jpa.deleteInBatch(iterable);
    }

    @Override
    public void deleteAllInBatch() {
        jpa.deleteAllInBatch();
    }

    @Override
    public T getOne(String strId) {
        return jpa.getOne(strId);
    }

    @Override
    public <S extends T> Optional<S> findOne(Example<S> example) {
        return jpa.findOne(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example) {
        return jpa.findAll(example);
    }

    @Override
    public <S extends T> List<S> findAll(Example<S> example, Sort sort) {
        return jpa.findAll(example, sort);
    }

    @Override
    public <S extends T> Page<S> findAll(Example<S> example, Pageable pageable) {
        return jpa.findAll(example, pageable);
    }

    @Override
    public <S extends T> long count(Example<S> example) {
        return jpa.count();
    }

    @Override
    public <S extends T> boolean exists(Example<S> example) {
        return jpa.exists(example);
    }*/
}
