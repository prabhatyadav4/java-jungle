import java.util.Scanner;

class Perimeter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side of the rectangle: ");
        int first = input.nextInt();
        System.out.print("Enter the second side of the rectangle: ");
        int second = input.nextInt();
        System.out.print("Enter the third side of the rectangle: ");
        int third = input.nextInt();
        System.out.print("Enter the fourth side of the rectangle: ");
        int fourth = input.nextInt();

        int perimeter = first + second + third + fourth;

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }
}
