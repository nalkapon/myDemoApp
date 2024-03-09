package com.mycompany.app;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
    		
    }

    public static int performOperation(ArrayList<Integer> list1, ArrayList<Integer> list2, int param1, int param2) {
        int sum1 = 0;
        for (int num : list1) {
            sum1 += num;
        }
        int sum2 = 0;
        for (int num : list2) {
            sum2 += num;
        }

        int result = (sum1 + sum2) * (param1 - param2);     
        return result;
    }
}
