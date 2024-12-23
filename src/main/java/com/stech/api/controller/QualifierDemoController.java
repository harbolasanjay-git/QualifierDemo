package com.stech.api.controller;

import com.stech.api.services.QualifierService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class QualifierDemoController {

    @Autowired
    @Qualifier("first")
    /*
    Resource is also behaving same as qualifier
    but resource is not the spring component. this is exist in java library.
     */
    //@Resource(name = "second")
    private QualifierService service;

    @GetMapping("/test")
    public String showMessageOfQualifer(){
        return service.displayMessage();
    }
}
