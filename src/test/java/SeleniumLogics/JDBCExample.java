package SeleniumLogics;

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) {
        jdbcConnection("select * from employee");
    }

    private static void jdbcConnection(String Query) {
        String url = "jdbcexample.com";
        String user = "Shubham";
        String password = "shubham@jdbc";

        try(Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement()){
            System.out.println("Connected to the database");
            //execute query
            ResultSet resultset = statement.executeQuery(Query);
            while(resultset.next()){
                System.out.println("id"+resultset.getInt("id ")+"name: "+resultset.getString("name"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
