package server;

import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.io.IOException;
import java.util.logging.*;

public class Logs {
    private Logger logger = Logger.getLogger("MyLog");
    private FileHandler fh;


    public void loger(String message) {

        LocalDateTime date = LocalDateTime.now();
        String text = date + ": " + message;
        System.out.println(text);
    }

    public void log(String text) {
        try {
            fh = new FileHandler("data\\logs.txt", true);

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        logger.info(text);
        fh.close();
    }

    public void createLog(String message) {
        final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    }
}