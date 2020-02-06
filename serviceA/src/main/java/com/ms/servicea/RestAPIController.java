package com.ms.servicea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class RestAPIController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("messages")
    public List<String> serviceStatus(){

        ResponseEntity<List> responseEntity = restTemplate.getForEntity("http://localhost:8096/messages",List.class);

        List<String> messages = new ArrayList<String>();
        messages.add("Message from ServiceA");
        List<String> listB = responseEntity.getBody();
        messages.addAll(listB);

        return messages;
    }
}
