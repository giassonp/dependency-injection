package com.emmerj.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class TrainItinaryProcessor implements ItinaryProcessor {

    @Override
    public void processItinary(){
        System.out.println("Processing train itinary...");
    };
}
