package com.mu.beta.dao;

import com.github.pagehelper.Page;
import com.mu.beta.model.Proposal;
import com.mu.beta.model.ProposalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ProposalMapper {
    long countByExample(ProposalExample example);

    int deleteByExample(ProposalExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Proposal record);

    int insertSelective(Proposal record);

    List<Proposal> selectByExample(ProposalExample example);

    Proposal selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Proposal record, @Param("example") ProposalExample example);

    int updateByExample(@Param("record") Proposal record, @Param("example") ProposalExample example);

    int updateByPrimaryKeySelective(Proposal record);

    int updateByPrimaryKey(Proposal record);

    List<Proposal> listProposal(Proposal record);

    Page<Proposal> listProposalPage(Proposal record);
}