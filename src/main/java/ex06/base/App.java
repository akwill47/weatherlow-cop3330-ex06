package ex06.base;
import java.util.Scanner;
import java.time.LocalDate;
/*Exercise 6 - Retirement Calculator
Your computer knows what the current year is, which means you can incorporate that into your programs. You just have to figure out how your programming language can provide you with that information.

Create a program that determines how many years you have left until retirement and the year you can retire. It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.
Constraints
Again, be sure to convert the input to numerical data before doing any math.
Don’t hard-code the current year into your program. Get it from the system time via your programming language.
Challenge
Handle situations where the program returns a negative number by stating that the user can already retire.
 */

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        System.out.print("What is your current age? ");
        String input1 = myApp.readInput();
        System.out.print("At what age would you like to retire? ");
        String input2 = myApp.readInput();

        int currentAge = myApp.convStr(input1);
        int retireAge = myApp.convStr(input2);

        myApp.retireInfo(currentAge,retireAge);
    }
    private String readInput(){
        return in.nextLine();
    }
    private int convStr(String input){
        int num = Integer.parseInt(input);
        return num;
    }
    private void retireInfo(int currentAge,int retireAge){
        LocalDate time = LocalDate.now();
        int year = time.getYear();
        int ageLeft = retireAge - currentAge;
        int retireYear = year + ageLeft;
        System.out.printf("You have %d years left until you can retire.\nIt's %d, so you can retire in %d.",ageLeft,year,retireYear);
    }
}
