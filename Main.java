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
    int num = sc.nextInt();
    if (50 <= num && num <= 59)
    {
      System.out.println("Your number is " + num);
    }
    else
    {
      System.out.println("That's not in the fifties!");
      num = 55;
      System.out.println("Your number is " + num);
    }

    // TODO: Problem 4
    int y = sc.nextInt();
    int x = sc.nextInt();
    if (!(y > 9) || (!(x<= 2) && (x*y > 10)))
    {
      System.out.println("pass");
    }
    else
    {
      System.out.println("fail");
    }

  }
}
