package edu.wctc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner newVar = new Scanner(System.in);

        boolean quizOver = false;

        do {
            System.out.println("Welcome to the Preference Quiz!");

            int finalTotal = Integer.parseInt(totalOutput());

            System.out.println(finalTotal);

            if (finalTotal > 3) {
                System.out.println("You prefer a spontaneous and active lifestyle");
            } else if (finalTotal == 3) {
                System.out.println("You prefer a good balance in life");
            } else if (finalTotal < 3) {
                System.out.println("You prefer a calm and organized lifestyle");
            }
            System.out.println("Again? Enter 1 to play again, or any other key to exit.");
            String choice = newVar.nextLine();

            if (!choice.equals("1")){
                quizOver = true;
            }
        } while (quizOver == false);
    }


    public static String totalOutput(){
        Scanner keyboard = new Scanner(System.in);

        String[] promptsArray = new String[5];
        promptsArray[0] = "Do you prefer mild or spicy?";
        promptsArray[1] = "Do you prefer tea or coffee?";
        promptsArray[2] = "Do you prefer breakfast or brunch?";
        promptsArray[3] = "Do you prefer summer or winter?";
        promptsArray[4] = "Do you prefer paper or plastic?";

        String[] answersArray = new String[5];
        answersArray[0] = "Enter 0 for mild or 1 for spicy: ";
        answersArray[1] = "Enter 0 for tea or 1 for coffee: ";
        answersArray[2] = "Enter 0 for breakfast or 1 for brunch: ";
        answersArray[3] = "Enter 0 for summer or 1 for winter: ";
        answersArray[4] = "Enter 0 for paper or 1 for plastic: ";

        int[] choicesArray = new int[5];

        for (int i = 0; i < promptsArray.length; i++){
            System.out.println(promptsArray[i]);
            System.out.println(answersArray[i]);
            choicesArray[i] = Integer.parseInt(keyboard.nextLine());
        }

        int total = 0;

        for (int i: choicesArray){
            total += i;
        }
        return Integer.toString(total);
    }
}

