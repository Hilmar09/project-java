package project.java;


import java.util.Scanner;


public final class App {
    public static void main(String[] args)
    {
        Scanner sr = new Scanner(System.in);
        System.out.print("Enter your heigth in meters:");
        double heigth = sr.nextDouble();
        System.out.print("Enter your weigth in kilograms:");
        double weigth = sr.nextDouble();
        sr.close();
        double bmi = IdentifieOrNew(heigth, weigth);
       
        String classification = "";
        if(bmi <= 16){
        classification = "Severe thinness";
       } else if(bmi <= 17){
       classification = "Moderate thinnes";
       } else if(bmi <= 18.5){
       classification = "Acceptable thinnes";
       } else if(bmi <= 25){
        classification = "Normal weigth";
       } else if(bmi <= 30){
        classification = "Excess weigth";
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
    private static double IdentifieOrNew(double heigth, double weigth){
        double bmi = weigth/(Math.pow(heigth, 2));
        return Math.rint(bmi*100)/100;
    }
}
