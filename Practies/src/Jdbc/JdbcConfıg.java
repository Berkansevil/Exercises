package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConfıg {
    public static final String DATABASE_NAME = "University";
    public static final String DATABASE_USERNAME = "postgres";
    public static final String DATABASE_PASSWORD = "postgres";
    public static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/" + DATABASE_NAME;

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        String sql = "SELECT * FROM University";
        try {
            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
            statement = connection.createStatement();
            ResultSet data = statement.executeQuery(sql);
            while(data.next()){
                System.out.println("ID : " +data.getInt("student_id"));
                System.out.println("Firstname" + data.getString("first_name"));
                System.out.println("Email " + data.getString("email"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
