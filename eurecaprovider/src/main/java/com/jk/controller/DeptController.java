package com.jk.controller;

import com.jk.model.Dept;
import com.jk.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController {

    @Resource
    private IDeptService iDeptService;
    @RequestMapping("/dept")
    List<Dept> queryDept(){
        List<Dept> dept = iDeptService.queryDept();
        return dept;
    };

}
