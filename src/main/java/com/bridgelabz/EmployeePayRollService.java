package com.bridgelabz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;



/**
 * Purpose: Class EmployeePayRollService
 *
 * @author Aniket Kumbhar
 * @version 1.0
 * @since 21-04-2022
 *
 */

public class EmployeePayRollService {

    PreparedStatement preparedStatement;
    Connection connection = EmployeeConfig.getConfig();


    public void insertData(String name,Date doj)
    {
        String insert = "insert into empdetail (emp_name,emp_doj) values(?,?);";
        try{
            preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1,name);
            preparedStatement.setDate(2,doj);
            preparedStatement.execute();
            System.out.println("Record Added Successfully");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void deleteData(String name) throws SQLException {
        String delete = "delete from empdetail where emp_name = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(delete);
        preparedStatement.setString(1, name);
        preparedStatement.executeUpdate();
        System.out.println("Delete Record SuccessFully");
    }

    public void displayRecord() throws SQLException {

        try {
            String sql = "select * from empdetail";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSets = preparedStatement.executeQuery();
            System.out.println("Id\t\t Emp_Name\t\t DOJ");

            while (resultSets.next()) {

                int id = resultSets.getInt("emp_id");
                String name = resultSets.getString("emp_name");
                String doj = resultSets.getString("emp_doj");
                System.out.println(id + "\t\t" + name + "\t\t" + doj);
            }
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}