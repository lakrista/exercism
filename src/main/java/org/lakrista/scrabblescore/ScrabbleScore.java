package org.lakrista.scrabblescore;

import java.util.Arrays;

/*
Given a word, compute the Scrabble score for that word.
Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
"cabbage" should be scored as worth 14 points
 */
public class ScrabbleScore {

    public static void main(String[] args) {
        Scrabble scrabble = new Scrabble("cabbage");
        System.out.println(scrabble.getScore());
    }
}

class Scrabble {

    private final String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        String[] letters = word.toUpperCase().split("");
        return Arrays.stream(letters)
                .map(this::getLetterValue)
                .reduce(0, Integer::sum);
    }

    int getLetterValue(String letter) {
        return switch (letter) {
            case "A", "E", "I", "O", "U", "L", "N", "R", "S", "T" -> 1;
            case "D", "G" -> 2;
            case "B", "C", "M", "P" -> 3;
            case "F", "H", "V", "W", "Y" -> 4;
            case "K" -> 5;
            case "J", "X" -> 8;
            case "Q", "Z" -> 10;
            default -> 0;
        };
    }

}
