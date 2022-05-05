package uz.epam.first.task.service;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.entity.CustomArrayValues;

public interface CustomArrayService {

    CustomArrayValues getCustomArrayValues(CustomArray customArray);

    int findMinNumberFromArray(CustomArray customArray);

    int findMaxNumberFromArray(CustomArray customArray);

    int[] findAllPrimeNumbers(CustomArray customArray);

    int[] findAllFibonacciNumbers(CustomArray customArray);

    double findAverage(CustomArray customArray);

    int findSumOfElements(CustomArray customArray);

}
