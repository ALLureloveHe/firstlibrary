package com.jk.controller;

import com.jk.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {
    @Resource
    private DeptServiceImpl deptService;

    @RequestMapping("queryDeptConsumer")
    List queryDept(){
        return deptService.queryDept();
    }
}
