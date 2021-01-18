package Labs;

import java.util.Scanner;

public class TakeOutLab
{
    public static Scanner input= new Scanner(System.in);
    public static int feed;
    public static double trayPrice;
    public static int people;
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.printf("How many person are ordering the food\n");
        people=input.nextInt();
        displayMenu();
        int totalTrays=determineTrays(people,feed);
        double subTotal=getSubtotal(trayPrice,totalTrays);
        double tax=getTax(subTotal,8);
        double tip=getTip(subTotal, 15);
        double grandTotal=getGrandTotal(subTotal,tax,tip);
        double pPerPerson=pricePerPerson(grandTotal,people);
        int leftover=determineLeftOvers(feed,totalTrays,people);
        System.out.println("*******************************************************");
        System.out.println("You need "+totalTrays+ " trays.");
        System.out.println("Feeds per each tray is: "+feed);
        System.out.printf("Price for %d people with %d tray is %.2f\n",people, totalTrays,subTotal);
        System.out.printf("Tax: %.2f\n",tax);
        System.out.printf("Tip: %.2f\n",tip);
        System.out.printf("Total(food, tax, tip): %.2f\n",grandTotal);
        System.out.printf("Price per person: %.2f\n",pPerPerson);
        System.out.println("Leftover servings for the delivery person: "+leftover);
    }
    public static void displayMenu()
    {

        if(people<=10 || people>100)
        {
            System.out.println("The number should be between 10 to 100 to order");
            System.exit(0);
        }
        else
        {
            System.out.println("Please Choose type of Meal from the menu below:");
            System.out.println("1. Italian\n2. Chinese\n3. American");
            int menu=input.nextInt();
            if(menu<1 || menu>3)
            {
                System.out.println("You entered the wrong menu number");
                System.exit(0);
            }
            if(menu==1)
            {
                displayItalianFoodMenu();
            }
            if(menu==2)
            {
                displayChineseFoodMenu();
            }
            if(menu==3)
            {
                displayAmericanFoodMenu();
            }
        }

    }
    public static void displayItalianFoodMenu()
    {
        System.out.println("Please choose one from the choices below");
        System.out.println("1.Lasagna Tray- Feeds 5 -1 7.99\n2.Pizza Pack- Feeds 7 - 15.99" +
                "\n3.Gazpacho Soup, Salad and bread sticks pack- Feeds 4 - 12.99\n");
        int subMenu=input.nextInt();
        while(subMenu >3 || subMenu <1)
        {
            System.out.println("Please choose one from the choices below");
            System.out.println("1.Lasagna Tray- Feeds 5 -1 7.99\n2.Pizza Pack- Feeds 7 - 15.99" +
                    "\n3.Gazpacho Soup, Salad and bread sticks pack- Feeds 4 - 12.99\n");
            subMenu = input.nextInt();
        }
        if(subMenu==1)
        {
            System.out.println("You choose:\n1.Lasagna Tray- Feeds 5 -17.99");
            feed=5;
            trayPrice=17.99;
        }
        if(subMenu==2)
        {
            System.out.println("You choose:\n2.Pizza Pack- Feeds 7 - 15.99");
            feed=7;
            trayPrice=15.99;
        }
        if(subMenu==3)
        {
            System.out.println("You choose:\n3.Gazpacho Soup, Salad and bread sticks pack- Feeds 4 - 12.99");
            feed=4;
            trayPrice=12.99;
        }

    }
    public static void displayChineseFoodMenu()
    {
        System.out.println("Please choose one from the choices below");
        System.out.println("1.Chicken and Broccoli Tray(includes 7 wonton soups, 7 eggs rolls)- feeds 7 - 18.99" +
                "\n2.Sweet and sour pork(7 hot and sour soup, 7 egg rolls)- Feeds 7 - 18.99" +
                "\n3.Shrimp Fried Rice tray(includes 10 egg rolls)- Feeds 5 - 10.99\n");
        int subMenu=input.nextInt();
        while(subMenu >3 || subMenu <1)
        {
            System.out.println("Please choose one from the choices below");
            System.out.println("1.Chicken and Broccoli Tray(includes 7 wonton soups, 7 eggs rolls)- feeds 7 - 18.99" +
                    "\n2.Sweet and sour pork(7 hot and sour soup, 7 egg rolls)- Feeds 7 - 18.99" +
                    "\n3.Shrimp Fried Rice tray(includes 10 egg rolls)- Feeds 5 - 10.99\n");
            subMenu = input.nextInt();
        }
        if(subMenu==1)
        {
            System.out.println("You choose:\n1.Chicken and Broccoli Tray(includes 7 wonton soups, 7 eggs rolls)- feeds 7 - 18.99");
            feed=7;
            trayPrice=18.99;
        }
        if(subMenu==2)
        {
            System.out.println("You choose:\n2.Sweet and sour pork(7 hot and sour soup, 7 egg rolls)- Feeds 7 - 18.99");
            feed=7;
            trayPrice=18.99;
        }
        if(subMenu==3)
        {
            System.out.println("You choose:\nShrimp Fried Rice tray(includes 10 egg rolls)- Feeds 5 - 10.99");
            feed=5;
            trayPrice=10.99;
        }
    }
    public static void displayAmericanFoodMenu()
    {
        System.out.println("Please choose one from the choices below");
        System.out.println("1.Hamburger and Hot dog tray- includes buns and condiments- Feeds 8 -1 21.99" +
                "\n2.Grilled Chicken sandwitch and Mozarella Sticks tray- Feeds 5 - 22.99" +
                "\n3.Barbeque Tray- includes buns and peach cobbler- Feeds 10 - 26.99\n");
        int subMenu=input.nextInt();
        while(subMenu >3 || subMenu <1)
        {
            System.out.println("Please choose one from the choices below");
            System.out.println("1.Hamburger and Hot dog tray- includes buns and condiments- Feeds 8 -1 21.99" +
                    "\n2.Grilled Chicken sandwitch and Mozarella Sticks tray- Feeds 5 - 22.99" +
                    "\n3.Barbeque Tray- includes buns and peach cobbler- Feeds 10 - 26.99\n");
            subMenu = input.nextInt();
        }
        if(subMenu==1)
        {
            System.out.println("You choose:\n1.Hamburger and Hot dog tray- includes buns and condiments- Feeds 8 -1 21.99");
            feed=8;
            trayPrice=21.99;
        }
        if(subMenu==2)
        {
            System.out.println("You choose:\n2.Grilled Chicken sandwitch and Mozarella Sticks tray- Feeds 5 - 22.99");
            feed=5;
            trayPrice=22.99;
        }
        if(subMenu==3)
        {
            System.out.println("You choose:\n3.Barbeque Tray- includes buns and peach cobbler- Feeds 10 - 26.99");
            feed=10;
            trayPrice=26.99;
        }

    }
    public static int determineTrays(int people, int feeds)
    {
        double tray=(double)people/(double)feeds;
        int traysNeeded=(int)Math.ceil(tray);
        return traysNeeded;
    }
    public static double getSubtotal(double price, int trays)
    {
        return price*trays;
    }
    public static double getTax(double subTotal, double taxRate)
    {
        double tax=subTotal*(taxRate/100);
        return tax;
    }
    public static double getTip(double subTotal, double tipRate)
    {
        double tip=subTotal*(tipRate/100);
        return tip;
    }
    public static double getGrandTotal(double subTotal, double tax, double tip)
    {
        return subTotal+tax+tip;
    }
    public static double pricePerPerson(double grandTotal, int people)
    {
        return grandTotal/people;
    }
    public static int determineLeftOvers(int feeds,int trays, int people)
    {
        return (feeds*trays)-people;
    }
}
