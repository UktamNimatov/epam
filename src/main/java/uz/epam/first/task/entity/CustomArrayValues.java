package uz.epam.first.task.entity;

import java.util.Objects;
import java.util.StringJoiner;

public class CustomArrayValues {

    private int customArrayId;
    private int max;
    private int min;
    private int sum;
    private double average;

    public CustomArrayValues() {
    }

    public CustomArrayValues(int customArrayId, int max, int min, int sum, double average) {
        this.customArrayId = customArrayId;
        this.max = max;
        this.min = min;
        this.sum = sum;
        this.average = average;
    }

    public int getCustomArrayId() {
        return customArrayId;
    }

    public void setCustomArrayId(int customArrayId) {
        this.customArrayId = customArrayId;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArrayValues that = (CustomArrayValues) o;
        return customArrayId == that.customArrayId &&
                max == that.max &&
                min == that.min &&
                sum == that.sum &&
                Double.compare(that.average, average) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(customArrayId, max, min, sum, average);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomArrayValues.class.getSimpleName() + "[", "]")
                .add("customArrayId=" + customArrayId)
                .add("max=" + max)
                .add("min=" + min)
                .add("sum=" + sum)
                .add("average=" + average)
                .toString();
    }
}
