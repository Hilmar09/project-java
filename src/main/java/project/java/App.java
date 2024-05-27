package project.java;


import java.util.Scanner;


public final class App {
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter your height in meters:");
        double height = sr.nextDouble();
        System.out.print("Enter your weight in kilograms:");
        double weight = sr.nextDouble();
        sr.close();
        double bmi = IdentifieOrNew(height, weight);
       
        String classification = "";
        if(bmi <= 16){
        classification = "Severe thinness";
       } else if(bmi <= 17){
       classification = "Moderate thinness";
       } else if(bmi <= 18.5){
       classification = "Acceptable thinness";
       } else if(bmi <= 25){
        classification = "Normal weight";
       } else if(bmi <= 30){
        classification = "Excess weight";
       } else if(bmi <= 35){
        classification = "Obese: type 1";
       } else if(bmi <= 40){
        classification = "Obese: type 2";
       } else {
        classification = "Obese; type 3";
       }


       System.out.println("\nYour body mass index is:" + bmi);
       System.out.println("Attending to the bmi, you have " + classification);
    }
<<<<<<< HEAD
    private static double IdentifieOrNew(double height, double weight){
=======
    private static double IdentifieOrNew(double heigth, double weigth){
>>>>>>> 149170e654d5b7e4a9205d6c1c77dda8ec72b3c8
        double bmi = weight/(Math.pow(height, 2));
        return Math.rint(bmi*100)/100;
    }
}
