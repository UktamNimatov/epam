package uz.epam.first.task.service.impl;

import uz.epam.first.task.service.SortService;

public class SortServiceImpl implements SortService {
    @Override
    public void bubbleSort(int[] array) {
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
    public void selectionSort(int[] array) {

    }

    @Override
    public void insertionSort(int[] array) {

    }
}
