package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnector {
    public static void main(String[] args) {
        Connection connection=null;
        String url="jdbc:postgresql://localhost/test?user=postgres&password=postgres";
        try{
            connection=DriverManager.getConnection(url);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }






}
