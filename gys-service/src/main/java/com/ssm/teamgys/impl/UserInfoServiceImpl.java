package com.ssm.teamgys.impl;


import com.ssm.teamgys.domain.UserInfo;
import com.ssm.teamgys.repositorydomain.UserInfoRepository;
import com.ssm.teamgys.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * desc:
 * author:lzp
 * {time}
 * version:1.2.3
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public List<UserInfo> findAll() {
        return userInfoRepository.findAll();
    }

    @Override
    public List<UserInfo> findAll(Sort sort) {
        return userInfoRepository.findAll(sort);
    }

    @Override
    public Page<UserInfo> findAll(Pageable pageable) {
        return userInfoRepository.findAll(pageable);
    }

    @Override
    public List<UserInfo> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return userInfoRepository.count();
    }

    @Override
    public void deleteById(String strId) {
        userInfoRepository.deleteById(Long.valueOf(strId));

    }

    @Override
    public void delete(UserInfo userInfo) {

    }

    @Override
    public void deleteAll(Iterable<? extends UserInfo> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends UserInfo> S save(S s) {
        return userInfoRepository.save(s);
    }

    @Override
    public <S extends UserInfo> List<S> saveAll(Iterable<S> iterable) {
        return userInfoRepository.saveAll(iterable) ;
    }

    @Override
    public Optional<UserInfo> findById(String strId) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String strId) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends UserInfo> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<UserInfo> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public UserInfo getOne(String strId) {
        return userInfoRepository.getOne(Long.valueOf(strId));
    }

    @Override
    public <S extends UserInfo> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends UserInfo> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends UserInfo> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends UserInfo> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends UserInfo> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends UserInfo> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public int update(Long userId, String userPassword, String userAddress, String userPhone, String userName, String userCode) {
        return userInfoRepository.update(userId, userPassword, userAddress, userPhone, userName ,userCode);
    }
}