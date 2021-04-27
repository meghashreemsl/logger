package com.wolken.wolkenapp;

import org.apache.log4j.Logger;

public class Tester {
	
	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger("Tester");
		
		logger.trace("*******TRACE***********");
		logger.debug("**********DEBUG*******************");
		logger.info("*************INFO************");
		logger.error("***********ERROR**********");
		logger.fatal("******************FATAL*************");
		
	}

}
