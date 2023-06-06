package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;
import static org.junit.jupiter.api.Assertions.*;

class IntegerListImplTest {
    IntegerListImpl IntegerList = new IntegerListImpl();


    @org.junit.jupiter.api.Test
    void add() {
        IntegerList.add(1);

    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        IntegerList.add(0, 1);
        IntegerList.add(1, 231);
        IntegerList.add(2, 654);

    }

    @org.junit.jupiter.api.Test
    void set() {
        IntegerList.set(0, 897);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        IntegerList.remove(897);
    }

    @org.junit.jupiter.api.Test
    void testRemove() {
        IntegerList.remove(0);

    }

    @org.junit.jupiter.api.Test
    void contains() {
        IntegerList.contains(24165);
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        IntegerList.indexOf(54);
    }

    @org.junit.jupiter.api.Test
    void lastIndexOf() {
        IntegerList.lastIndexOf(58);
    }

    @org.junit.jupiter.api.Test
    void get() {
        IntegerList.get(0);
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        IntegerList.equals(IntegerList);

    }

    @org.junit.jupiter.api.Test
    void size() {
        IntegerList.size();
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        IntegerList.isEmpty();
    }

    @org.junit.jupiter.api.Test
    void clear() {
        IntegerList.clear();
    }

    @org.junit.jupiter.api.Test
    void toArray() {
        IntegerList.toArray();

    }
}