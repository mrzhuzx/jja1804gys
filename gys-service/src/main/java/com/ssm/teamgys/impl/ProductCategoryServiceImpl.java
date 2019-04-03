package com.ssm.teamgys.impl;

import com.ssm.teamgys.domain.ProductCategory;
import com.ssm.teamgys.repositorydomain.ProductCategoryRepository;
import com.ssm.teamgys.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    ProductCategoryRepository productCategoryRepository;


    @Override
    public List<ProductCategory> findAll() {
        return productCategoryRepository.findAll();
    }

    @Override
    public List<ProductCategory> findAll(Sort sort) {
        return productCategoryRepository.findAll(sort);
    }

    @Override
    public Page<ProductCategory> findAll(Pageable pageable) {
        return productCategoryRepository.findAll(pageable);
    }

    @Override
    public List<ProductCategory> findAllById(Iterable<String> iterable) {
        return productCategoryRepository.findAllById(iterable);
    }

    @Override
    public long count() {
        return productCategoryRepository.count();
    }

    @Override
    public void deleteById(String strId) {
        productCategoryRepository.deleteById(strId);

    }

    @Override
    public void delete(ProductCategory productCategory) {

        productCategoryRepository.delete(productCategory);

    }

    @Override
    public void deleteAll(Iterable<? extends ProductCategory> iterable) {


    }

    @Override
    public void deleteAll() {

        productCategoryRepository.deleteAll();
    }

    @Override
    public <S extends ProductCategory> S save(S s) {
        return productCategoryRepository.save(s);
    }

    @Override
    public <S extends ProductCategory> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<ProductCategory> findById(String strId) {
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
    public <S extends ProductCategory> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<ProductCategory> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ProductCategory getOne(String strId) {
        return null;
    }

    @Override
    public <S extends ProductCategory> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ProductCategory> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends ProductCategory> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends ProductCategory> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ProductCategory> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ProductCategory> boolean exists(Example<S> example) {
        return false;
    }


    @Override
    public int update(String categoryId, String categoryName, Integer categoryType) {

        productCategoryRepository.update(categoryId,  categoryName, categoryType);
        return  1;
    }

    @Override
    public ProductCategory findbyid(String categoryId) {

     return productCategoryRepository.getOne(categoryId);

    }




}
