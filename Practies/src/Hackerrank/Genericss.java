package Hackerrank;

import javax.management.ListenerNotFoundException;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Genericss<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;

    }
    public T getContent() {
        return content;
    }
    public static <T> void printArray(T[] array){
        for (T element: array){
            System.out.println(element);
        }
    }
    public static void main(String[] args) {
    Integer [] array={1,2,3};
    String [] strArray={"hello","berkan"};
    printArray(array);
    printArray(strArray);
    }
}
