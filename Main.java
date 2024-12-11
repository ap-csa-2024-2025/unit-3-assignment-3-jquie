import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    // TODO: Problem 1
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    if (num2 == 0)
    {
      System.out.println("Error");
    }
    else
    {
      if (1 < (num1 / num2) && (num1 / num2) <= 8)
      {
        System.out.println("Ratio OK");
      }
      else
      {
        System.out.println("Ratio NOT OK");
      }
    } 

    // TODO: Problem 2
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (b == 0)
    {
      System.out.println("Error");
    }
    else
    {
      if (a % b == 0)
      {
        System.out.println("Is a factor");
      }
      else
      {
        System.out.println("Not a factor");
      }
    }

    // TODO: Problem 3
  }

  // TODO: In-class assignment
  // Create a method that takes in two Rectangles and returns
  // true if they are equal, and false otherwise.  Two
  // Rectangles are considered equal if their widths are equal,
  // and if their lengths are equal.
  public static boolean rectEqual(Rectangle r1, Rectangle r2)
  {
    // implement solution here
    return false;
  }
}
