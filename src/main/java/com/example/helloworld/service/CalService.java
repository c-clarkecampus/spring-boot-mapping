package com.example.helloworld.service;

import com.example.helloworld.dto.CalDTO;
import org.springframework.stereotype.Service;

@Service
public class CalService {

    public Integer getValue(CalDTO calDTO) {
        switch (calDTO.getOperator()) {
            case "+" : return calDTO.getNum1() + calDTO.getNum2();
            case "-" : return calDTO.getNum1() - calDTO.getNum2();
            default: return 0;
        }
    }
}
