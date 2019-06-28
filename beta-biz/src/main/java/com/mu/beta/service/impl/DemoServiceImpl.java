package com.mu.beta.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mu.beta.dao.ProposalMapper;
import com.mu.beta.model.Proposal;
import com.mu.beta.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述: ${DESCRIPTION}</br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/6/28 10:23
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private ProposalMapper proposalMapper;

    @Override
    public String test(){
        return "Hello service!";
    }


    @Override
    public String select(){
        return proposalMapper.selectByPrimaryKey(116577999289192448L).getInsuranceName();
    }

    @Override
    public List<Proposal> listProposal(Proposal p){
        PageHelper.startPage(1, 10);
        return proposalMapper.listProposal(p);
    }

    @Override
    public PageInfo<Proposal> listProposalPage(Proposal p){
        PageHelper.startPage(1, 10);

        PageInfo<Proposal> pageInfo = new PageInfo<>(proposalMapper.listProposalPage(p));
        return pageInfo;
    }

}
