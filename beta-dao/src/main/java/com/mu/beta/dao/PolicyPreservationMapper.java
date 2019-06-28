package com.mu.beta.dao;

import com.mu.beta.model.PolicyPreservation;
import org.springframework.stereotype.Component;

@Component
public interface PolicyPreservationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PolicyPreservation record);

    int insertSelective(PolicyPreservation record);

    PolicyPreservation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PolicyPreservation record);

    int updateByPrimaryKey(PolicyPreservation record);
}