import org.apache.log4j.Logger;


public class LoggerTest {
private static Logger logger=Logger.getLogger(LoggerTest.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("debug��Ϣ");
		logger.info("info��Ϣ");
		logger.error("error��Ϣ");
	}

}
