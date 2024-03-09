package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

public class AppTest extends TestCase {

    public static void test1() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);

        int param1 = 10;
        int param2 = 5;
        int result = App.performOperation(list1, list2, param1, param2);
        int expected = ((3 + 5) + (2 + 4)) * (10 - 5);
        assertEquals(expected, result);
    }

    public static void test2() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(-3);
        list1.add(-5);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(-2);
        list2.add(-4);
        int param1 = -10;
        int param2 = -5;

        int result = App.performOperation(list1, list2, param1, param2);
        int expected = ((-3 + -5) + (-2 + -4)) * (-10 - (-5));
        assertEquals(expected, result);
    }

    public static void test3() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(0);
        list2.add(0);
        int param1 = 0;
        int param2 = 0;

        int result = App.performOperation(list1, list2, param1, param2);
        int expected = ((0 + 0) + (0 + 0)) * (0 - 0);
        assertEquals(expected, result);
    }

    public static void test4() {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int param1 = 10;
        int param2 = 5;

        int result = App.performOperation(list1, list2, param1, param2);
        int expected = ((0)+(0)) * (10-5);
        assertEquals(expected, result);
    }

    public static void test5() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(40);

        int param1 = 10;
        int param2 = 5;

        int result = App.performOperation(list1, list2, param1, param2);
        int expected = ((10 + 15) + (20 + 40)) * (10 - 5);
        assertEquals(expected, result);
    }
    public static void main(String[] args) {
    		test1();
            test2();
            test3();
            test4();
            test5();
    }
}
