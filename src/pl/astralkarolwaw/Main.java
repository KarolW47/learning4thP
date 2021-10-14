package pl.astralkarolwaw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] namesList = {"Patrick", "John", "Ricard", "Josh"};
        String[] surnamesList = {"Gonsales", "Morales", "Turner", "Law", "Shan"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean isStillRunning = false;


        while (!isStillRunning) {
            int drawnNumberForNamesList = random.nextInt(0, namesList.length);
            int drawnNumberForSurnamesList = random.nextInt(0, surnamesList.length);

            System.out.println(namesList[drawnNumberForNamesList] + " " + surnamesList[drawnNumberForSurnamesList]);
            System.out.println();
            System.out.println("Would you like to draw again? (y/n)");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("n") || userChoice.equals("N")){
                isStillRunning = true;
            }

        }
    }
}
