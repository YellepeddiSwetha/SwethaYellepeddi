package Assignments;

public class largestOfThree {
    public static void main(String[] args) {
        int n1 = 140, n2 = 130, n3 = 100;
        int max;
        max = (n1>n2) ? (n1>n3 ? n1 :n3) : (n2>n3 ?n2 :n3);
        System.out.println(max+" is the largest of three");

    }

}

