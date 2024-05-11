package Assignments;

public class leapYear {
    public static void main(String[] args) {

        boolean isLeapYear;
        int year = 400;
        if (year % 4 == 0) {
            if ((year % 100 == 0)){
                if((year % 400) == 0) {
                    System.out.println("Year is leap year");
                } else
                    System.out.println("Year is not a leap year");
            }
            else    System.out.println("Year is leap year");
        }
        else  System.out.println("Year is not a leap year");
    }}

