package com.infogalaxy;
import java.util.Random;
//UC-7-Class Method And Object
public class EmployeeWageBuilder {
    Random r = new Random();
    int workingDays = 0;
    int totalHrs = 0;
    int total_wage = 0;

    public void empWageCalculation() {
        System.out.println("Welcome Employee Wage Calculation:");

        //UC-2 Employee Daily Wages Calculation

        //UC-6-Calculate Daily Wage and Hours
        while (workingDays < Constants.TOTAL_WORKING_DAYS && totalHrs <= Constants.TOTAL_WORKING_HR) {
            workingDays++;

            System.out.println("Working Days=" +workingDays);
            int employeeAttendance = r.nextInt() % 2;
            //UC-5-Calculate Wage For Month
            System.out.println(employeeAttendance);
            //UC-1 Employee Attendance

            if (employeeAttendance == Constants.IS_ABSENT) {
                System.out.println("Employe is Absent:");
            }
            //UC-3-Employee Part Time Wage Calculation
            else if (employeeAttendance == Constants.IS_PRESENT) {
                System.out.println("Employee is Present:");
                employeeAttendance = r.nextInt() % 2;
                System.out.println("Emp_Type=" + employeeAttendance);
                //UC-4-Employee Wage Calculation Using Switch Condition
                switch (employeeAttendance) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee Work Part Time:");
                        total_wage =total_wage + (Constants.WAGE_PER_HOUR * Constants.PART_TIME_HR);
                        totalHrs = totalHrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                    case -1:
                        System.out.println("Employee Work Full Time:");
                        total_wage = total_wage + (Constants.WAGE_PER_HOUR * Constants.FULL_TIME_HR);
                        totalHrs = totalHrs + Constants.FULL_TIME_HR;
                        break;

                }

            } else {
                System.out.println("Employ is Invalid:");
            }


        }
    }
    public void showEmpWageCalaulation(){
        System.out.println("Employee Wage="+total_wage);
        System.out.println("Total Hours="+totalHrs);

    }

    public static void main(String args[]) {
    EmployeeWageBuilder employeeWageBuilder = new EmployeeWageBuilder();
    employeeWageBuilder.empWageCalculation();
    employeeWageBuilder.showEmpWageCalaulation();
        }
}



