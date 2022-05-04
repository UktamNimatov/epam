package uz.epam.first.task.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.epam.first.task.exception.ParserException;
import uz.epam.first.task.validator.Validator;

import java.util.ArrayList;
import java.util.List;

public class ArrayParser {

    static final Logger myLogger = LogManager.getLogger(ArrayParser.class);

    static final Validator validator = new Validator();

    public int[] arrayParser(List<String> strings)throws ParserException {

        List<Integer> integerList = new ArrayList<>();

        for (String element : strings){
            int number;
            try {
                number = Integer.parseInt(element);
            }catch (NumberFormatException e){
                myLogger.error("Parsing error: String to int");
                throw new ParserException("Error while parsing String to int", e);
            }
            integerList.add(number);
        }
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] arrayParserWithValidator(List<String> strings){

        List<Integer> integerList = new ArrayList<>();

        for (String element : strings){
            int number = 0;
            if (validator.isNumber(element)){
                number = Integer.parseInt(element);
               integerList.add(number);
            }
        }
        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
