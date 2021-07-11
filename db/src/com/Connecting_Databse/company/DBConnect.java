package com.Connecting_Databse.company;

import java.sql.*;

public class DBConnect {

    public static void main(String[] args) {
        // write your code here


        try {
            String host = "jdbc:mysql://localhost:3306/employees";
            String uName = "root";
            String uPass = "n@hid1126";
            Connection connection = DriverManager.getConnection(host, uName, uPass);

            Statement statement = connection.createStatement();
            String sql = "select * from workers";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id_col = resultSet.getInt("ID");
                String firstName = resultSet.getString("First_Name");
                String lastName = resultSet.getString("Last_Name");
                String jobtitle = resultSet.getString("Job_title");

                String p = id_col + " " + firstName + " " + lastName + " " + jobtitle;
                System.out.println(p);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
