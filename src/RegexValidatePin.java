/*
Description:
ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
If the function is passed a valid PIN string, return true, else return false.
 */
import java.util.Scanner;

public class RegexValidatePin {
    public static boolean validatePin(String pin) {
        // First check if length is either 4 or 6
        if (pin.length() != 4 && pin.length() != 6) {
            return false;
        }

        // Check if string contains only digits
        for (char c : pin.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();
        System.out.println(validatePin(pin));
    }
}
