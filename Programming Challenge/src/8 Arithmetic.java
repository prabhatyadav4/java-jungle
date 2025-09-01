import java.util.Scanner;

class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;
        int res5 = num1 % num2;
        System.out.println("num1 + num2 = " + res1);
        System.out.println("num1 - num2 = " + res2);
        System.out.println("num1 * num2 = " + res3);
        System.out.println("num1 / num2 = " + res4);
        System.out.println("num1 % num2 = " + res5);
    }
}
