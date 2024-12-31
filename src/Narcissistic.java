import java.util.Scanner;
public class Narcissistic {
    public static boolean isNarcissistic(int number) {
        int sum = 0;
        String numStr = Integer.toString(number);
        int [] arr = new int[numStr.length()];
        for(int i =0; i<numStr.length();i++){
            arr[i] = Character.getNumericValue(numStr.charAt(i));
        }
        for(int j = 0; j< arr.length; j++){
            int num = arr[j];
            int power = (int)Math.pow(num, numStr.length());
            sum += power;
        }
        return sum == number;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        System.out.println(isNarcissistic(number));
    }
}
