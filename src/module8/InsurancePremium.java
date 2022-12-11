package module8;

import java.util.Scanner;

public class InsurancePremium {
    public static void main(String[] args) {

        double premium = 0;

        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name.");
         name = scan.nextLine();

        System.out.println("Do you have a US drivers license?");
        String answer = scan.nextLine();
        if(!answer.equalsIgnoreCase("yes")){
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Enter your ZIP code.");
        int zip = scan.nextInt();

        if(zip == 201910 || zip == 20740){
            premium += 60;
        }else if(zip == 22102 || zip == 22103){
            premium += 30;
        }else{
            premium += 50;
        }


        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        scan.nextLine();
         vehicleOwnership = scan.nextLine();

        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium += 10;
        }else{
            premium += 20;
        }



        System.out.println("How is this vehicle primarily used?");
         vehicleUsage = scan.nextLine();

        if(vehicleUsage.equalsIgnoreCase("business")){
            premium += 50;
        }else if(vehicleUsage.equalsIgnoreCase("pleasure")){
            premium += 10;
        } else if (vehicleUsage.equalsIgnoreCase("commute")) {
            premium += 20;
            System.out.println("Days Driven To Work And/Or School");
                 daysDrivenToWorkOrSchool = scan.nextInt();
            premium += (daysDrivenToWorkOrSchool * 5);
        }

        System.out.println("Miles Driven To Work And/Or School");
         milesToWorkOrSchool = scan.nextInt();
        premium += milesToWorkOrSchool;


        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age < 16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else if(age == 16 || age == 17){
            premium = premium * 20;
        } else if (age >= 18 && age <= 21) {
            premium = premium * 6;
        } else if (age > 21 && age < 25) {
            premium = premium * 2;
        }

        System.out.println("How many years of driving experience do you have?");
        int drivingExperience = scan.nextInt();

        if(drivingExperience > 0 && age - drivingExperience >= 16){
            premium -= (drivingExperience * 5);
        }else {
            System.out.println("Invalid data!");
            System.exit(0);
        }

        System.out.println("Have you had any car accidents in the last 5 years?");
        scan.nextLine();
        String carAccidentAnswer = scan.nextLine();

        if(carAccidentAnswer.equalsIgnoreCase("yes")){
            System.out.println("How many?");
             accidentsAmount = scan.nextInt();
            double percentAdded = ((20.0/100.0) * premium) * accidentsAmount;
            premium += percentAdded;
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
           continuousInsurance = scan.nextLine();
        if(!continuousInsurance.equalsIgnoreCase("yes")){
            premium = premium * 2;
        }

        System.out.println("What is the highest level of education you have completed?");
             education = scan.nextLine();
        if(education.equalsIgnoreCase("PhD")||
           education.equalsIgnoreCase("Bachelors")||
            education.equalsIgnoreCase("Masters")){
            double percentDiscount = ((5.0/100.0) * premium);
            premium -= percentDiscount;
        } else if (education.equalsIgnoreCase("Doctors")) {
            double percentDiscount = ((10.0/100) * premium);
            premium -= percentDiscount;
        } else if (education.equalsIgnoreCase("Less Than Highschool")) {
            double percentAdded = ((5.0/100.0) * premium);
            premium += percentAdded;
            education = education.replace(" ", "");
        }


        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" + premium);

         referenceNumber = name.substring(0, 2) + age + name.substring(name.length() - 2, name.length()) + zip + education;
        System.out.println("Reference number: " + referenceNumber.toUpperCase());


    }
}
