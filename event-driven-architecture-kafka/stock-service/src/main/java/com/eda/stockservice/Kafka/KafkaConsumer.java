package com.eda.stockservice.Kafka;

import com.eda.basedomain.DTO.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private static  final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            , groupId = "${spring.kafka.consumer.group-id}")
    private void receiveOrders(OrderEvent orderEvent){
        log.info(String.format("Receiver order  in stock service-> %s",orderEvent.toString()));
    }
}
