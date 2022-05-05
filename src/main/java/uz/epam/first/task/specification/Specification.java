package uz.epam.first.task.specification;

import uz.epam.first.task.entity.CustomArray;

import java.util.List;

public interface Specification {

    List<CustomArray> idMoreThan(int value);

    List<CustomArray> idLessThan(int value);

    List<CustomArray> sumElemMoreThan(int value);

    List<CustomArray> sumElemLessThan(int value);

    List<CustomArray> elemNumberMoreThan(int value);

    List<CustomArray> elemNumberLessThan(int value);

    List<CustomArray> averageValueMoreThan(int value);

    List<CustomArray> averageValueLessThan(int value);

}
