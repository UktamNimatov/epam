package uz.epam.first.task.reader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.epam.first.task.exception.ProjectException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    static final Logger myLogger = LogManager.getLogger(DataReader.class.getName());
    private static final String NUMBER_DELIMITER = " ";

    public List<String> readFile(String fileName) throws ProjectException {
        List<String> toReturn = new ArrayList<>();
        File file = new File(fileName);
        Scanner scanner = null;
        try {
             scanner = new Scanner(file);
        } catch (FileNotFoundException fileNotFoundException) {
            myLogger.error("File not found in the direction");
        }

        if (scanner != null){
            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] parts = data.split(NUMBER_DELIMITER);
                toReturn.addAll(Arrays.asList(parts));
            }
        }
        return toReturn;
    }
}
