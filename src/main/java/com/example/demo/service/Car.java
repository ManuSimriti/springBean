package com.example.demo.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Car implements Engine  {
    private Logger log = LoggerFactory.getLogger(Car.class);
    @Override
    public void start() {
        log.info("starting the car engine");

    }

    @Override
    public void run() {
        log.info("running the car engine");

    }

    @Override
    public void stop() {
        log.info("stopping the car engine");

    }


}
