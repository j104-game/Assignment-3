/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
!!!!!!
Look into things like charAt- DO NOT NAME YOUR VARIABLE "REVERSED". If you do, automatic 0 points!!!!!!
!!!!!!!
if you're confused reach out!
 */

import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and it will be printed back one letter at a time: ");
        String input = sc.next();
        
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
}
/* Write Up/Explanation:
I googled what charAt is and does and I also used input.length(). Both names are pretty self explanatory, charAt is the character at the 
specified index in a string. It starts at 0, which is the first character. And input.length() is the length of the string entered.
The code takes the input length and uses the number of characters to run through the loop that many times.
Each loop the code prints out the character at the current i, which is also the index for the charAt. */       
