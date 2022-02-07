package com.example.kafka.consumer.demo.kafka.consumer.listener;/*
 * @created 06/02/2022 - 22:18
 * @project kafka-consumer-example-
 * @author Ratkovski
 */

import com.example.kafka.consumer.demo.kafka.consumer.domain.User;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConsumerListener {
  @KafkaListener(topics = "topic_test", groupId = "groupTest",
  properties = {"spring.json.value.default.type=com.example.kafka.consumer.demo.kafka.consumer.domain.User"})
  public void listenerGroupFoo(ConsumerRecord<String, User> consumerRecord) {
    System.out.println("Message received in group" + consumerRecord.value()
    + "\n Topic " + consumerRecord.topic()
    + "\n Partition  " + consumerRecord.partition());
  }
}
