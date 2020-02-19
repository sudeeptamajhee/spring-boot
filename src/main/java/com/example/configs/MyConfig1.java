package com.example.configs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class MyConfig1 {
	
	private static final Log LOGGER = LogFactory.getLog(MyConfig1.class);

	public MyConfig1(){
		LOGGER.info("@@@@@@@@ MyConfig1");
	}
}
