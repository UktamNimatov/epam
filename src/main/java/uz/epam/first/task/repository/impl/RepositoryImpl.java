package uz.epam.first.task.repository.impl;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.entity.CustomArrayValues;
import uz.epam.first.task.exception.IllegalIdException;
import uz.epam.first.task.repository.Repository;
import uz.epam.first.task.service.CustomArrayService;
import uz.epam.first.task.service.impl.CustomArrayServiceImpl;
import uz.epam.first.task.sort.custom.array.SortingCustomArrays;
import uz.epam.first.task.specification.Specification;
import uz.epam.first.task.specification.impl.SpecificationImpl;
import uz.epam.first.task.warehouse.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class RepositoryImpl implements Repository {

    private static final RepositoryImpl repositoryImpl = new RepositoryImpl();

    private static List<CustomArray> customArrayList;


    private static Warehouse warehouse;

    private static CustomArrayService customArrayService;

    private static Specification specification;


    private RepositoryImpl(){}

    public static RepositoryImpl getInstance(){
        customArrayService = new CustomArrayServiceImpl();
        specification = new SpecificationImpl(customArrayService);
        warehouse = Warehouse.getInstance();
        customArrayList = new ArrayList<>();
        return repositoryImpl;
    }


    @Override
    public void saveCustomArray(CustomArray customArray) {
        CustomArrayValues customArrayValues = customArrayService.getCustomArrayValues(customArray);
        warehouse.add(customArray.getId(), customArrayValues);
        customArrayList.add(customArray);
    }

    @Override
    public List<CustomArray> getCustomArrays() {
        return customArrayList;
    }

    @Override
    public void deleteCustomArray(int id) throws IllegalIdException {
        if (id >=0 && (id < customArrayList.size())) {
            warehouse.delete(id);
            customArrayList.remove(id);
        }
        throw new IllegalIdException("Given id is out of bounds");
    }

    @Override
    public List<CustomArray> queryByIdMore(int value) {
        return specification.idMoreThan(value);
    }

    @Override
    public List<CustomArray> queryByIdLess(int value) {
        return specification.idLessThan(value);
    }

    @Override
    public List<CustomArray> queryBySumLess(int value) {
        return specification.sumElemLessThan(value);
    }

    @Override
    public List<CustomArray> queryBySumMore(int value) {
        return specification.sumElemMoreThan(value);
    }

    @Override
    public List<CustomArray> queryByAverageLess(int value) {
        return specification.averageValueLessThan(value);
    }

    @Override
    public List<CustomArray> queryByAverageMore(int value) {
        return specification.averageValueMoreThan(value);
    }

    @Override
    public List<CustomArray> queryByElemNumberLess(int value) {
        return specification.elemNumberLessThan(value);
    }

    @Override
    public List<CustomArray> queryByElemNumberMore(int value) {
        return specification.elemNumberMoreThan(value);
    }

    @Override
    public void sortingCustomArraysInList(SortingCustomArrays sorting) {
        sorting.sort(getCustomArrays());
    }

}
