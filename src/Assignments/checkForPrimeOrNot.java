package Assignments;

public class checkForPrimeOrNot {
    public static void main(String[] args) {
        int number=7,count=0;
        if(number > 2 ) {
            for (int i = 1; i < (number); i++) {
                if (number % i == 0) {
                    count++;
                }
            }
            if (count >=2)
                System.out.println("Number is not prime ");
            else
                System.out.println("Number is  prime ");
        }

    }

}
