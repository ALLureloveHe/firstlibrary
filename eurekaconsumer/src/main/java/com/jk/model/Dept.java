package com.jk.model;


import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
public class Dept implements Serializable {
    private  int deptho;
    private  String dname;
    private  String db_source;
}
