package com.idodevjobs.example.controller;

import com.idodevjobs.example.model.SampleModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @RequestMapping("/hello")
    public SampleModel hello() {
        return new SampleModel("hello world", 1);
    }
}
