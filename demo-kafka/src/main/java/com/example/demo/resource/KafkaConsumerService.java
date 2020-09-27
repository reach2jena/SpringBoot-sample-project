package com.example.demo.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;


@RestController
public class KafkaConsumerService {

	Student result =null;
@Autowired
ConcurrentKafkaListenerContainerFactory<String, Student> kafkaconsumer;


@RequestMapping(value="/Message", method = {RequestMethod.GET})
public String  readMessage()
{
System.out.println("Hi"+result);	
return "Hi";
	
}

@KafkaListener(topics = "MySaanvitopic", groupId = "group_id" )
public String getData(String data){
	
	System.out.println("DataList -- "+ data);
	
	return data;
	}
}
