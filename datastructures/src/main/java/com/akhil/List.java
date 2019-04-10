package com.akhil;

/**
 * Author: akhil
 * Created on : 9/4/19
 */
public interface List<T> {

    void append(T value);
    void delete(int index);
    void set(int index, T value);
    Object get(int index);
}
