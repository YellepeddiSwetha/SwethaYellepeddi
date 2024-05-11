package Assignments;

public class fizzBust {
    public static void main(String[] args) {

        for(int num =1 ; num<100 && num>0; num++) {
            if (num % 3 == 0 && num % 5 == 0) { System.out.println("FIZZBUST");
            } else if (num % 3 == 0) {
                System.out.println("FIZZ");
            } else if (num % 5 == 0) {
                System.out.println("BUST");
            }
            else System.out.println(num);

        }

    }

}
