package com.practice.designpatterns.singleton;

public class Logger {
	private static volatile Logger instance;

	private Logger() {
			System.out.println("Logger object is getting created!");
	}

	public static Logger getInstanceEagerInitialized() {
		return instance;
	}

	public static Logger getInstanceLazyInitialized() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public static synchronized Logger getInstanceThreadSafe() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	public static Logger getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (Logger.class) {
				if (instance == null) {
					instance = new Logger();
				}
			}
		}
		return instance;
	}
	
	public void log(String message) {
        System.out.println(message);
    }
}
