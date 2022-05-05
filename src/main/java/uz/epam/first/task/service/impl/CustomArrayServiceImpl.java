package uz.epam.first.task.service.impl;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.entity.CustomArrayValues;
import uz.epam.first.task.service.CustomArrayService;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayServiceImpl implements CustomArrayService {

    @Override
    public CustomArrayValues getCustomArrayValues(CustomArray customArray) {
        CustomArrayValues values = new CustomArrayValues();
         values.setCustomArrayId(customArray.getId());
         values.setMax(findMaxNumberFromArray(customArray));
         values.setMin(findMinNumberFromArray(customArray));
         values.setSum(findSumOfElements(customArray));
         values.setAverage(findAverage(customArray));
         return values;
    }

    @Override
    public int findMinNumberFromArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        int toReturn = array[0];
        for (int value : array)
            if (toReturn > value) {
                toReturn = value;
            }
        return toReturn;
    }

    @Override
    public int findMaxNumberFromArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        int toReturn = array[0];
        for (int value : array)
            if (toReturn < value) {
                toReturn = value;
            }
        return toReturn;
    }

    @Override
    public int[] findAllPrimeNumbers(CustomArray customArray) {
        int[] array = customArray.getArray();
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
    public int[] findAllFibonacciNumbers(CustomArray customArray) {
        return new int[0];
    }

    @Override
    public double findAverage(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (array.length == 0) return 0;
        double sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum / array.length;
    }

    @Override
    public int findSumOfElements(CustomArray customArray) {
        int[] array = customArray.getArray();
        if (array.length == 0) return 0;
        int sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum;
    }
}
