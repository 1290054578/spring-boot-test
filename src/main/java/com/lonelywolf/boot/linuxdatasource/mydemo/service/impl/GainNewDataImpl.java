package com.lonelywolf.boot.linuxdatasource.mydemo.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lonelywolf.boot.common.resttemlate.SpringRestTemplate;
import com.lonelywolf.boot.linuxdatasource.mydemo.service.IGainNewData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * @Author: Xiangyong.zeng
 * @Date: 2019-08-01 11:25
 * @Description:
 */
public class GainNewDataImpl implements IGainNewData {
    @Autowired
    SpringRestTemplate springRestTemplate;

    @Override
    public boolean gainNewData(){
        //设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //调用参数
        MultiValueMap<String, String> params= new LinkedMultiValueMap<>();
        params.add("platformId","1");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        //  执行HTTP请求
        // 最后的参数需要用String.class  使用其他的会报错
        ResponseEntity<String> response = springRestTemplate.exchange("https://you.163.com/item/list?categoryId=1005002&_stat_area=nav_4"
                , HttpMethod.POST, requestEntity, String.class);
        String result = response.getBody();

        springRestTemplate.postForObject("https://you.163.com/item/list?categoryId=1005002&_stat_area=nav_4",requestEntity,String.class);

        return false;
    }


    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        //设置请求头
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //调用参数
        MultiValueMap<String, String> params= new LinkedMultiValueMap<>();
        params.add("platformId","1");
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        //  执行HTTP请求
        // 最后的参数需要用String.class  使用其他的会报错
        ResponseEntity<String> response = restTemplate.exchange("https://you.163.com/item/list?categoryId=1005002&_stat_area=nav_4"
                , HttpMethod.POST, requestEntity, String.class);
        String result = response.getBody();
        System.out.println(JSON.parse(result));
        JSONObject jsonObject = JSONObject.parseObject(result);
        Map map = (Map)JSON.parse(jsonObject.get("data").toString());
        Object[] object = map.keySet().toArray();



        System.out.println(map.keySet());


    }
}
