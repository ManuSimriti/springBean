package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Plane implements Engine{
    private Logger log = LoggerFactory.getLogger(Plane.class);
    @Override
    public void start() {
        log.info("starting the plane");
    }

    @Override
    public void run() {
        log.info("running the plane");
    }

    @Override
    public void stop() {
        log.info("stopping the plane");
    }
}
