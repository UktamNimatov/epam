package uz.epam.first.task.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.regex.Pattern;

public class Validator {
    private static final Logger myLogger = LogManager.getLogger(Validator.class);
    private static final String regExp = "^-?[0-9]+$";

    public boolean isNumber(String number){
        boolean isNumber = false;
        try {
            isNumber = Pattern.matches(regExp, number);
        }catch (NumberFormatException e){
            myLogger.error("Error in parsing String to int");
            isNumber = false;
        }
        return isNumber;
    }
}
