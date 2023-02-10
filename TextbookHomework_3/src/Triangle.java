/**
 * @class: Triangle
 * @author: Nia Jackson
 * @course: ITEC 2140
 * This program will calculate the perimeter of a triangle only if the values given by the user are valid.
 */

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner inputSide1 = new Scanner(System.in); //Creates a new scanner for Side 1 input
        System.out.println("Please enter the length of side 1: ");
        double side1 = inputSide1.nextDouble();

        Scanner inputSide2 = new Scanner(System.in); //Creates a scanner for Side 2 input
        System.out.println("Please enter the length of side 2:");
        double side2 = inputSide2.nextDouble();

        Scanner inputSide3 = new Scanner(System.in); //Creates a scanner for side 3 input
        System.out.println("Please enter the length of side 3: ");
        double side3 = inputSide3.nextDouble();

//These if/else statements serve the function of calculating a valid input for a triangle meaning that
//the two sides entered have to have a sum larger than the third side.

        if ((side1 + side2) > side3) {
            System.out.println("The perimeter is " + side1 + side2 + side3);
        } else
            System.out.println("INVALID INPUT");

        if ((side2 + side3) > side1) {
            System.out.println("The perimeter is " + side1 + side2 + side3);
        } else
            System.out.println("INVALID INPUT");

        if ((side3 + side1) > side2) {
            System.out.println("The perimeter is " + side1 + side2 +side3);
        } else
            System.out.println("INVALID INPUT");
    }
    }

