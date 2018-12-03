package com.jk.service;

import com.jk.mapper.DeptMapper;
import com.jk.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeptServiceImpl  implements IDeptService{

    @Resource
    private DeptMapper deptMapper;
    @Override
    public List<Dept> queryDept() {

        List<Dept> list = new ArrayList<>();
        list.add(new Dept(1,"123","321"));
        return list;
    }
}
