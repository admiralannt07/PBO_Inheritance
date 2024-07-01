/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asia.pbo.game;

import java.util.Random;

/**
 *
 * @author A-21
 */
public class Main {

    public static void main(String[] args) {
// Create a new game object
        NumberGuessingGame numberGame = new NumberGuessingGame(7);
        numberGame.play();
// Start the game
        String[] words = {"apel", "pisang", "mangga"};
        WordGuessingGame wordGame = new WordGuessingGame(5, words);
        wordGame.play();
    }
}
