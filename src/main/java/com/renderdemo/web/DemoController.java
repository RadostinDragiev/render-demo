package com.renderdemo.web;

import com.renderdemo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @GetMapping("/")
    public ResponseEntity<Map<String, String>> getSomething() {
        log.warn("Endpoint called");
        return ResponseEntity.ok(demoService.getMap());
    }
}
