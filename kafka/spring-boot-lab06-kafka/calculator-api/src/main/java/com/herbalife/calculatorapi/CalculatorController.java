package com.herbalife.calculatorapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {
    @Autowired
    private KafkaTemplate kafkaTemplate;
    @GetMapping("/square/{num}")
    public int square(@PathVariable int num){
        String topic="square-topic";
        String s= String.valueOf(num*num);
        kafkaTemplate.send(topic,s);
        return num*num;
    }

    @GetMapping("/increment/{num2}")
    public int increment(@PathVariable int num2){
        String topic="increment-topic";
        String s= String.valueOf(num2+1);
        kafkaTemplate.send(topic,s);
        return num2+1;
    }


}
