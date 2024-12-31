/*
this one is not from Code wars but Edabit.

Create a function that takes two number strings and returns their sum as a string.
Examples
add("111", "111") ➞ "222"

add("10", "80") ➞ "90"

add("", "20") ➞ "Invalid Operation"
Notes
Return "Invalid Operation" If either input is "" or null.
 */
import java.util.Scanner;
public class AddingNumbersAsString {

    public static String add(String a, String b) {
            if(a == null || b == null || a.isEmpty() || b.isEmpty()){
                return  "Invalid Operation";
            }
            int a1 = Integer.parseInt(a);
            int b1 = Integer.parseInt(b);
            int sum = a1 + b1;


            return String.valueOf(sum);

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string:  ");
            String a = sc.nextLine();
            String b = sc.nextLine();

            System.out.println(add(a, b));
        }

    }

