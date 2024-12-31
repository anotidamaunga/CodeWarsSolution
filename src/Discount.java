/*

 */

import java.util.Scanner;

public class Discount {
    public static double discount(int price, int percentage){
        return price -(price * (percentage/100f));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        int price = sc.nextInt();
        System.out.println("Enter the discount");
        int percentage = sc.nextInt();
        System.out.println(discount(price, percentage));
    }
}