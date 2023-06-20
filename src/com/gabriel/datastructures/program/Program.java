package com.gabriel.datastructures.program;

import com.gabriel.datastructures.array.Array;

public class Program {

    public static void main(String[] args) {

        // ============== arrays ==============
        Array array = new Array(10);

        array.addElement("element 1");
        array.addElement("element 2");
        array.addElement("element 3");

        /*
        System.out.println(array.size());

        System.out.println(array.search(2));

        System.out.println((array.searchForElement("element 1")));
        */

        array.addElement(0, "B");
        array.addElement(3,"JJ");

        System.out.println(array);


        // testing increaseSize() method
        Array array2 = new Array(3);

        array2.addElement("A");
        array2.addElement("B");
        array2.addElement("C");
        array2.addElement("D");
        array2.addElement("E");


        System.out.println(array2);
    }
}
