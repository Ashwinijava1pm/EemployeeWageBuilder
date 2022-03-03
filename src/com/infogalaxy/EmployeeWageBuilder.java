package com.infogalaxy;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String args[]){
        System.out.println("Welcome Employee Wage Calculation:");
        Random r = new Random();
        int empAttendence = r.nextInt()%2;
        System.out.println(empAttendence);
        if(empAttendence ==   0){
            System.out.println("Employe is Absent:");
        }
        else if(empAttendence == 1) {
            System.out.println("Employee is Present:");
            
        }
        else{
            System.out.println("Employ is Absent:");
        }



        }

    }


