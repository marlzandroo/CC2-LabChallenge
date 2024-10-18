//Programmer: Marl Zandro T. Andaya
//September 5, 2024
//Laboratory Challenge No. 1: Creating a Simple Console-Based Invoice

public class Main {
    public static void main(String[] args) {
      // Store name with escape sequence using "\n" and "\""
      System.out.println("\n\t\t\t\t\t\t\t\t\t   \"McJollikod\"");
      
      // Address of the store with escape sequence using "\n"
      // Using "\t" to align the items
      System.out.println("\n\t\t\t\t\t\t\tAdress : Session Road Baguio City");
      System.out.println("\n\t\t\t\t\t\t\t   Contact No. : 0951-072-3795");
      System.out.println("\n\n\t\t\t\t\t\t\t\t\t DESCRIPTION LIST  ");
      
      //Itemized List:
      //Purchased Items and Prices
      System.out.println("\n\t\t\t\t Items : \t\t\t\t\t\t\t\t\t\tPrice : ");
      System.out.println("\n\t\t\t\t 1pc Spicy Chicken \t\t\t\t\t\t\t    ₱109.00 ");
      System.out.println("\t\t\t\t 1pc Burger Steak \t\t\t\t\t\t\t    ₱89.00 ");
      System.out.println("\t\t\t\t 1pc Ala King \t\t\t\t\t\t\t\t    ₱99.00 ");
      System.out.println("\t\t\t\t 2 BFF Fries \t\t\t\t\t\t\t\t    ₱138.00 ");
      System.out.println("\t\t\t\t 3 Large Sprite\t\t\t\t\t\t\t\t    ₱117.00 ");
      System.out.println("\t\t\t\t 3 Oreo Ice Cream \t\t\t\t\t\t\t    ₱177.00 ");
      System.out.println("\n\t\t\t\t--------------------------------------------------------");
      
      //Total Amount:
      //Combination of "print" and "println" to display the total price
      System.out.print("\n\t\t\t\tSold Items : 11 items \t\t\t\t\t Total : ₱669.00");
      System.out.println("\n\t\t\t\tCash : ₱1000.00 \t\t\t\t\t\tChange : ₱331.00");
      
      //Additional Notes:
      //Using escape sequence "\n" and "\""
      System.out.println("\n\n\t\t\t\t\t\t\t\t\t   \"THANK YOU\""); 
    }
}