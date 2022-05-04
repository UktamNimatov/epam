package uz.epam.first.task.service.impl;

import uz.epam.first.task.service.ArrayService;

import java.util.ArrayList;
import java.util.List;

public class ArrayServiceImpl implements ArrayService {

    @Override
    public int findMinNumberFromArray(int[] array) {
        int toReturn = array[0];
        for (int value : array)
            if (toReturn < value) {
                toReturn = value;
            }
        return toReturn;
    }

    @Override
    public int findMaxNumberFromArray(int[] array) {
        int toReturn = array[0];
        for (int value : array)
            if (toReturn > value) {
                toReturn = value;
            }
        return toReturn;
    }

    @Override
    public int[] findAllPrimeNumbers(int[] array) {
        List<Integer> toReturn = new ArrayList<>();
        for (int element : array) {
            if (element <= 0) continue;
        int divider = 2;
        boolean isPrime = true;
            while (divider <= (element / 2)) {
                if (element % divider == 0) {
                    isPrime = false;
                    break;
                }
                divider++;
            }
            if (isPrime) toReturn.add(element);
        }

        return toReturn.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public int[] findAllFibonacciNumbers(int[] array) {
        return new int[0];
    }

    @Override
    public double findAverage(int[] array) {
        if (array.length == 0) return 0;
        double sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum / array.length;
    }

    @Override
    public int findSumOfElements(int[] array) {
        if (array.length == 0) return 0;
        int sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum;
    }
}
