package com.ssm.teamgys.impl;

import com.ssm.teamgys.domain.SmbmsBill;
import com.ssm.teamgys.repositorydomain.SmbmsBillRepository;
import com.ssm.teamgys.service.SmbmsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 */
@Service
public class SmbmsBillServiceImpl implements SmbmsBillService {
    @Autowired
    SmbmsBillRepository smbmsBillRepository;
    @Override
    public List<SmbmsBill> findAll() {
        return smbmsBillRepository.findAll();
    }

    @Override
    public List<SmbmsBill> findAll(Sort sort) {
        return smbmsBillRepository.findAll(sort);
    }

    @Override
    public Page<SmbmsBill> findAll(Pageable pageable) {
        return smbmsBillRepository.findAll(pageable);
    }

    @Override
    public List<SmbmsBill> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return smbmsBillRepository.count();
    }

    @Override
    public void deleteById(String strId) {
        smbmsBillRepository.deleteById(Long.valueOf(strId));
    }

    @Override
    public void delete(SmbmsBill smbmsBill) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmsBill> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SmbmsBill> S save(S s) {
        return smbmsBillRepository.save(s);
    }

    @Override
    public <S extends SmbmsBill> List<S> saveAll(Iterable<S> iterable) {
        return smbmsBillRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmsBill> findById(String strId) {
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
    public <S extends SmbmsBill> S saveAndFlush(S s) {
        return smbmsBillRepository.saveAndFlush(s);
    }

    @Override
    public void deleteInBatch(Iterable<SmbmsBill> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmsBill getOne(String strId) {
        return smbmsBillRepository.getOne(Long.valueOf(strId.trim()));
    }

    @Override
    public <S extends SmbmsBill> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmsBill> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmsBill> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmsBill> boolean exists(Example<S> example) {
        return false;
    }


    @Override
    public int update(Long billId , String billCode, String productId, String productName, String productDesc, Integer productCount, String productUnit, Double totalPrice, Integer isPayment, Long providerId, String proImg, Long addressId) {
        return smbmsBillRepository.update(billId,billCode,productId,productName,productDesc, productCount,productUnit,totalPrice,isPayment,providerId,proImg,addressId);
    }
}
