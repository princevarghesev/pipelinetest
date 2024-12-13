package com.cicdpipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/cicd")
@RestController
public class PipelineController {

    @GetMapping("/load")
    public String loadPipelineMessageMethod(){
        return "Test Pipeline Message";
    }
    
}
