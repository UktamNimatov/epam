package uz.epam.first.task.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.exception.IllegalIdException;
import uz.epam.first.task.exception.ProjectException;
import uz.epam.first.task.parser.ArrayParser;
import uz.epam.first.task.reader.DataReader;
import uz.epam.first.task.repository.impl.RepositoryImpl;
import uz.epam.first.task.sort.custom.array.impl.SortByLength;

import java.util.ArrayList;
import java.util.List;

public class AnotherMain {
    private static final Logger myLogger = LogManager.getLogger(AnotherMain.class);

    public static void main(String[] args) throws IllegalIdException {

        DataReader reader = new DataReader();
        String fileName = "src/main/resources/data.txt";
        String fileName1 = "src/main/resources/data1.txt";
        List<String> stringList = new ArrayList<>();
        List<String> stringList1 = new ArrayList<>();
        try {
            stringList = reader.readFile(fileName);
            stringList1 = reader.readFile(fileName1);
        }catch (ProjectException e){
            myLogger.error("Could not find the file");
        }

        ArrayParser parser = new ArrayParser();
        CustomArray customArray = new CustomArray(1, parser.arrayParserWithValidator(stringList));
        CustomArray customArray1 = new CustomArray(2, parser.arrayParserWithValidator(stringList1));

        RepositoryImpl repository = RepositoryImpl.getInstance();
        repository.saveCustomArray(customArray);
        repository.saveCustomArray(customArray1);

        List<CustomArray> customArrayList = repository.queryByIdLess(10);
        System.out.println(customArrayList.get(0).getId());
        System.out.println(customArrayList.get(1).getId());

        List<CustomArray> list = repository.queryBySumMore(4500);
        System.out.println("customArray whose sum is more than 4500 === > " + list.get(0).getId());

        System.out.println("Sorting by lenght of the custom arrays: ");
        repository.sortingCustomArraysInList(new SortByLength());
        for (CustomArray temp : repository.getCustomArrays()){
            System.out.println(temp);
        }

    }
}
