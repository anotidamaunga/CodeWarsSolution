import java.util.Scanner;
public class BasicOperations {
    public static int operation(String a, String b, String op){
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);

        if(op.equals("add")){
            return a1 +b1;
        }
        if(op.equals("subtract")){
            return Math.abs(a1-b1);
        }
        if(op.equals("divide")&& b1 !=0){
            return a1/b1;
        }
        if(op.equals("multiply")){
            return a1*b1;
        }
        if(op.equals("power")){
            return (int)Math.pow(a1,b1);
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        String a = sc.nextLine();
        System.out.println("Enter second number");
        String b = sc.nextLine();
        System.out.println("Choose add, multiply, subtract, divide, power");
        String op = sc.nextLine();
        System.out.println(operation(a,b,op));
    }
}
