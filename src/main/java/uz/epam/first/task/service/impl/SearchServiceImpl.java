package uz.epam.first.task.service.impl;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.service.SearchService;
import uz.epam.first.task.service.SortService;

public class SearchServiceImpl implements SearchService {

    @Override
    public int binarySearch(CustomArray customArray, int number) {
        SortService sortService = new SortServiceImpl();
        int[] array = customArray.getArray();
        sortService.bubbleSort(customArray);
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        int middleIndex = (firstIndex + lastIndex) / 2;
        while(firstIndex <= lastIndex){
            if (array[middleIndex] == number){
                return middleIndex;
            }
            if (array[middleIndex] < number){
                firstIndex = middleIndex + 1;
            }else {
                lastIndex = middleIndex - 1;
            }
            middleIndex = (firstIndex + lastIndex)/2;
        }
        return -1;
    }


    @Override
    public int linearSearch(CustomArray customArray, int number) {
        int[] array = customArray.getArray();
        int toReturn = -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                toReturn = i;
                break;
            }
        }
        return toReturn;
    }
}
