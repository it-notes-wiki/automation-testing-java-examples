package wiki.it.notes.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Example {

    private static final Logger logger = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        logger.info("Message for INFO level");
        logger.error("Message for ERROR level");
        logger.debug("Message for DEBUG level");
    }
}
