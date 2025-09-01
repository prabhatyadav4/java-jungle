import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Compound Interest Calculator\n");
        System.out.print("Enter the Principal Amount: ");
        int principal = input.nextInt();
        System.out.print("Enter the Rate: ");
        float rate = input.nextFloat();
        System.out.print("Enter the Time: ");
        float time = input.nextFloat();

        double CompoundInterest = principal * Math.pow((1+rate/100),time);

        System.out.println("The Compound Interest is: " + CompoundInterest);
    }
}
