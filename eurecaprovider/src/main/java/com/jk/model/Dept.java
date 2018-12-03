package com.jk.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@AllArgsConstructor
@Getter
@Setter
public class Dept implements Serializable {
    private  int deptho;
    private  String dname;
    private  String db_source;
}
