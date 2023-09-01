import java.util.Scanner;

public class EllipseKBInput
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter ellipse axis 1: ");
        double axis1 = keyboard.nextDouble();
        System.out.print("Enter ellipse axis 2: ");
        double axis2 = keyboard.nextDouble();
        double area = Math.PI * axis1 * axis2;
        double perimeter = Math.PI * (axis1 + axis2);
        System.out.println("The ellipse has an area of " + area + ".");
        System.out.println("A crude approximation of its perimeter is " + perimeter + ".");
    }
}
/* NOTE: I used the website > https://stackoverflow.com/questions/17538182/getting-keyboard-input <
 * to help me with this project!!! */
