import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter integer : ");
    int integer = in.nextInt();
    int result = integer * integer;

    System.out.format("Result : %d", result);
    
  }
}
