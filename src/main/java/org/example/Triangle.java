import java.util.Scanner;
public class Triangle
{
    private static double area;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n Enter the three sides of the triangle: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        area = CalculateArea(side1, side2, side3);
        System.out.format("\n The Area of the triangle = %.2f\n",area);
    }
    public static double CalculateArea(double side1, double side2, double side3)
    {
        double s;
        s = (side1 + side2 + side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return area;
    }
}