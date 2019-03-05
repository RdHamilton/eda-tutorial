package com.example.demo.rest;

import org.apache.camel.component.kafka.KafkaComponent;
import org.apache.camel.component.kafka.KafkaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaReceiverApplication {

    @Bean
    public KafkaComponent kafka() {
        KafkaComponent kafkaComponent = new KafkaComponent();
        KafkaConfiguration configuration = new KafkaConfiguration();
        configuration.setBrokers("my-cluster-kafka-bootstrap.strimzi-infra.svc:9092");
        kafkaComponent.setConfiguration(configuration);
        return kafkaComponent;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(KafkaReceiverApplication.class, args);
    }

}
