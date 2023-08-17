package Model;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalculatorLogger {
    static Logger logger = Logger.getLogger(CalculatorLogger.class.getName());

    public static void startLogger(String path) {
        try {
            FileHandler fh = new FileHandler(path);
            SimpleFormatter sFormater = new SimpleFormatter();
            logger.addHandler(fh);
            fh.setFormatter(sFormater);
            logger.log(Level.INFO, "Лог файл успешно создан! ");
        } catch (IOException e) {
            System.out.println("Fail!" + e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }
    }

    public static void Event(String data) {
        logger.log(Level.INFO, data);
    }

    public static void inputException(String data) {
        logger.log(Level.WARNING, data);
    }
}
