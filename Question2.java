import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter height (cm): ");
    double height = in.nextDouble();

    System.out.print("Please enter weight (kg): ");
    double weight = in.nextDouble();

    System.out.format("Height : %.2f cm\nWeight : %.2f kg", height, weight);
  }
}
