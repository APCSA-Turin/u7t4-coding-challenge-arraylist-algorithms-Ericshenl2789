package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Test{
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<String>(Arrays.asList("apple", "banana", "cherry", "donut", "Bagel", "danish", "berry", "baguette", "soda"));
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 5, 5, 6));
        int[] test = {1, 2, 3, 2, 4, 5, 5, 6};
        System.out.println(Main.modes(test));
    }
}