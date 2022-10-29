package com.practice.designpatterns.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Logger logger = Logger.getInstanceUsingDoubleLocking();
		logger.log("Logging from logger object");
		
		Logger logger1 = Logger.getInstanceUsingDoubleLocking();
		logger1.log("Logging from logger object1");
		

	}

}
