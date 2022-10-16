package ru.gb.rostovskiy.javaGB3.homework1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {

    private List<T> fruitsBox;

    public Box(T... fruits) {
        this.fruitsBox = new ArrayList<>(Arrays.asList(fruits));
    }

    double getWeight() {
        double boxWeight = 0.0;
        for (T e: fruitsBox){
            boxWeight += e.getWeight();
        }
        return boxWeight;
    }

    boolean compare(Box <?> box) {
        System.out.println("Вес первой коробки: " + box.getWeight());
        System.out.println("Вес второй коробки: " + this.getWeight());
        return (box.getWeight() == this.getWeight());
    }

    void addAll(List<? extends T>  fruits){
        fruitsBox.addAll(fruits);
    }

    void moveFruits(Box <? super T> box){
        box.addAll(fruitsBox);
        fruitsBox.clear();
    }


}
