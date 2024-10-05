package Arrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to test whether it is palindrome or not : ");


        String word = sc.nextLine();

        if(word.charAt(0)!= word.charAt(word.length()-1)){
            
            System.out.println("not a palindrome");
        }
        String rev_str = "";

        for(int i = word.length()-1; i >= 0 ; i-- ){

            rev_str += word.charAt(i);
        }

        System.out.println("Original String : "+word);
        System.out.println("Reversed String : "+rev_str);

        if(word.equals(rev_str)){
            System.out.println("The given String is palindrome");
        }

        sc.close();
    }
}
