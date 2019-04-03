package com.ssm.teamgys.repositorydomain;

import com.ssm.teamgys.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository //数据库dao
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,String> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(" update ProductCategory set categoryName=?2,categoryType=?3  where categoryId=?1")
    int  update(String categoryId, String categoryName, Integer categoryType);
}
