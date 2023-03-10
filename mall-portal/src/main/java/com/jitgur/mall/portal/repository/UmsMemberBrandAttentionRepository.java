package com.jitgur.mall.portal.repository;

import com.jitgur.mall.portal.domain.UmsMemberBrandAttention;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * 会员品牌关注管理Repository
 * Created by jitgur on 20230214
 */
public interface UmsMemberBrandAttentionRepository extends MongoRepository<UmsMemberBrandAttention, String> {

    /**
     * 取消关注
     */
    int deleteByBrandIdAndMemberId(Long brandId, Long memberId);


    /**
     * 获取品牌关注详情
     */
    UmsMemberBrandAttention findByMemberIdAndBrandId(Long memberId, Long brandId);


    /**
     * 分页获取用户品牌关注列表
     */
    Page<UmsMemberBrandAttention> findByMemberId(Long memberId, Pageable pageable);


    /**
     * 清空当前用户关注列表
     */
    void deleteAllByMemberId(Long memberId);


    /**
     * 获取当前用户所有品牌关注详情
     */
    List<UmsMemberBrandAttention> findAllByMemberId(Long memberId);

}
