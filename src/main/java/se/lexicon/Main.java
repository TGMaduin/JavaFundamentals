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
        IO.print(year + " is" + (isLeapYear ? "" : " NOT") + " a leap year");
    }
}
