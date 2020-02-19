package com.example;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.example.configs.MyConfig1;
import com.example.configs.MyConfig2;

@SpringBootApplication
@Import({MyConfig1.class, MyConfig2.class})
public class Application {

	private static final Log LOGGER = LogFactory.getLog(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void appInit(){
		LOGGER.info("@@@@@@@@ Application PostConstruct.");
	}

}
