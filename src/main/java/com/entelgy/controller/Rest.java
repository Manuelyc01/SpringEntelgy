package com.entelgy.controller;

import com.entelgy.models.DataContainer;
import com.entelgy.service.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Rest {

    @Value("${test.url}")
    private String url;

    private final Service service;

    public Rest(Service service) {
        this.service = service;
    }

    @PostMapping("listar")
    public DataContainer listar(){
        return service.list(url);
    }


}
