

package Logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerTest {

	static String configFileName = "C:\\Users\\Pooja\\eclipse-workspace\\1.1\\log4j.properties";

	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());
	//logger is class name i ma gettign from logger lib
	public static void getLogger() {

		PropertyConfigurator.configure(configFileName);
	}


	public static void testLogger() {
		getLogger();
		logger.info("log test1");
		logger.info("log test2");
		logger.info("log test3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testLogger();

	}

}
