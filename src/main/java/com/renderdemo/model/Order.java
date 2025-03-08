package com.renderdemo.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue
    @UuidGenerator
    private String UUID;

    @Column(name = "order_id", nullable = false)
    private String orderId;

    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

    @Column(name = "order_date", updatable = false)
    private LocalDate orderDate;
}
