package com.zipcodewilmington.scientificcalculator;

public class ToTheMoon {

    static void toTheMoon() {
        System.out.println("BLAST OFF! You're flying to the moon!\n");
        System.out.println("Are you measuring your speed in km/h or mph?");
        System.out.println("\"1\" - km/h");
        System.out.println("\"2\" - mph");
        String userInput = Console.getStringInput(":");

        String whilePrompt = "On";
        String mphKmh = "";
        while (whilePrompt.equals("On"))
            switch (userInput) {
                case "1":
                    mphKmh = "kmh";
                    whilePrompt = "Off";
                    break;
                case "2":
                    mphKmh = "mph";
                    whilePrompt = "Off";
                    break;
                default:
                    System.out.println("ERROR: Please enter \"1\" for Km/H or \"2\" for mph.");
                    userInput = Console.getStringInput(":");
            }
        System.out.println("How fast are you traveling?");
        String speedString = Console.getStringInput(":");

        boolean correctInput;
        //run a while loop that checks if a proper number was entered
        while (true) {
            correctInput = InputChecker.isNumeric(speedString);
            if (correctInput) break;
            System.out.println("Enter your value");
            speedString = Console.getStringInput(":");
        }
        double speed = Double.parseDouble(speedString);

        switch (mphKmh){
            case "kmh":
                double timeToMoon = 384000 / speed;
                System.out.println("You will get to the moon in " + Math.round(timeToMoon) + " hours!");
                break;
            case "mph":
                timeToMoon = 225623 / speed;
                System.out.println("You will get to the moon in " + Math.round(timeToMoon) + " hours!");
                break;
            default:
                System.out.println("Sorry. You're not going to the moon. You were just dreaming.");
        }
    }
}
