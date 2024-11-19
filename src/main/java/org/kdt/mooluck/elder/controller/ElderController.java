package org.kdt.mooluck.elder.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.kdt.mooluck.elder.dto.ElderDTO;
import org.kdt.mooluck.elder.service.ElderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api/elders")
@Tag(name = "Elder Login Controller", description = "노인 로그인 관련 API입니다.")
public class ElderController {

    private final ElderService elderService;

    @Autowired
    public ElderController(ElderService elderService) {
        this.elderService = elderService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody ElderDTO elderDto) {
        boolean isValid = elderService.validateMember(elderDto);
        if (isValid) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }
}
