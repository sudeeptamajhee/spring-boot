package com.example.configs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class MyConfig2 {
	
	private static final Log LOGGER = LogFactory.getLog(MyConfig2.class);

	public MyConfig2(){
		LOGGER.info("@@@@@@@@ MyConfig2");
	}
}
