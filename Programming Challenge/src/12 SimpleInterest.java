import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest Calculator\n");
        System.out.print("Enter the Principal Amount: ");
        int principal = input.nextInt();
        System.out.print("Enter the Rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter the Time: ");
        float time = input.nextFloat();

        double SimpleInterest = (principal*rate*time)/100;

        System.out.println("The Simple Interest is: " + SimpleInterest);
    }
}
