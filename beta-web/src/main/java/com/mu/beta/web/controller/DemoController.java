package com.mu.beta.web.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mu.beta.model.Proposal;
import com.mu.beta.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述: ${DESCRIPTION}</br>
 *
 * @author yuas
 * @version 1.0.0
 * @since 2019/6/28 10:12
 * <p>
 * Copyright © 2019 BZN Corporation, All Rights Reserved.
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("test")
    public String test() {
        return "hello beta!";
    }

    @GetMapping("service")
    public String service() {
        return demoService.test();
    }

    @GetMapping("select")
    public String select() {
        return demoService.select();
    }

    @GetMapping("/lists")
    public List<Proposal> lists() {
        Proposal p = new Proposal();
        p.setProductCode("P00001571");
        return demoService.listProposal(p);
    }

    @GetMapping("/listPage")
    public PageInfo<Proposal> listPage() {
        Proposal p = new Proposal();
        p.setProductCode("P00001571");
        return demoService.listProposalPage(p);
    }
}
