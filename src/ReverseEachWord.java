/* 1. Write a java program that takes a sentence as input and print the sentence
     with each other word reversed but in the original order.
     Conditions:
      1. Use Reverse word function.
      2. use loops
      3. Don't use built-in functions*/


import java.util.Scanner;
public class ReverseEachWord {

    public static String reverseWord(String str) {
        int len = str.length();
        String ans = "";
        for(int i = len - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }
    public static String reverseEachWord(String str){
        int len1 = str.length();
        String word = "";
        String ans = "";
        for(int i = 0; i < len1; i++) {
            if(str.charAt(i) == ' ') {
                ans += reverseWord(word) + " ";
                word = "";
                continue;
            }
            word += str.charAt(i);
        }
        ans += reverseWord(word);
        return ans;

    }
    public static void main(String[] args)
    {
        System.out.println("Enter the string which you want to reverse: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(reverseEachWord(str));
    }

}