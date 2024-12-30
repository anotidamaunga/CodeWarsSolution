/*
Check to see if a string has the same amount of 'x's and 'o's.
The method must return a boolean and be case insensitive. The string can contain any char.
 */

import java.util.Scanner;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        int iCounter = 0;
        int yCounter = 0;
        //go through the string checking whether the char at each index is an 'o' or not
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == 'o' || str.charAt(i) == 'O'){
                iCounter++;//if the character is an 'o' then increment the iCounter
            }
        }

        //go through the string checking whether the char at each index is an x or not
        for(int y = 0; y<str.length(); y++){
            if(str.charAt(y) == 'x' || str.charAt(y) == 'X'){
                yCounter++;//increment yCounter
            }
        }

        if(iCounter == yCounter){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
       System.out.println(getXO(str));
    }
}
