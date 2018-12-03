package com.jk.service;

import com.jk.model.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IDeptService {

    List<Dept> queryDept();
}
