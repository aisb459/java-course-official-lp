package com.herbalife.springbootbasics.lab01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
public class Conference {
    @Autowired
    SessionPlanner sessionPlanner;

    private Map<Integer,Long> countOfTopics;

    public Map<Integer, Long> getCountOfTopics() {
        return countOfTopics;
    }

    public void printSessions(){
        //sessionPlanner.getTopics().keySet().stream().forEach(k-> System.out.println(k+" == " +sessionPlanner.getTopics().get(k)));
        this.countOfTopics=sessionPlanner.getTopics().values()
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        this.countOfTopics.keySet()
                .stream()
                .forEach(k-> System.out.println(k+" == " +this.getCountOfTopics().get(k)));
    }


}
