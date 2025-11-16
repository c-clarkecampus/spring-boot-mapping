package com.example.helloworld.controller;

import com.example.helloworld.dto.CalDTO;
import com.example.helloworld.service.CalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalController {

    private final CalService calService;

    public CalController(CalService calService) {
        this.calService = calService;
    }

    @PostMapping("/cal/values")
    public Integer calFunction(@RequestBody CalDTO calDTO) {
//        calService.getValue(calDTO.getNum1(), calDTO.getNum2(), calDTO.getOperator());
        return calService.getValue(calDTO);
    }
}
