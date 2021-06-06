package ex06.base;
import java.util.Scanner;
import java.time.LocalDate;
/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 William Weatherlow
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
