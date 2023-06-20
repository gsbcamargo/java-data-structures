package com.gabriel.datastructures.array;

public class Array {

    private String[] elements;
    private int size;

    public Array(int size) {
        this.elements = new String[size];
        this.size = 0;
    }

    // verifies if element[i] == null, if so, place the given element in the index i
    // kinda inefficient =(
    /*
    public void addElement(String element) {
        for (int i=0; i <= this.elements.length; i++) {
            if (this.elements[i] == null) {
                this.elements[i] = element;
                break;
            }
        }
    }*/

    /*
    // verifies if the size of the Array is less than the length of the elements
    // if so, places the given element in the size index just verified and goes to the next
    // exception treatment needed (index out of bound)
    public void addElement(String element) throws Exception {
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
        } else {
            throw new Exception("Array is already full, can't add more elements.");
        }
    }*/

    // no exception treatment needed
    public boolean addElement(String element) {
        this.increaseSize();
        if (this.size < this.elements.length) {
            this.elements[this.size] = element;
            this.size++;
            return true;
        }
        return false;
    }
    
    public boolean addElement(int position, String element) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position.");
        }

        this.increaseSize();

        // 0 1 2 3 4 5 6 size is 5
        // B C E F G + +
        // move all elements
        for (int i = this.size-1; i >= position; i--) {
            this.elements[i + 1] = this.elements[i];
        }
        //i=4
        this.elements[position] = element;
        this.size++;

        return true;
    }

    public void increaseSize() {
        if (this.size == this.elements.length) {
            String[] newElements = new String[this.elements.length * 2];
            for (int i = 0; i < this.size; i++) {
                newElements[i] = this.elements[i];
            }
            this.elements = newElements;
        }
    }

    public String search(int position) {
        if (!(position >= 0 && position < size)) {
            throw new IllegalArgumentException("Invalid position.");
        }
        return this.elements[position];
    }

    public int searchForElement(String element) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.size-1; i++) {
            s.append(this.elements[i]);
            s.append(", ");
        }
        if (this.size > 0) {
            s.append(this.elements[this.size-1]);
        }
        s.append("]");
        return s.toString();
    }

}



