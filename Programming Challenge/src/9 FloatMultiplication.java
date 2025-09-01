import java.util.Scanner;

class FloatMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first decimal number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter the second decimal number: ");
        float num2 = input.nextFloat();
        float res = num1 * num2;
        System.out.println("The product of two floats is: " + res);
    }
}
