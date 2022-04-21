package com.bridgelabz;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
/**
 * Purpose: This class is used for to take input from used perform the operartion
 * @author Aniket Kumbhar
 * @version 1.0
 * @since 21-04-2022
 */

public class EmployeePayRoll {
    public static void main(String[] args) throws SQLException {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*- Welcome to Employee Payroll -*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
        EmployeePayRollService employeePayRollService = new EmployeePayRollService();

        Scanner scanner = new Scanner(System.in);
        final int EXIT = 4;
        int choice = 0;
        while (choice != EXIT) {
            System.out.println();
            System.out.println(
                    "Enter Your Choice: \n 1. Insert Record ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter name you want to insert");
                    String name = scanner.next();
                    System.out.println("Enter date you want to insert");
                    String date = scanner.next();
                    employeePayRollService.insertData(name, Date.valueOf(date));
                    break;

            }
        }

    }


}