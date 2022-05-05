package uz.epam.first.task.service;

import uz.epam.first.task.entity.CustomArray;

public interface SearchService {

    int binarySearch(CustomArray customArray, int number);

    int linearSearch(CustomArray customArray, int number);
}
