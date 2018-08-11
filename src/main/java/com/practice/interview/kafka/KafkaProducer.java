//package com.practice.interview.kafka;
//
//import java.util.Properties;
//
//import org.apache.kafka.clients.producer.Producer;
//import org.apache.kafka.clients.producer.ProducerRecord;
//
//import com.fasterxml.jackson.databind.ser.std.StringSerializer;
//
//public class KafkaProducer {
//	public static void main(String[] args) {
//		
//		Properties properties = new Properties();
//		properties.setProperty("bootstrap.servers", "127.0.0.1:9092");
//		properties.setProperty("key.serializer", StringSerializer.class.getName());
//		properties.setProperty("value.serializer", StringSerializer.class.getName());
//		properties.setProperty("acks", "1");
//		properties.setProperty("retries", "1");
//		
//		Producer<String, String> producer = new org.apache.kafka.clients.producer.KafkaProducer<>(properties);
//		
//		for(int key=0;key<10;key++) {
//			ProducerRecord<String, String> record = new ProducerRecord<String, String>("firsttopic", Integer.toString(key), "Message that has key" + key);
//			producer.send(record);
//		}
//		
//		producer.close();
//	}
//}
//
