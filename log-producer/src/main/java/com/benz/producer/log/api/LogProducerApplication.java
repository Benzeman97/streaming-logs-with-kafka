package com.benz.producer.log.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogProducerApplication {

	public static void main(String[] args) {

		SpringApplication.run(LogProducerApplication.class, args);

		Runnable run1=new Timer();
		Runnable run2=new User();

		Thread th1=new Thread(run1);
		th1.setName("Timer");
		th1.setPriority(Thread.MAX_PRIORITY);
		Thread th2=new Thread(run2);
		th2.setName("User");
		th2.setPriority(Thread.MIN_PRIORITY);

		th1.start();
		th2.start();
	}

}
