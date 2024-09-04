package collections;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap  <String,String> country =new HashMap<>();
        country.put("TR","Türkiye");
        country.put("ENG","Almanya");
        for (String key: country.values()){
            System.out.println(key);
        }
    }

}
