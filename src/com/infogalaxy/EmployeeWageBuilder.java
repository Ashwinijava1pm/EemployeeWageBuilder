package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[]){
        System.out.println("Welcome Employee Wage Calculation:");
        Random r = new Random();

        //UC-2 Employee Daily Wages Calculation
        final int WAGE_PER_HOUR = 20;
        final int FULL_TIME_DAY_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        int total_wage = 0;
        int employeeAttendance = r.nextInt()%2;
        System.out.println(employeeAttendance);
        //UC-1 Employee Attendance
        if(employeeAttendance ==   0){
            System.out.println("Employe is Absent:");
            System.out.println("Employe wages="+total_wage);
        }
        //UC-3-Employee Part Time Wage Calculation
        else if(employeeAttendance == 1) {
            int emp_Type;
            System.out.println("Employee is Present:");
            employeeAttendance = r.nextInt()%2;
            System.out.println("Emp_Type="+employeeAttendance);
            if(employeeAttendance == 1) {
                total_wage = WAGE_PER_HOUR * FULL_TIME_DAY_HOUR;
                System.out.println("Employe Full Time Wages=" + total_wage);
            }
            else if(employeeAttendance == 0){
                total_wage = WAGE_PER_HOUR * PART_TIME_HOUR;
                System.out.println("Employee Part Time Wage="+total_wage);
            }

            
        }
        else{
            System.out.println("Employ is Invalid:");
        }



        }

    }


