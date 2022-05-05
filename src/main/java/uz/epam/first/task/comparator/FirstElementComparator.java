package uz.epam.first.task.comparator;

import uz.epam.first.task.entity.CustomArray;

import java.util.Comparator;

public class FirstElementComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray customArray1, CustomArray customArray2) {
        return Integer.compare(customArray1.getArray()[0], customArray2.getArray()[0]);
    }
}
