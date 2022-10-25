package oit.is.janken05.kazi.janken05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class Janken05Application {

  public static void main(String[] args) {
    SpringApplication.run(Janken05Application.class, args);
  }

}
