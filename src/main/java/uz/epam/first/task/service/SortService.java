package uz.epam.first.task.service;

import uz.epam.first.task.entity.CustomArray;

public interface SortService {

    void bubbleSort(CustomArray customArray);

    void selectionSort(CustomArray customArray);

    void insertionSort(CustomArray customArray);

}
