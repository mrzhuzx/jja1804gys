package com.ssm.teamgys.impl;

import com.ssm.teamgys.domain.SmbmsAddress;
import com.ssm.teamgys.repositorydomain.SmbmsAddressRepository;
import com.ssm.teamgys.service.SmbmsAddressService;
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
 * time：2019/3/25--15:48
 * Author:lanxj
 * desc:
 * version:1.3.22
 */
@Service
public class SmbmsAddressServiceImpl  implements SmbmsAddressService {

    @Autowired
    SmbmsAddressRepository smbmsAddressRepository;
    @Override
    public List<SmbmsAddress> findAll() {
        return smbmsAddressRepository.findAll();
    }

    @Override
    public List<SmbmsAddress> findAll(Sort sort) {
        return smbmsAddressRepository.findAll(sort);
    }

    @Override
    public Page<SmbmsAddress> findAll(Pageable pageable) {
        return smbmsAddressRepository.findAll(pageable);
    }

    @Override
    public List<SmbmsAddress> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return smbmsAddressRepository.count();
    }

    @Override
    public void deleteById(String strId) {
        smbmsAddressRepository.deleteById(Long.valueOf(strId));
    }

    @Override
    public void delete(SmbmsAddress smbmsAddress) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmsAddress> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SmbmsAddress> S save(S s) {
        return smbmsAddressRepository.save(s);
    }

    @Override
    public <S extends SmbmsAddress> List<S> saveAll(Iterable<S> iterable) {
        return smbmsAddressRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmsAddress> findById(String strId) {
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
    public <S extends SmbmsAddress> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmsAddress> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmsAddress getOne(String strId) {
        return smbmsAddressRepository.getOne(Long.valueOf(strId));
    }

    @Override
    public <S extends SmbmsAddress> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmsAddress> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmsAddress> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmsAddress> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmsAddress> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmsAddress> boolean exists(Example<S> example) {
        return false;
    }

    public Integer updateById(Long addId,String addContact){
        return smbmsAddressRepository.updateById(addId,addContact);
    }

    @Override
    public Integer updateAddById(Long addId, String addContact, String addDesc, String addPostCode, String addTelPhone, Date modifyDate) {
        return smbmsAddressRepository.updateAddById(addId,addContact,addDesc,addPostCode,addTelPhone,modifyDate);
    }
}
