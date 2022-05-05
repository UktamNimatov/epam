package uz.epam.first.task.specification.impl;

import uz.epam.first.task.entity.CustomArray;
import uz.epam.first.task.entity.CustomArrayValues;
import uz.epam.first.task.repository.Repository;
import uz.epam.first.task.repository.impl.RepositoryImpl;
import uz.epam.first.task.service.CustomArrayService;
import uz.epam.first.task.specification.Specification;

import java.util.ArrayList;
import java.util.List;

public class SpecificationImpl implements Specification {

    private static final Repository repository = RepositoryImpl.getInstance();

    private CustomArrayService customArrayService;

    public SpecificationImpl(CustomArrayService customArrayService) {
        this.customArrayService = customArrayService;
    }

    public CustomArrayService getCustomArrayService() {
        return customArrayService;
    }

    public void setCustomArrayService(CustomArrayService customArrayService) {
        this.customArrayService = customArrayService;
    }


    @Override
    public List<CustomArray> idMoreThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            CustomArrayValues customArrayValues = getCustomArrayValues(customArray);
            if (customArrayValues.getCustomArrayId() > value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> idLessThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            CustomArrayValues customArrayValues = getCustomArrayValues(customArray);
            if (customArrayValues.getCustomArrayId() < value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> sumElemMoreThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            CustomArrayValues customArrayValues = getCustomArrayValues(customArray);
            if (customArrayValues.getSum() > value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> sumElemLessThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            CustomArrayValues customArrayValues = getCustomArrayValues(customArray);
            if (customArrayValues.getSum() < value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> elemNumberMoreThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            if (customArray.getArray().length > value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> elemNumberLessThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            if (customArray.getArray().length < value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> averageValueMoreThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            CustomArrayValues customArrayValues = getCustomArrayValues(customArray);
            if (customArrayValues.getAverage() > value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    @Override
    public List<CustomArray> averageValueLessThan(int value) {
        List<CustomArray> toReturn = new ArrayList<>();
        for (CustomArray customArray : getCustomArrayList()){
            CustomArrayValues customArrayValues = getCustomArrayValues(customArray);
            if (customArrayValues.getAverage() < value){
                toReturn.add(customArray);
            }
        }
        return toReturn;
    }

    private List<CustomArray> getCustomArrayList(){
        return repository.getCustomArrays();
    }

    private CustomArrayValues getCustomArrayValues(CustomArray customArray){
        return customArrayService.getCustomArrayValues(customArray);
    }
}
