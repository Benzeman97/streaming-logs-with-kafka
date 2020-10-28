package com.benz.consumer.log.api.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class LogConsumer {

    @KafkaListener(topics = {"LOG_TOPIC"},groupId = "group_log",containerFactory = "kafkaListenerContainerFactory")
    public void log(String logs)
    {
        System.out.println(logs);
    }
}
