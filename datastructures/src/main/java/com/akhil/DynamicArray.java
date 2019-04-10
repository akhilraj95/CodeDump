package com.akhil;

/**
 * Author: akhil
 * Created on : 9/4/19
 */
public class DynamicArray<T> implements List<T> {

    private static final int defaultInitialSize = 10;

    private static final int defaultCapacityMultiplier = 2;

    private T[] staticArray;

    private int size;

    private int capacity;

    private int capacityMultiplier;

    public DynamicArray() {

        this(defaultInitialSize);
    }

    public DynamicArray(int initialSize) {

        this(initialSize, defaultCapacityMultiplier);
    }

    public DynamicArray(int initialSize,
                        int capacityMultiplier) {

        this.staticArray = (T[]) new Object[initialSize];
        this.size = -1;
        this.capacity = initialSize;
        this.capacityMultiplier = capacityMultiplier;
    }

    public void append(T value) {

        if (size + 1 > capacity) {
            increaseCapacity();
        }
        staticArray[size + 1] = value;
    }

    public void delete(int index) {

        validateIndex(index);
        for (int i = index; i < size; i++) {
            staticArray[i] = staticArray[i + 1];
        }
        size = size - 1;
    }

    public void set(int index,
                    T value) {

        validateIndex(index);
        staticArray[index] = value;
    }

    public T get(int index) {

        validateIndex(index);
        return staticArray[index];
    }

    private void validateIndex(int index) {

        if (index > size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    private void increaseCapacity() {

        int newCapacity = capacity + (capacity * capacityMultiplier);
        T[] newArray = (T[]) new Object[newCapacity];
        for (int i = 0; i <= size; i++) {
            newArray[i] = staticArray[i];
        }
        staticArray = newArray;
        capacity = newCapacity;
    }

}
