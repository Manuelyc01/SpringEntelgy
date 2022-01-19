package com.entelgy.service;

import com.entelgy.models.DataContainer;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ServiceImpl implements com.entelgy.service.Service {

    @Override
    public DataContainer list(String url){

        RestTemplate restTemplate = new RestTemplate();
        RestTemplateBuilder restTemplateBuilder= new RestTemplateBuilder();
        restTemplate=restTemplateBuilder.build();

        DataContainer dts=restTemplate.getForObject(url,DataContainer.class);
        return  dts;
    }

}
