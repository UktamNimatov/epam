package uz.epam.first.task.service.impl;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.service.SortService;

public class SortServiceImpl implements SortService {
    @Override
    public void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        int temp;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    @Override
    public void selectionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int smallestNumber = array[index];
            array[index] = array[i];
            array[i] = smallestNumber;
        }
    }

    @Override
    public void insertionSort(CustomArray customArray) {
        int[] array = customArray.getArray();
        for (int j = 1; j < array.length; j++){
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && (array[i] > key)){
                array[i+1] = array[i];
                i = i - 1;
            }
            array[i+1] = key;
        }
    }
}
