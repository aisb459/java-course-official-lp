package com.herbalife.calculatordbconsumer.consumer;

import com.herbalife.calculatordbconsumer.repository.CalculatorRepository;
import com.herbalife.calculatordbconsumer.model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class CalculatorConsumer {
    @Autowired
    private CalculatorRepository calculatorRepository;
    @KafkaListener(topics = "square-topic", groupId = "square-topic-consumer")
    public void receiveSquare(String msg) {
        Calculator c=new Calculator(Integer.parseInt(msg),"square");
        calculatorRepository.save(c);
        System.out.println("***** Received Square%s".formatted(msg));
    }

    @KafkaListener(topics = "increment-topic", groupId = "increment-topic-consumer")
    public void receiveIncrement(String msg) {
        Calculator c=new Calculator(Integer.parseInt(msg),"increment");
        calculatorRepository.save(c);
        System.out.println("***** Received Increment%s".formatted(msg));
    }
}
