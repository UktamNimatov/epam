package uz.epam.first.task.service.impl;

import uz.epam.first.task.service.SearchService;
import uz.epam.first.task.service.SortService;

import java.util.ArrayList;
import java.util.List;

public class SearchServiceImpl implements SearchService {
    @Override
    public int binarySearch(int[] array, int number) {
        SortService sortService = new SortServiceImpl();
        sortService.bubbleSort(array);
        int loop = 0;
        int arrayLength = array.length;
        while (loop < arrayLength) {
        int middle = arrayLength/2;
            if (array[middle] == number) {
                return middle;
            }
            if (array[middle] < number){
                arrayLength = middle - 1;
            }
            if (array[middle] > number){
                loop = middle + 1;
            }
        }
        return -1;
    }

    @Override
    public int linearSearch(int[] array, int number) {
        return 0;
    }
}
