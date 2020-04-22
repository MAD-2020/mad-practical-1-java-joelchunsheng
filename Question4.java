import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter integer : ");
    int integer = in.nextInt();

    for (int i = integer-1; i>=0 ; i--){
      for (int y=0; y<=i; y++){
        System.out.print("*");
        }
      System.out.println();
    }
    
  }
}
