/*Description:
Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order.
Essentially, rearrange the digits to create the highest possible number.
*/
import java.util.Arrays;
import java.util.Scanner;
public class descendingOrder {
    public static int sortDesc(final int num) {
        if(num < 0){
            System.out.println("Enter a positive number number.");
        }
        char [] digits = Integer.toString(num).toCharArray();//first convert the final number to string and then to a char array
        Arrays.sort(digits);//sort the array in ascending order
        StringBuilder sb = new StringBuilder(new String(digits));
        int sortDesc = Integer.parseInt(sb.reverse().toString());//sort the number in descending order
        return sortDesc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(sortDesc(num));
    }
}
