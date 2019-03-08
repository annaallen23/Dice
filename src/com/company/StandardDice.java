package com.company;

import java.util.Random;

public class StandardDice implements Dice {
    int numberOfSides;

    public StandardDice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public int roll() {
        Random randomNumber = new Random();
        int result = randomNumber.nextInt(numberOfSides) + 1;
        return result;
    }

}
