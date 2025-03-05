package com.renderdemo.service.impl;

import com.renderdemo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    @Value("${render.demo}")
    private String demo;

    @Override
    public Map<String, String> getMap() {
        log.warn("GetMap method called");
        log.warn("This is my env variable test -> " + demo);
        return Map.of("Gosh", "Sofia",
                "Pesho", "Troyan",
                "Ivan", "Varna");
    }
}
