import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Please list three items on your grocery shopping list.\n");
        String itemOne;
        out.println("Item 1?");
        itemOne = keyboard.nextLine();
        String itemTwo;
        out.println("Item 2?");
        itemTwo = keyboard.nextLine();
        String itemThree;
        out.println("Item 3?");
        itemThree = keyboard.nextLine();
        out.println("Now, please enter the quantity of each item.");
        int quantityOne;
        out.println("How many " + itemOne + "?");
        quantityOne = keyboard.nextInt();
        keyboard.skip("\n");
        int quantityTwo;
        out.println("How many " + itemTwo + "?");
        quantityTwo = keyboard.nextInt();
        keyboard.skip("\n");
        int quantityThree;
        out.println("How many " + itemThree + "?");
        quantityThree = keyboard.nextInt();
        keyboard.skip("\n");
        out.println("Now, please enter the price of each item.");
        float priceOne;
        out.println("How much does one " + itemOne + " cost?");
        priceOne = keyboard.nextFloat();
        keyboard.skip("\n");
        float priceTwo;
        out.println("How much does one " + itemTwo + " cost?");
        priceTwo = keyboard.nextFloat();
        keyboard.skip("\n");
        float priceThree;
        out.println("How much does one " + itemThree + " cost?");
        priceThree = keyboard.nextFloat();
        keyboard.skip("\n");
        out.println("Calculating your grocery bill.");
        float total = ((float)quantityOne * priceOne) + ((float)quantityTwo * priceTwo) + ((float)quantityThree * priceThree);
        out.println("Your total cost is $" + total);
    }
}