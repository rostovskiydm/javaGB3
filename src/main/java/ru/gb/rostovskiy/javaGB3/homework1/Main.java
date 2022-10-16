package ru.gb.rostovskiy.javaGB3.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Задание №1
        Integer[] array = new Integer[]{10, 20, 30, 40, 50, 60, 70};
        swap(array, 2, 6);
        System.out.println(Arrays.toString(array));

//        Задание №2
        List<Integer> list = createArrayList(array);
        System.out.println(list);

//        Задавние №3
        Box<Apple> appleBox = new Box<>(
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple(),
                new Apple()
        );
        Box<Orange> orangeBox = new Box<>(
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange(),
                new Orange()
        );
        Box<GoldenApple> goldenAppleBox = new Box<>(
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple(),
                new GoldenApple()
        );
        System.out.println(orangeBox.compare(appleBox));
        goldenAppleBox.moveFruits(appleBox);
        System.out.println("Вес коробки после добавления: " + appleBox.getWeight());
    }

    public static <T> void swap(T[] array, int firstIndex, int secondIndex) {
        if (array == null) {
            throw new IllegalArgumentException();
        }
        if (firstIndex < 0 || secondIndex < 0) {
            throw new IllegalArgumentException();
        }
        if (firstIndex >= array.length || secondIndex >= array.length) {
            throw new IllegalArgumentException();
        }
        T arrValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = arrValue;

    }

    public static <T> List createArrayList(T[] array) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
