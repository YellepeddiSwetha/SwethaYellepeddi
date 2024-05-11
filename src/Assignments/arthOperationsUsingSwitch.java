package Assignments;

import java.util.Scanner;

public class arthOperationsUsingSwitch {
    public static void main(String[] args) {
        int userInput1=0, userInput2=0,result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the arthmetic operation to be used ");
        char ch = sc.next().charAt(0);
        System.out.println("Enter inputs: ");
         userInput1 = sc.nextInt();
        System.out.println("input1 : \t" + userInput1 );
         userInput2 = sc.nextInt();
        System.out.println("input2\t" + userInput2);
         switch(ch) {
             case '+':
                 result = userInput1 + userInput2;
                 break;
             case '-':
                 result = userInput1 - userInput2;
                 break;
             case '*':
                 result = userInput1 * userInput2;
                 break;
             case '/':
                 result = userInput1 / userInput2;
                 break;
             case '%':
                 result = userInput1 % userInput2;
                 break;
             default:
                 System.out.println("Invalid operation type, choose from '+','-','*','/','%'");
         }
        System.out.println("Result :" + result);

         }

    }





