package com.hangman.players;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class YourPlayerTest {

    @Test
    public void ReturnSequentially() {
        YourPlayer player = new YourPlayer();

        char guess = player.GetGuess(Arrays.asList('_', '_', '_'));
        assertEquals('e', guess);
        guess = player.GetGuess(Arrays.asList('_', '_', '_'));
        assertEquals('t', guess);
        guess = player.GetGuess(Arrays.asList('_', '_', '_'));
        assertEquals('a', guess);
    }

    @Test
    public void NotReturnIfPresent() {
        YourPlayer player = new YourPlayer();

        char guess = player.GetGuess(Arrays.asList('_', '_', 't'));
        assertEquals('e', guess);

        guess = player.GetGuess(Arrays.asList('_', '_', 't'));
        assertEquals('a', guess);
    }
    
    @Test
    public void CanSetGetWordList() {
        YourPlayer player = new YourPlayer();

        String[] words = {"one", "two", "three"};
        player.setWordList(words);

        assertArrayEquals(words,player.getWordList());

    }
 
}
