package com.denny.designpattern;

import com.denny.designpattern.thread.Mythread;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DesignPatternApplication {

  public static void main(String[] args) {
    SpringApplication.run(DesignPatternApplication.class, args);
    ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
    scheduler.scheduleAtFixedRate(new Mythread(), 15 * 1000, 1 * 60000, TimeUnit.MILLISECONDS);
  }

}
