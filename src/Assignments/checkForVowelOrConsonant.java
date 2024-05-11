package Assignments;

public class checkForVowelOrConsonant {
    public static void main(String[] args) {
        char ch='E';
        boolean isA ;
        if(ch == 'a' || ch=='A'|| ch=='e'||ch=='E'|| ch=='i' || ch=='I'||ch=='o'||ch=='O' ||ch=='U'||ch=='u'){

            System.out.println(ch+"\t is a vowel");
        }
        else System.out.println(ch+"\t is consonant");
    }
}
