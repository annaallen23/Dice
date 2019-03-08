package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");

        System.out.println("Do you want to use a custom dice? + Y/N");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        boolean isCustom = answer.equals("Y");

        Dice dice = isCustom ? getCustomDiceFromUser() : getStandardDiceFromUser();
        System.out.println("Please enter the number of rolls");
        int numberOfRolls = getIntegerFromUser();
        int sumOfRolls = calculateTotalRoll(dice, numberOfRolls);
        System.out.println("Your roll total is " + sumOfRolls);
    }

    private static Dice getCustomDiceFromUser() {
        System.out.println("How many sides does your dice have?");
        int numberOfSides = getIntegerFromUser();
        System.out.println("Please enter list of numbers of faces");
        List <Integer> faces = getListFromUser(numberOfSides);
        return new CustomDice(numberOfSides,faces);
    }

    private static Dice getStandardDiceFromUser() {
        System.out.println("How many sides does your dice have?");
        int numberOfSides= getIntegerFromUser();
        return new StandardDice(numberOfSides);
    }

    private static int calculateTotalRoll(Dice dice, int numberOfRolls) {
        int sumOfRolls = 0;
        for (int i=0; i<numberOfRolls; i++) {
            sumOfRolls = sumOfRolls + dice.roll();
        }
        return sumOfRolls;
    }


//    private static int randomInt(int low, int high) {
//        Random randomNumber = new Random();
//        int result = randomNumber.nextInt(high-low+1)+low;
//
//        return result;
//    }
    public static int getIntegerFromUser(){
        Scanner inputFromUser = new Scanner(System.in);
        int input = inputFromUser.nextInt();

        return input;
    }
//    private static int calculateSumOfRolls( int numberOfSides, int numberOfRolls) {
//        int sumOfRolls = 0;
//        for (int i = 0; i < numberOfRolls; i++) {
//            int randomRoll = randomInt(1, numberOfSides);
//            sumOfRolls = sumOfRolls + randomRoll;
//        } return sumOfRolls;
//    }
    private static List<Integer> getListFromUser(int numberOfSides) {
        List<Integer> faces = new ArrayList<>();
        Scanner inputList = new Scanner(System.in);
        for (int i = 0; i < numberOfSides; i++) {
            faces.add(inputList.nextInt());
        }
        return faces;
    }
//    private static int calculateSumOfRollsCustomDice (int numberOfFaces, int numberOfRolls, List<Integer> numbersOnEachFace){
//        int sumOfRollsCustom = 0;
//        for (int i = 0; i < numberOfRolls; i++) {
//            int customRoll = numbersOnEachFace.get(randomInt(0,numberOfFaces-1));
//            sumOfRollsCustom = sumOfRollsCustom + customRoll;
//        }
//        return sumOfRollsCustom;
//    }
}

