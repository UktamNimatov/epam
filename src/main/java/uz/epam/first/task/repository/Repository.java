package uz.epam.first.task.repository;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.exception.IllegalIdException;
import uz.epam.first.task.sort.custom.array.SortingCustomArrays;

import java.util.List;

public interface Repository {

    void saveCustomArray(CustomArray customArray);

    List<CustomArray> getCustomArrays();

    void deleteCustomArray(int id) throws IllegalIdException;

    List<CustomArray> queryByIdMore(int value);
    List<CustomArray> queryByIdLess(int value);

    List<CustomArray> queryBySumLess(int value);
    List<CustomArray> queryBySumMore(int value);

    List<CustomArray> queryByAverageLess(int value);
    List<CustomArray> queryByAverageMore(int value);

    List<CustomArray> queryByElemNumberLess(int value);
    List<CustomArray> queryByElemNumberMore(int value);

    void sortingCustomArraysInList(SortingCustomArrays sorting);
}
