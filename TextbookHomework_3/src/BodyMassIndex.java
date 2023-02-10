/**
 * @Class: BodyMassIndex
 * @Course: ITEC 2140
 * @author: Nia Jackson
 * This program will take the user's input in pounds and inches and convert them to kilograms and meters,
 * it will then take sed measurements and calculate the BMI and interpret it.
 */
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args){
        Scanner inputWeight = new Scanner(System.in);
        System.out.println("Please enter your weight in pounds: ");
        double weight = inputWeight.nextDouble();

        Scanner inputHeight = new Scanner(System.in);
        System.out.println("Please enter you height in inches: ");
        double height = inputHeight.nextDouble();

        double weightToPounds = weight * 0.4536;
        double heightToMeters = height * 0.0254;
        double bmi = weightToPounds / (heightToMeters * heightToMeters);

        if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi + " and you are UNDERWEIGHT");
        }
            else if (bmi < 25.0){
                System.out.println("Your BMI is " + bmi + " and you are NORMAL");
        }
            else if (bmi < 30.0){
                System.out.println("Your BMI is " + bmi + " and you are OVERWEIGHT");
        }
            else if (bmi >= 30.0){
                System.out.println("Your BMI is " + bmi + "and you are OBESE");
        }
    }
}
