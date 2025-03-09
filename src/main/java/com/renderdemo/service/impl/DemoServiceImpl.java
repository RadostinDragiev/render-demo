package com.renderdemo.service.impl;

import com.renderdemo.model.Order;
import com.renderdemo.service.DemoService;
import com.renderdemo.service.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class DemoServiceImpl implements DemoService {

    private final OrderRepository orderRepository;


    @Override
    public Map<String, String> getMap() {

        this.orderRepository.save(Order.builder().customerId("1").customerName("Gosho").orderId("1").build());
        log.info("GetMap method called");
        return Map.of("Gosh", "Sofia",
                "Pesho", "Troyan",
                "Ivan", "Varna");
    }
}
