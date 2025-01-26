package commonfunctions;

import org.apache.logging.log4j.LogManager;

import io.opentelemetry.api.logs.Logger;

public class log {
	    // Initialize Log4j logger
	    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(log.class);

	    // Method to log info messages
	    public static void info(String message) {
	        logger.info(message);
	    }

	    // Method to log error messages
	    public static void error(String message) {
	        logger.error(message);
	    }

	    // Method to log debug messages
	    public static void debug(String message) {
	        logger.debug(message);
	    }

	    // Method to log warn messages
	    public static void warn(String message) {
	        logger.warn(message);
	    }
	}



