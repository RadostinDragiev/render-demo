package com.renderdemo.service.impl;

import com.renderdemo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    @Override
    public Map<String, String> getMap() {
        log.warn("GetMap method called");
        return Map.of("Gosh", "Sofia",
                "Pesho", "Troyan",
                "Ivan", "Varna");
    }
}
