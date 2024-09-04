package Generics;

import collections.ArrayList;

public class MyList <T>{
    private T [] array;
    private final int capacity =10;
    private int size;


    public MyList(){
        array=(T[]) new Object[capacity];
        size=0;
    }
    public MyList(int capacity){
        if(capacity<1){
            throw  new RuntimeException("Capacity must not zero");
        }
        array=(T[]) new Object[capacity];
        size=0;
    }
    private  void ensureCapacity(){
        if(size > array.length){
            T[] newArray=(T[]) new Object[array.length*2];
            System.arraycopy(array,0,newArray,0,size);
            array=newArray;
        }
    }
}
