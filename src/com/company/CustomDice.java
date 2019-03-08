package com.company;

import java.util.List;
import java.util.Random;

public class CustomDice implements Dice {

    int numberOfSides;
    List<Integer> numberOnFaces;

    public CustomDice(int numberOfSides, List<Integer> numberOnFaces) {
        this.numberOfSides = numberOfSides;
        this.numberOnFaces = numberOnFaces;
    }

    public int roll() {
        Random randomNumber = new Random();
        int result = numberOnFaces.get(randomNumber.nextInt(numberOfSides));

        return result;
    }


}
