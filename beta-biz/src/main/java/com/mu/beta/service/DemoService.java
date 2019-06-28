package com.mu.beta.service;

import com.github.pagehelper.PageInfo;
import com.mu.beta.model.Proposal;

import java.util.List;

/**
 * 描述: ${DESCRIPTION}</br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/6/28 10:22
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
public interface DemoService {

    String test();

    String select();

    List<Proposal> listProposal(Proposal p);

    PageInfo<Proposal> listProposalPage(Proposal p);

}
