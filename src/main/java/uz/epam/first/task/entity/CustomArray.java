package uz.epam.first.task.entity;

import uz.epam.first.task.exception.IllegalIdException;

import java.util.Arrays;
import java.util.StringJoiner;

public class CustomArray {

    private int id;

    private int[] array;

    public CustomArray(int id, int[] array) throws IllegalIdException{
        if (id <= 0){
            throw new IllegalIdException("Id must be a positive integer");
        }
        this.id = id;
        this.array = array;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws IllegalIdException{
        if (id <= 0){
            throw new IllegalIdException("Id must be a positive integer");
        }
        this.id = id;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return this.id * 31 + Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArray.class.getSimpleName() + "[", "]")
                .add("array=" + Arrays.toString(array))
                .toString();
    }
}
