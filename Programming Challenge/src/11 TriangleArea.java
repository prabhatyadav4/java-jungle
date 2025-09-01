import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth of the triangle: ");
        int breadth = input.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        int area = (breadth * height)/2;

        System.out.println("The area of the triangle is: " + area);
    }
}
