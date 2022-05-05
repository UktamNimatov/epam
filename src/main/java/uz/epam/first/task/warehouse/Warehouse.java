package uz.epam.first.task.warehouse;

import uz.epam.first.task.entity.CustomArrayValues;
import uz.epam.first.task.service.CustomArrayService;
import uz.epam.first.task.service.impl.CustomArrayServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private static final Warehouse warehouse = new Warehouse();

    private static Map<Integer, CustomArrayValues> customArrayValuesMap = new HashMap<>();

    private Warehouse() {
    }

    public static Warehouse getInstance(){
        return warehouse;
    }

    public void add(int key, CustomArrayValues customArrayValues){
        customArrayValuesMap.putIfAbsent(key, customArrayValues);
    }

    public CustomArrayValues getCustomArrayValues(int key){
        return customArrayValuesMap.get(key);
    }

    public boolean delete(int key){
        if (customArrayValuesMap.get(key) != null) {
            return customArrayValuesMap.remove(key, customArrayValuesMap.get(key));
        }
        return false;
    }

    public boolean replace(int key, CustomArrayValues oldValues, CustomArrayValues newValues){
        return customArrayValuesMap.replace(key, oldValues, newValues);
    }
}
