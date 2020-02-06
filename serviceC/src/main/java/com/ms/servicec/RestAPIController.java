package com.ms.servicec;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class RestAPIController {

    @GetMapping("messages")
    public List<String> serviceStatus(){
        List<String> messages = new ArrayList<String>();
        messages.add("Message from ServiceC");
        return messages;
    }
}
