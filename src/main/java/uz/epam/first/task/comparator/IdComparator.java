package uz.epam.first.task.comparator;

import uz.epam.first.task.entity.CustomArray;

import java.util.Comparator;

public class IdComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray customArray1, CustomArray customArray2) {
        return Integer.compare(customArray1.getId(), customArray2.getId());
    }
}
