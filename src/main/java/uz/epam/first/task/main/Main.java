package uz.epam.first.task.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.exception.IllegalIdException;
import uz.epam.first.task.exception.NumberParserException;
import uz.epam.first.task.exception.ProjectException;
import uz.epam.first.task.parser.ArrayParser;
import uz.epam.first.task.reader.DataReader;
import uz.epam.first.task.service.SortService;
import uz.epam.first.task.service.impl.SortServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final Logger myLogger = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws IllegalIdException {

        DataReader reader = new DataReader();
        String fileName = "src/main/resources/data.txt";
        List<String> stringList = new ArrayList<>();
        try {
            stringList = reader.readFile(fileName);
        }catch (ProjectException e){
            myLogger.error("Could not find the file");
        }
        ArrayParser parser = new ArrayParser();
        CustomArray customArray = new CustomArray(1, parser.arrayParserWithValidator(stringList));
        int[] ints = parser.arrayParserWithValidator(stringList);
        System.out.println(Arrays.toString(ints));


        SortService sortService = new SortServiceImpl();
        System.out.println(Arrays.toString(ints));

        sortService.selectionSort(customArray);

//        ArrayServiceImpl arrayService = new ArrayServiceImpl();
//        int[] primes = arrayService.findAllPrimeNumbers(ints);
//        SortService sortService = new SortServiceImpl();
//        sortService.bubbleSort(primes);
//        System.out.println(Arrays.toString(primes));
//
//        SearchService searchService = new SearchServiceImpl();
//        System.out.println(searchService.linearSearch(primes, 79));
//        System.out.println(searchService.binarySearch(primes, 79));
    }
}
