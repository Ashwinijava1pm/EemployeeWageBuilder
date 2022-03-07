package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[]){
        System.out.println("Welcome Employee Wage Calculation:");
        Random r = new Random();
        //UC-2 Employee Daily Wages Calculation
        final int WAGE_PER_HOUR = 20;
        final int DAY_PER_HOUR = 8;
        int total_wage = 0;
        int empAttendence = r.nextInt()%2;
        System.out.println(empAttendence);
        //UC-1 Employee Attendance
        if(empAttendence ==   0){
            System.out.println("Employe is Absent:");
            System.out.println("Employe wages="+total_wage);
        }
        else if(empAttendence == 1) {

            System.out.println("Employee is Present:");

            total_wage = WAGE_PER_HOUR * DAY_PER_HOUR;
            System.out.println("Employe Wages="+total_wage);
            
        }
        else{
            System.out.println("Employ is Invalid:");
        }



        }

    }


