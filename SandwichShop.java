import static java.lang.System.out;
import java.util.Scanner;
public class SandwichShop
{
    public static void main(String[] args)
    {
        // Goals
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        out.println("Checking sales goals.\n");
        // Checking goals for veggie sandwich sales
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?");
        int veggieSales;
        veggieSales = keyboard.nextInt();
        keyboard.skip("\n");
        if (veggieSales >= goalForVeggies) {
            out.println("Made goal for veggies!\n");
        } else {
            out.println("Fell short...\n");
        }
        // Checking goals for burger sales
        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        int burgerSales;
        burgerSales = keyboard.nextInt();
        keyboard.skip("\n");
        if (burgerSales >= goalForBurgers) {
            out.println("Made goal for burgers!\n");
        } else {
            out.println("Fell short...\n");
        }
        // Checking goals for sub sales
        out.println("The sales for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        int subSales;
        subSales = keyboard.nextInt();
        keyboard.skip("\n");
        if (subSales >= goalForSubs) {
            out.println("Made goal for subs!\n");
        } else {
            out.println("Fell short...\n");
        }
        // Checking goals for soup sales
        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        int soupSales;
        soupSales = keyboard.nextInt();
        keyboard.skip("\n");
        if (soupSales >= goalForSoup) {
            out.println("Made goal for soup!\n");
        } else {
            out.println("Fell short...\n");
        }
        // Checking all goals
        if (soupSales >= goalForSoup && burgerSales >= goalForBurgers && subSales >= goalForSubs && veggieSales >= goalForVeggies) {
            out.println("Congratulations! Made goal for everything!");
        }
    }
}