package com.example.securityjwt.controller;

import com.example.securityjwt.dto.JoinDto;
import com.example.securityjwt.service.JoinService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class JoinController {
    private final JoinService joinService;

    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinPorcess(JoinDto joinDto) {
        joinService.joinProcess(joinDto);
        return "ok";
    }
}
