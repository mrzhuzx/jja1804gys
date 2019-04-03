package com.ssm.teamgys.impl;
/*
 *desc:
 *author:wjs
 *time:2019/3/25 0025
 *version:1.2.3
 */


import com.ssm.teamgys.domain.SmbmsUser;
import com.ssm.teamgys.repositorydomain.SmbmsUserRepository;
import com.ssm.teamgys.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SmbmsUserServiceImpl implements SmbmsUserService {

    @Autowired
    SmbmsUserRepository smbmsUserRepository;

    @Override
    public List<SmbmsUser> findAll() {
        return smbmsUserRepository.findAll();
    }

    @Override
    public List<SmbmsUser> findAll(Sort sort) {
        return smbmsUserRepository.findAll(sort);
    }

    @Override
    public Page<SmbmsUser> findAll(Pageable pageable) {
        return smbmsUserRepository.findAll(pageable);
    }

    @Override
    public List<SmbmsUser> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String strId) {smbmsUserRepository.deleteById(Long.valueOf(strId));
    }

    @Override
    public void delete(SmbmsUser SmbmsUser) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmsUser> iterable) {

    }

    @Override
    public void deleteAll() { smbmsUserRepository.deleteAll();

    }

    @Override
    public <S extends SmbmsUser> S save(S s) {
        return smbmsUserRepository.save(s);
    }

    @Override
    public <S extends SmbmsUser> List<S> saveAll(Iterable<S> iterable) {
        return smbmsUserRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmsUser> findById(String strId) {
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
    public <S extends SmbmsUser> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmsUser> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmsUser getOne(String strId) {
        return smbmsUserRepository.getOne(Long.valueOf(strId.trim()));
    }

    @Override
    public <S extends SmbmsUser> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmsUser> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmsUser> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmsUser> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmsUser> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmsUser> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public int update(String userCode, String userName, String userPassword, String userPhone, Long userId) {
        return smbmsUserRepository.update(userCode,userName,userPassword,userPhone,userId);
    }

}
