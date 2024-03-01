package com.eda.orderservice.Controller;

import com.eda.basedomain.DTO.Order;
import com.eda.basedomain.DTO.OrderEvent;
import com.eda.orderservice.Kafka.KafkaProducer;
import org.apache.kafka.common.serialization.UUIDSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private KafkaProducer kafkaProducer;

    @PostMapping("/sendEvent")
    public ResponseEntity<String> sendOrderEvent(@RequestBody Order order){
        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setEventId("01");
        orderEvent.setEventName("stock-order");
        String orderId = String.valueOf(UUID.randomUUID());
        order.setOrderId(orderId);
        orderEvent.setOrder(order);
            kafkaProducer.sendOrderEvents(orderEvent);
        return new ResponseEntity<>("Sending ->"+ orderEvent, HttpStatus.OK);
    }
}
