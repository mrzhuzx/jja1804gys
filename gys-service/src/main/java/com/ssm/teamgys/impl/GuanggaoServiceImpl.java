package com.ssm.teamgys.impl;

import com.ssm.teamgys.domain.Guanggao;
import com.ssm.teamgys.repositorydomain.GuanggaoRepository;
import com.ssm.teamgys.service.GuanggaoService;
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
 * author :you
 * time: ${DatE}
 */
@Service
public class GuanggaoServiceImpl implements GuanggaoService {
    @Autowired
    GuanggaoRepository guanggaoRepository;

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Guanggao> findAll() { return guanggaoRepository.findAll(); }

    /**
     * 查询全部，带排序条件
     *
     * @param sort
     * @return
     */
    @Override
    public List<Guanggao> findAll(Sort sort) { return guanggaoRepository.findAll(sort);
    }

    /**
     * 查询带分页
     *
     * @param pageable
     * @return Page
     */
    @Override
    public Page<Guanggao> findAll(Pageable pageable) { return guanggaoRepository.findAll(pageable );
    }

    /**
     * 指定ID的集合查询（大数据环境）
     *
     * @param iterable
     * @return
     */
    @Override
    public List<Guanggao> findAllById(Iterable<String> iterable) {
        return null;
    }

    /**
     * 返回条数
     *
     * @return
     */
    @Override
    public long count() {
        return 0;
    }

    /**
     * 根据主键删除
     *
     * @param strId
     */
    @Override
    public void deleteById(String strId) {guanggaoRepository.deleteById(Long.valueOf(strId));

    }

    /**
     * 根据对象删除
     *
     * @param guanggao
     */
    @Override
    public void delete(Guanggao guanggao) {

    }

    /**
     * 批量删除
     *
     * @param iterable
     */
    @Override
    public void deleteAll(Iterable<? extends Guanggao> iterable) {

    }

    /**
     * 删除所有实体,不用或慎用!
     * 删除全部
     */
    @Override
    public void deleteAll() {

    }

    /**
     * 保存对象
     *
     * @param s
     * @return
     */
    @Override
    public <S extends Guanggao> S save(S s) {
        return guanggaoRepository.save(s);
    }

    /**
     * 批量添加
     *
     * @param iterable
     * @return
     */
    @Override
    public <S extends Guanggao> List<S> saveAll(Iterable<S> iterable) {
        return guanggaoRepository.saveAll( iterable);
    }

    /**
     * @param strId
     * @return
     */
    @Override
    public Optional<Guanggao> findById(String strId) {
        return Optional.empty();
    }

    /**
     * 有没有这个对象
     *
     * @param strId
     * @return
     */
    @Override
    public boolean existsById(String strId) {
        return false;
    }

    /**
     * 执行缓存与数据库同步
     */
    @Override
    public void flush() {

    }

    /**
     * 强制执行持久化
     *
     * @param s
     * @return
     */
    @Override
    public <S extends Guanggao> S saveAndFlush(S s) {
        return null;
    }

    /**
     * 删除一个实体集合
     *
     * @param iterable
     */
    @Override
    public void deleteInBatch(Iterable<Guanggao> iterable) {

    }

    /**
     * 删除所有实体集合
     */
    @Override
    public void deleteAllInBatch() {

    }

    /**
     * 返回一个实体
     *
     * @param strId
     * @return
     */
    @Override
    public Guanggao getOne(String strId) {
        return null;
    }

    /**
     * 返回一个实体
     *
     * @param example
     */
    @Override
    public <S extends Guanggao> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    /**
     * 对象条件查询
     *
     * @param example
     * @return
     */
    @Override
    public <S extends Guanggao> List<S> findAll(Example<S> example) {
        return null;
    }

    /**
     * 条件排序
     *
     * @param example
     * @param sort
     * @return
     */
    @Override
    public <S extends Guanggao> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    /**
     * 条件分页
     *
     * @param example
     * @param pageable
     * @return
     */
    @Override
    public <S extends Guanggao> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    /**
     * 多条件带分页
     *
     * @param example
     * @return
     */
    @Override
    public <S extends Guanggao> long count(Example<S> example) {
        return 0;
    }

    /**
     * 查询条件下对象
     *
     * @param example
     * @return
     */
    @Override
    public <S extends Guanggao> boolean exists(Example<S> example) {
        return false;
    }


    @Override
    public int update(long ggId, String ggTitle, String ggImg, String ggUrl) {
        return guanggaoRepository.update(ggId,ggTitle,ggImg,ggUrl);
    }
}
