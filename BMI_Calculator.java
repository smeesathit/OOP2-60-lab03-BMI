/**
 * This program accepts weight and height, then calculates BMI.Write a description of class BMI_Calculator here.
 */

import java.util.*;

public class BMI_Calculator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * This is the main method
     */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Get weight and height via the standard input window
        double w = 0.0;
        double h = 0;
        double bmi;
        
        System.out.print("Enter weight in kilogram: ");
        w = scanner.nextDouble();
        System.out.print("Enter height in centimeter: ");
        h = scanner.nextDouble();
        
        /*
        // Echo the input for testing purpose
        System.out.println();
        System.out.println("weight = " + w);
        System.out.println("height = " + h);
        */
        
       // Compute BMI
        h = h / 100.0;
        bmi = w / (h * h);
        System.out.println("BMI = " + bmi);
               
    } // End main
} // End class
