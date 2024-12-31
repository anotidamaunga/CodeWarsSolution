/*

 */

import static java.lang.Math.abs;

public class WarOfNumbers {
    public static int warOfNumbers(int [] numbers){
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i <= numbers.length-1; i++){
            if(numbers[i]%2 ==0){
                evenSum += numbers[i];
            }else{
                oddSum += numbers[i];
            }
        }
        return abs(evenSum-oddSum);
    }
    public static void main(String[] args) {
        int [] numbers = {2, 8, 7, 5};
        System.out.println(warOfNumbers(numbers));

    }
}