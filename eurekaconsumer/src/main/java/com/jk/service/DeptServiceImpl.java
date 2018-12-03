package com.jk.service;

import com.jk.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service
public class DeptServiceImpl {

    @Autowired
    private LoadBalancerClient loadBalancerClient;//ribbon 负载均衡器

    public List<Dept> queryDept() {

        //选择调用服务的名称   ServiceInstance封装了服务的信息以及端口 ip
        ServiceInstance si = this.loadBalancerClient.choose("eurecaprovicer");
        //拼接访问的url
        StringBuffer buffer = new StringBuffer();
        buffer.append("http://").append(si.getHost()).append(":").append(si.getPort()).append("/dept");
        //springmvc RestTemplate
        RestTemplate template = new RestTemplate();

        //用于处理返回类型的对象
        ParameterizedTypeReference<List<Dept>> type = new ParameterizedTypeReference<List<Dept>>() {};
        //ResponseEntity:封装了返回值信息  第一个参数 代表的是你的请求地址；第二个参数是你请求参数的类型，第三个是你传递的参数（比如 条查了分页了）,
        //第四个为返回值的对象
        //ResponseEntity:封装了返回值信息
        ResponseEntity<List<Dept>> response = template.exchange(buffer.toString(),HttpMethod.GET, null, type);
        List<Dept> list = response.getBody();
        return list;
    }
}
