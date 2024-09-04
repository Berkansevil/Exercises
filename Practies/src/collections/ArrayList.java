package collections;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List <String> list=new java.util.ArrayList<>();
        list.add("Berkan");
        list.add("sevil");
        list.add("Ahmet");
        System.out.println(list.indexOf("ahmet"));
        System.out.println(list);
        List<String> liste2=new java.util.ArrayList<>();
        liste2.addAll(list);
        String [] str=list.toArray(list.toArray(new String[0]));
        System.out.println(list.set(1,"ahmet"));
    }
}
