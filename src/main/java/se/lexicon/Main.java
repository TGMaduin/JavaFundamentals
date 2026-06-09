package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        // --------- EXERCISE 1 ---------

        String name = "Christoffer";
        int age = 41;
        String city = "Väckelsång";
        IO.println("====================");
        IO.println("     My Profile     ");
        IO.println("====================");
        IO.println("Name : " + name);
        IO.println("Age  : " + age);
        IO.println("City : " + city);
        IO.println("====================");

        // --------- EXERCISE 2 ---------

        IO.println("Enter a year: ");
        int year = Integer.parseInt(IO.readln());
        boolean isLeapYear = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeapYear = true;
                }
            }
            else{
                isLeapYear = true;
            }
        }
        IO.println(year + " is" + (isLeapYear ? "" : " NOT") + " a leap year");

        // --------- EXERCISE 3 ---------

        Item item1 = new Item("Apple", 2, 15.00);
        Item item2 = new Item("Milk", 1, 22.50);
        Item item3 = new Item("Bread", 3, 18.00);
        IO.println("============================");
        IO.println("           Receipt          ");
        IO.println("============================");
        IO.println(item1.name + "\t" + item1.quantity + " x " + item1.price + " = " + (item1.quantity * item1.price) + " SEK");
        IO.println(item2.name + "\t" + item2.quantity + " x " + item2.price + " = " + (item2.quantity * item2.price) + " SEK");
        IO.println(item3.name + "\t" + item3.quantity + " x " + item3.price + " = " + (item3.quantity * item3.price) + " SEK");
        IO.println("----------------------------");
        IO.println("Grand total:\t  " + ((item1.quantity * item1.price) + (item2.quantity * item2.price) + (item3.quantity * item3.price)) + " SEK");
        IO.println("============================");

        // --------- EXERCISE 4 ---------

        int nbr1, nbr2, nbr3;
        IO.print("Enter first number: ");
        nbr1 = Integer.parseInt(IO.readln());
        IO.print("Enter second number: ");
        nbr2 = Integer.parseInt(IO.readln());
        IO.print("Enter third number: ");
        nbr3 = Integer.parseInt(IO.readln());
        IO.println("Average: " + ((double)(nbr1 + nbr2 + nbr3) / 3));

        // --------- EXERCISE 5 ---------

        IO.print("Enter first name: ");
        String firstName = IO.readln();
        IO.print("Enter last name: ");
        String lastName = IO.readln();
        IO.println("Hello, " + firstName + " " + lastName + "! Welcome aboard.");

        // --------- EXERCISE 6 ---------

        IO.print("Enter first number: ");
        nbr1 = Integer.parseInt(IO.readln());
        IO.print("Enter second number: ");
        nbr2 = Integer.parseInt(IO.readln());
        IO.println(nbr1 + " + " + nbr2 + " = " + (nbr1 + nbr2));
        IO.println(nbr1 + " - " + nbr2 + " = " + (nbr1 - nbr2));
        IO.println(nbr1 + " * " + nbr2 + " = " + (nbr1 * nbr2));
        IO.println(nbr1 + " / " + nbr2 + " = " + (nbr1 / nbr2));
        IO.println(nbr1 + " / " + nbr2 + " = " + ((double)nbr1 / nbr2));
    }
}

class Item{
    String name;
    int quantity;
    double price;

    public Item(String n, int q, double p){
        name = n;
        quantity = q;
        price = p;
    }
}

