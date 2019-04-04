package com.ssm.teamgys.repositorydomain;
import com.ssm.teamgys.domain.Guanggao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * desc:
 * author :you
 * time: ${DatE}
 */
@Repository
public interface GuanggaoRepository extends JpaRepository<Guanggao,Long> {
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query("update Guanggao set ggId=?1 ,ggTitle=?2,ggImg=?3where ggUrl=?4 ")
    int update(Long ggId, String ggTitle, String ggImg, String ggUrl);
}
