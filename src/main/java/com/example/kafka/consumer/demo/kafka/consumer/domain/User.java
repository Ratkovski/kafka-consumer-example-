package com.example.kafka.consumer.demo.kafka.consumer.domain;
/*
 * @created 06/02/2022 - 22:10
 * @project kafka-consumer-example-
 * @author Ratkovski
 */

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
  private String name;
  private String department;
  private Long salary;

  public User() {
  }

  public User(String name, String department, Long salary) {
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "User{" +
    "name='" + name + '\'' +
    ", department='" + department + '\'' +
    ", salary=" + salary +
    '}';
  }
}
