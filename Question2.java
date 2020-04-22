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
    
    double bmi = weight/(height * height);

    System.out.format("Height : %.2f m \nWeight : %.2f kg \nBMI : %.2f", height, weight, bmi);
  }
}
