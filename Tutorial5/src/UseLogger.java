import java.io.IOException;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

///import com.vogella.logger.MyLogger;

public class UseLogger {
    
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public final static int FINEST=0;
    public final static int INFO=1;
    public final static int WARNING=2;
    public final static int SEVERE=3;
    
    public void LogStatus(Integer intLogLevel,String strLogMessage) {
            // set the LogLevel to Severe, only severe Messages will be written
            
            if (intLogLevel == FINEST ) {
            	LOGGER.setLevel(Level.FINEST);
            	LOGGER.finest(strLogMessage);
            }else if (intLogLevel==INFO) {
            	LOGGER.setLevel(Level.INFO);
            	LOGGER.info(strLogMessage);
            }else if (intLogLevel==WARNING ) {
            	LOGGER.setLevel(Level.WARNING);
            	LOGGER.warning(strLogMessage);
            }else {
            	LOGGER.setLevel(Level.SEVERE);
            	LOGGER.severe(strLogMessage);
            }
            
    }

    
}
