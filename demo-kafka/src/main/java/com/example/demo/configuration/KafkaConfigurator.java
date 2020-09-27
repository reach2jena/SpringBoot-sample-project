package com.example.demo.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.example.demo.model.Student;

@EnableKafka
@Configuration
public class KafkaConfigurator {

	@Bean
	public ConsumerFactory<String, String> getConsumerfactory() {

		Map<String, Object> datamap = new HashMap<String, Object>();
		datamap.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		datamap.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		datamap.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		datamap.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaConsumerFactory<String, String>(datamap);
	}

	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaconsumerFactory() {

		ConcurrentKafkaListenerContainerFactory<String, String> listenerfactory = new ConcurrentKafkaListenerContainerFactory<String, String>();
		listenerfactory.setConsumerFactory(getConsumerfactory());

		return listenerfactory;
	}
}
