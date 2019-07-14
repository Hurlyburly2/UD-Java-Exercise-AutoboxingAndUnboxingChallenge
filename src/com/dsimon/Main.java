package com.dsimon;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return this.myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Doug");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        // Use the "Integer" class to box an integer, works with all primitive types
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        // Boxing lets you use it in ArrayList without building custom class
        // .valueOf = autoboxing, putting it in the wrapper
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }

        //  .intValue() = unboxing, removing it from the wrapper
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " --- " + intArrayList.get(i).intValue());
        }

        //SHORTCUT:
        Integer myIntValue = 56;        // Integer.valueOf(56) -> Java does that for you
        int myInt = myIntValue;         // myIntValue.intValue() -> Java will also automatically unbox

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleValues.add(dbl);
        }

        System.out.println(myDoubleValues.toString());
    }
}
