package uz.epam.first.task.sort.custom.array.impl;

import uz.epam.first.task.comparator.FirstElementComparator;
import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.sort.custom.array.SortingCustomArrays;

import java.util.List;

public class SortByFirstElement implements SortingCustomArrays {
    @Override
    public void sort(List<CustomArray> customArrayList) {
        customArrayList.sort(new FirstElementComparator());
    }
}
