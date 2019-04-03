package com.ssm.teamgys.impl;

import com.ssm.teamgys.domain.SmbmsRole;
import com.ssm.teamgys.repositorydomain.SmbmsRoleRepository;
import com.ssm.teamgys.service.SmbmsRoleService;
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
public class SmbmsRoleServiceImpl implements SmbmsRoleService {
    @Autowired
    SmbmsRoleRepository smbmsRoleRepository;

    @Override
    public List<SmbmsRole> findAll() {
        return smbmsRoleRepository.findAll();
    }

    @Override
    public List<SmbmsRole> findAll(Sort sort) {
        return smbmsRoleRepository.findAll(sort);
    }

    @Override
    public Page<SmbmsRole> findAll(Pageable pageable) {
        return smbmsRoleRepository.findAll(pageable);
    }

    @Override
    public List<SmbmsRole> findAllById(Iterable<String> iterable) {
        return null;
    }

    @Override
    public long count() {
        return smbmsRoleRepository.count();
    }

    @Override
    public void deleteById(String strId) {
        smbmsRoleRepository.deleteById(Long.valueOf(strId));

    }

    @Override
    public void delete(SmbmsRole smbmRole) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmbmsRole> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends SmbmsRole> S save(S s) {
        return smbmsRoleRepository.save(s);
    }

    @Override
    public <S extends SmbmsRole> List<S> saveAll(Iterable<S> iterable) {
        return smbmsRoleRepository.saveAll(iterable);
    }

    @Override
    public Optional<SmbmsRole> findById(String strId) {
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
    public <S extends SmbmsRole> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<SmbmsRole> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public SmbmsRole getOne(String strId) {
        return smbmsRoleRepository.getOne(Long.valueOf(strId));
    }

    @Override
    public <S extends SmbmsRole> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends SmbmsRole> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends SmbmsRole> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends SmbmsRole> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends SmbmsRole> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends SmbmsRole> boolean exists(Example<S> example) {
        return false;
    }


    @Override
    public int update(Long roleId, String roleName, String roleDesc, Integer roleStatus, String roleCode) {
        return smbmsRoleRepository.update(roleId,roleName,roleDesc,roleStatus,roleCode);
    }
}
