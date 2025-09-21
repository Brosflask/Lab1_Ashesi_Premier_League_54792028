//Class Name: FootballPlayer
//Date Created: 11/09/25
//Author Name: Asizem Curtis
//Purpose: To determine if players are suitable for matches, determine lineups and position

import java.util.Scanner;

public class PlayerSelection {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        double weight;
        int jerseyNumber;
        boolean eligible;
        String primePlayer = "";
        String veteran = "";
        String risingStar;
        String category;

        final double pound = 0.45359237;
        final int meter = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the following details: ");
        System.out.println("Name: ");
        name = scanner.next();
        System.out.println("Age: ");
        age = scanner.nextInt();
        System.out.println("Height: ");
        height = scanner.nextInt();
        System.out.println("Weight: ");
        weight = scanner.nextDouble();
        System.out.println("Jersey Number: ");
        jerseyNumber = scanner.nextInt();

        height *= meter;
        weight = weight * pound;
        weight = (int) weight;

        if (age < 20) {
            risingStar = "rising star";
            category = risingStar;

        } else if (age <= 30) {
            primePlayer = "prime player";
            category = primePlayer;
        } else
            veteran = "veteran";
        category = veteran;


        System.out.println("Player's current age is " + age);
        ++age;
        System.out.println("As a result of penalty, players current jersey will be reduced by one. ");
        --jerseyNumber;
        System.out.println("Player's age is now " + age + " and current jersey number is " + jerseyNumber);

        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age + "(" + category + ")");
        System.out.println("Height: " + height + "cm");
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Jersey Number: " + jerseyNumber);

        if (age >= 18 && age <= 35 && weight <= 90) {
            eligible = true;
            System.out.println("Eligibility : Eligible");
        } else {
            eligible = false;
            System.out.println("Eligibility : Not eligible");
        }

        if (age <= 18 || weight >= 90)
            System.out.println("Player has a problem (either too young or too heavy) ");

        if (!(age >= 18 && age <= 35 && weight <= 90)) {
            System.out.println("Not Eligible");
        }


        switch (jerseyNumber) {
            case 1:
                System.out.println("Position : GoalKeeper");
                break;
            case 2, 5:
                System.out.println("Position : Defender");
                break;


            case 6, 8: {
                System.out.println("Position : Midfielder");
                break;
            }
            case 7, 11:
                System.out.println("Position : Winger");
                break;
            case 9:
                System.out.println("Position: Striker");
                break;
            case 10:
                System.out.println("Position: Playmaker");
                break;


        }

        if (category == primePlayer) {
            if (weight < 80) {
                System.out.println("Lineup : Starting Lineup");

            } else {
                System.out.println("Lineup : Bench");
            }
        }
        String finalCheck = eligible ? "Play" : "Rest";
        System.out.println("Final Decision : " + finalCheck);

        // Unwanted fall-through demonstration
        switch (jerseyNumber) {
            case 1:
                System.out.println("GoalKeeper");
                break;
            case 2, 5:
                System.out.println("Defender");


            case 6, 8:
                System.out.println("Midfielder");


            case 7, 11:
                System.out.println("Winger");


            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;

            default:
                System.out.println("Player position undetermined");
                break;

        }
    }
}