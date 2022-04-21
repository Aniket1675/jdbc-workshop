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


}