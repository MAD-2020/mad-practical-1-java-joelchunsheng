import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    ArrayList<Integer> integerList = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    System.out.print("Number of integers : ");
    int numberInteger = in.nextInt();

    for (int q = 0; q < numberInteger; q++){
      System.out.print("Enter integer : ");
      int number = in.nextInt();
      integerList.add(number);
    }
    
    // Reverse list
    Collections.reverse(integerList);

    int n = integerList.size();
    
    int maxCount = 1; 
    int currentCount = 1; 
    int mode = integerList.get(0);

    for (int i = 1; i < n; i++) {
      //if values match, increase currentCount
      if (integerList.get(i) == integerList.get(i-1)) 
        currentCount++; 
      //if values don't match, save and move on
      else{ 
        maxCount = currentCount; 
        mode = integerList.get(i-1); 
        currentCount = 1; 
        } 
      } 

    // checks for last value 
    if (currentCount >= maxCount){ 
      maxCount = currentCount; 
      mode = integerList.get(n-1); 
    } 

    System.out.print("Mode: " + mode);
    
  }
}
