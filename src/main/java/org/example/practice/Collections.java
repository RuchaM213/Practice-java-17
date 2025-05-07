package org.example.practice;

import java.util.*;

public class Collections {
    public static void main(String [] args){
        //Arraylist
        List<String> elements = new ArrayList<>();
        elements.add("one");
        elements.add("two");
        elements.add("three");
        elements.add("four");
        System.out.println("Array elements list :" + elements);

        //Linkedlist
        List<String> alpha = new LinkedList<>();
        alpha.add("A");
        alpha.add("B");
        alpha.add("C");
        alpha.add("D");
        System.out.println("LinkedList alphabets :"+ alpha);

        //Hashmap
        HashMap<String,String> record = new HashMap<>();
        record.put("Radha","24");
        record.put("Sham","25");
        System.out.println("Radha's Marks" + record.get("Radha"));
        System.out.println("Sham's Marks" + record.get("Sham"));

        //Hashset
        HashSet <String> WeekDays = new HashSet<>();
        WeekDays.add("Monday");
        WeekDays.add("Tuesday");
        WeekDays.add("Wednesday");
        WeekDays.add("Thursday");
        System.out.println("Weekdays are: + Weekdays");

        //BasicArray
        String[] listArray = {"January","February","March","April"};
        for (String s : listArray) {
            System.out.println("Months are:" + s);
        }

    }
}
