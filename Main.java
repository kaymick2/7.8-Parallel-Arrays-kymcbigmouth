import java.util.*;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

class Main {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many items? For the love of god, just enter a number, I'm dying here: ");
    int totalItems = userInput.nextInt();
    String[] name = new String[5];
    double[] price = new double[5];
    int[] quantity = new int[5];
    double[] revenue = new double[5];
    for (int i = 0; i <= totalItems; i++) {
      System.out.println("Enter the item name in singular terms (i.e. \"orange\" instead of \"oranges\") :");
      String itemName = userInput.next();
      name[i] = itemName;
      // add confirmation output to user
      System.out.println("Enter the item price:");
      double itemPrice = userInput.nextDouble();
      price[i] = itemPrice;
      // add confirmation output to user
    }
    System.out.println("BUT WAIT! THERE'S MORE!");
    for (int j = 0; j <= totalItems; j++) {
      System.out.println("How many"+ name+"s would you like to purchase?");
      int itemQuantity=userInput.nextInt();
      quantity[j]= itemQuantity;
      //add confirmation output to user
    }

  }
}