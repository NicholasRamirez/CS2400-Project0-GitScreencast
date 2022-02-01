import java.util.Scanner;
public class Calculations
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

      int sum, difference, product, quotientOne, modulus;
      float quotientTwo;

      System.out.print("Enter a number: ");
      int x = kb.nextInt();

      kb.nextLine();

      System.out.print("Enter a second number: ");
      int y = kb.nextInt();

      kb.nextLine();

      System.out.print("Enter a string: ");
      String firstWord = kb.nextLine();

      System.out.print("Enter a second string: ");
      String secondWord = kb.nextLine();

      // presents calculations that are going to be implemented
      sum = x + y;
      difference = x - y;
      product = x * y;
      quotientOne = x / y;
      modulus = x % y;
      quotientTwo = ((float)x) / ((float)y);

      // both last characters of each word are grabbed
      char firstLast = firstWord.charAt(firstWord.length()-1);
      char secondLast = secondWord.charAt(secondWord.length()-1);

      System.out.println(x + " + " + y
                         + " = " + sum);

      System.out.println(x + " - " + y
                         + " = " + difference);

      System.out.println(x + " * " + y
                         + " = " + product);

      System.out.println(x + " / " + y
                         + " = " + quotientOne);

      System.out.println(x + " % " + y
                         + " = " + modulus);

      System.out.println(x + " / " + y
                         + " = " + quotientTwo);

      System.out.println("First word, uppercase: "
                         + firstWord.toUpperCase());

      System.out.println("Second word, lowercase: "
                         + secondWord.toLowerCase());

      System.out.println("First characters: "
                         + firstWord.charAt(0)
                         + " and "
                         + secondWord.charAt(0));

      System.out.println("Last characters: " + firstLast
                         + " and " + secondLast);
   }
}

