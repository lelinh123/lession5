package bai1;

import utils.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();
        Statement statement = connection.createStatement();
//        String sql = "select * from student";
        String sql = "INSERT INTO student(id, names, address) VALUES (4, 'nguyen van a', 'ninh binh')";
        statement.executeUpdate(sql);
//        ResultSet rs = statement.executeQuery(sql);
//
//        while (rs.next()) {
//            int id = rs.getInt(1);
//            String name = rs.getString(2);
//            String address = rs.getString("address");
//            System.out.println("Id: " + id + ", Name: " + name + ", Address: " + address);
//        }
        connection.close();
    }
}
