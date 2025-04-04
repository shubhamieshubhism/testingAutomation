package jdbc;
import java.sql.*;

public class jdbcConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/shubhamdb?useSSL=false&serverTimezone=UTC";
        String userName = "root";
        String password = "Shubham@20";
        String query = "select * from employees";
        //String queryInsert = "insert into employees values(6,'shubham')";
        String queryInsert = "INSERT INTO employees (id, name) VALUES (?, ?)";
        int setId = 7;
        String setName = "The shubham";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,userName,password);
        Statement st = con.createStatement();

        PreparedStatement st1 = con.prepareStatement(queryInsert);
        //ResultSet rs = st.executeQuery(query);

        st1.setInt(1,setId);
        st1.setString(2,setName);
        int updateQuery = st1.executeUpdate();
//        while(rs.next()){
//            System.out.println("ID : "+rs.getInt(1) + " Name : " + rs.getString(2) );
//        }
        System.out.println(updateQuery+"Row/s affected");

        st.close();
        con.close();
    }
}
