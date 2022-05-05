package uz.epam.first.task.sort.custom.array.impl;

import uz.epam.first.task.comparator.IdComparator;
import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.sort.custom.array.SortingCustomArrays;

import java.util.List;

public class SortingById implements SortingCustomArrays {

    @Override
    public void sort(List<CustomArray> customArrayList) {
        customArrayList.sort(new IdComparator());

    }
}
