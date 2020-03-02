package com.example.demo;

import java.util.List;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("product-service")

public interface UserServiceClient {
@LoadBalanced
@RequestMapping(value = "productapi/all", method = RequestMethod.GET)
public List<Product> getUsers();

}
