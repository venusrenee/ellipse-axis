import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EllipseFileInput
{
 public static void main(String[] args){
    try {
    File ellipsefile = new File("EllipseAxes.txt");
    Scanner filescanner = new Scanner(ellipsefile);
    double axis1 = filescanner.nextDouble();
    double axis2 = filescanner.nextDouble();
    double area = Math.PI * axis1 * axis2;
    double perimeter = Math.PI * (axis1 + axis2);
    System.out.println("The ellipse has an area of " + area + ".");
    System.out.println("A crude approximation of its perimeter is " + perimeter + ".");
}
    catch (FileNotFoundException e){
        System.out.println("An error has occured");
        e.printStackTrace();
    }
}
}
/* NOTE: I used the website > https://www.w3schools.com/java/java_files_read.asp < 
 * to help me with this project!!! */
