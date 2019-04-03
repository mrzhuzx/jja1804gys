package com.ssm.teamgys.impl;

import com.ssm.teamgys.domain.SmbmsProvider;
import com.ssm.teamgys.repositorydomain.SmbmsProviderRepository;
import com.ssm.teamgys.service.SmbmsProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * time：2019/3/25--15:52
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@Service
public class SmbmsProviderServiceImpl implements SmbmsProviderService {
    @Autowired
    SmbmsProviderRepository smbmsProviderRepository;
    @Override
    public List<SmbmsProvider> findAll() {
        return smbmsProviderRepository.findAll();
    }

    @Override
    public List<SmbmsProvider> findAll(Sort sort) {
        return smbmsProviderRepository.findAll(sort);
    }

    @Override
    public Page<SmbmsProvider> findAll(Pageable pageable) {
        return smbmsProviderRepository.findAll(pageable);
    }

    @Override
    public List<SmbmsProvider> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String strId) {
        smbmsProviderRepository.deleteById(Long.valueOf(strId));
    }

    @Override
    public void delete(SmbmsProvider smbmsProvider) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmsProvider> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SmbmsProvider> S save(S s) {
        return smbmsProviderRepository.save(s);
    }

    @Override
    public <S extends SmbmsProvider> List<S> saveAll(Iterable<S> iterable) {
        return smbmsProviderRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmsProvider> findById(String strId) {
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
    public <S extends SmbmsProvider> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmsProvider> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmsProvider getOne(String strId) {
        return smbmsProviderRepository.getOne(Long.valueOf(strId));
    }

    @Override
    public <S extends SmbmsProvider> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmsProvider> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmsProvider> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmsProvider> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmsProvider> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmsProvider> boolean exists(Example<S> example) {
        return false;
    }

    public Integer updateById(Long proId,String proName){
        return smbmsProviderRepository.updateById(proId,proName);
    }

    @Override
    public Integer updateProById(Long proId, String proCode, String proName, String proDesc, String proContact, String proPhone, String proAddress, String proFax, Date modifyDate) {
        return smbmsProviderRepository.updateProById(proId,proCode,proName,proDesc,proContact,proPhone,proAddress,proFax,modifyDate);
    }
}
