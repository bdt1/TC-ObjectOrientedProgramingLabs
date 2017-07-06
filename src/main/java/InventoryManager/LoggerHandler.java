package InventoryManager;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LoggerHandler {
	private static final Logger logger = getLogger();

	public static void info(String string) {
		logger.info(string);
	}

	private static Logger getLogger() {
		Logger logger = Logger.getGlobal();
		try {
			logger.addHandler(new FileHandler("./mylogfile.txt"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		return logger;
	}

}
