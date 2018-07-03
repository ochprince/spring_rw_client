package com.colasoft.spider_rw_client.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/spider")
@RestController
public class SpiderController {

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/all")
    public Map getAll() {
        return restTemplate.getForObject("http://spider-rw-server/spider/all", HashMap.class);
    }

    @GetMapping("/instance/{id}")
    public List<ServiceInstance> showInfo(@PathVariable String id) {
        return this.discoveryClient.getInstances(id);
    }

    @GetMapping("/currentInstance")
    public ServiceInstance currentInstance() {
        return this.loadBalancerClient.choose("spider-rw-server");
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
