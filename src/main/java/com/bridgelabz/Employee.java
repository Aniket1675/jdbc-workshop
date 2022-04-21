package com.bridgelabz;

import java.util.Date;

/**
 * Purpose: POJO Class
 *
 * @author Aniket Kumbhar
 * @version 1.0
 * @since 21-04-2022
 *
 */

public class Employee {
    int emp_id;
    String emp_name;
    Date emp_doj;

    public Employee(int emp_id, String emp_name, Date emp_doj) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_doj = emp_doj;
    }

    public Employee() {

    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Date getEmp_doj() {
        return emp_doj;
    }

    public void setEmp_doj(Date emp_doj) {
        this.emp_doj = emp_doj;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_doj=" + emp_doj +
                '}';
    }
}
