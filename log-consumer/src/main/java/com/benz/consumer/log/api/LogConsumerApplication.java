package com.benz.consumer.log.api;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@SpringBootApplication
public class LogConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogConsumerApplication.class, args);
/*
		Properties prop=new Properties();
		prop.put("bootstrap.servers","localhost:9092");
		prop.put("key.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
		prop.put("value.deserializer","org.apache.kafka.common.serialization.StringDeserializer");
		prop.put("group.id","test-group");

		KafkaConsumer kafkaConsumer=new KafkaConsumer(prop);
		List<String> topics=new ArrayList<>();
		topics.add("LOG_TOPIC");
		kafkaConsumer.subscribe(topics);

		while (true)
		{
			ConsumerRecords<Object,ConsumerRecord> records=kafkaConsumer.poll(Duration.ofMillis(50));

			for(ConsumerRecord record:records)
			{
				System.out.println(String.format("Topic - %s , partition - %d , value - %s",record.topic(),
						record.partition(),"Benz"));
			}
		}*/
	}

}
