import java.util.Scanner;

/**
   Converts a numeric pin to an equivalent word using the digit to 
   letter mapping on a standard telephone keypad.
 */
public class PinWordEnumerator 
{
  private String two = "ABC";
  private String three = "DEF";
  private String four = "GHI";
  private String five = "JKL";
  private String six = "MNO";
  private String seven = "PQRS";
  private String eight = "TUV";
  private String nine = "WXYZ";
  private static String numToString;
  private int iterator = 0;

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a pin number-> ");
        String num = scan.nextLine();
        numToString = num;
        System.out.println();
        System.out.printf("The keypad encodings for %s are:%n",num);        
        enumerateWords(num);
    }
    
    /**
       A wrapper for a recursive method that enumerates all the 
       phone keypad encodings for a number.
       @param n a string representing the number
     */
    public static void enumerateWords(String n)
    {
      


    }
    //number at postion 0 = 2, Generate ABC, call upon itself, number at position 1 = 4, Generate GHI, ...
    
    
}
