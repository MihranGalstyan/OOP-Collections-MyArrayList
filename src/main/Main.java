package main;

/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        String[] employees = {"Victor", "Boris", "Stan", "Eduard", "Den", "Ben"};

        String[] second = new String[employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            second[i] = employees[i];
        }
        second[second.length - 1] = "Teodor";

        for (final String names : employees) {
            System.out.println(names);
        }

        System.out.println("-------");

        for (final String names : second) {
            System.out.println(names);
        }

        employees = second;

        second[3] = null;

        System.out.println("-------");

        for (final String names : second) {
            System.out.println(names);
        }

        String[] newArray = new String[employees.length - 1];

        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                newArray[j] = employees[i];
                j++;
            }
        }

        employees = newArray;
        System.out.println("-------");

        for (final String names : employees) {
            System.out.println(names);
        }
// ArrayList Collection test
        System.out.println("-------");

        MyArrayList employees2 = new MyArrayList();

        employees2.add("Gregory");
        employees2.add("Susan");
        employees2.add("Diana");
        employees2.add("Jasmin");
        employees2.add("Jan");
        employees2.add("Silvester");

        System.out.println("ArrayList size: = " + employees2.getSize());
        for (int i = 0; i < employees2.getSize(); i++) {
            System.out.println(employees2.get(i));
        }
        System.out.println("-------");

        employees2.remove(0);
        System.out.println("ArrayList size: = " + employees2.getSize());
        for (int i = 0; i < employees2.getSize(); i++) {
            System.out.println(employees2.get(i));
        }
        System.out.println("-------");

        employees2.remove(1);
        System.out.println("ArrayList size: = " + employees2.getSize());
        for (int i = 0; i < employees2.getSize(); i++) {
            System.out.println(employees2.get(i));
        }

        System.out.println("-------");

        employees2.remove("Gregory");
        System.out.println("ArrayList size: = " + employees2.getSize());
        for (int i = 0; i < employees2.getSize(); i++) {
            System.out.println(employees2.get(i));
        }
    }
}
