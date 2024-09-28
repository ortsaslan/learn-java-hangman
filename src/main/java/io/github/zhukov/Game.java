package io.github.zhukov;

import java.util.Arrays;
import java.util.Scanner;

public class Game {
    private final String[] GALLOW_STATE_PICS = AsciiGallow.getGallowStatePics();
    private final int MAX_FAILS = GALLOW_STATE_PICS.length - 1;

    private void renderGameFailMsg() {
        System.out.println("You have reached maximum failed guesses. You LOSE!");
    }

    private void renderGameWinMsg() {
        System.out.println("You revealed the word. You WIN!");
    }

    void play() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nDo you want to play or quit? Enter PLAY or QUIT: ");
            String playOrQuit = scanner.next();

            if (playOrQuit.equalsIgnoreCase("quit")) {
                System.out.println("Game ended. BYE-BYE!");
                break;
            }

            char[] secretWord = Dictionary.getRandomWord().toCharArray();

            char[] maskedWord = new char[secretWord.length];
            Arrays.fill(maskedWord, '-');

            int failedGuessesCount = 0;
            while (true) {
                System.out.println(GALLOW_STATE_PICS[failedGuessesCount]);
                System.out.printf("Secret word: %s%n", new String(maskedWord));
                System.out.printf("Failed guesses: %d%n", failedGuessesCount);

                if (failedGuessesCount == MAX_FAILS) {
                    renderGameFailMsg();
                    break;
                }

                int maskedLettersCount = 0;
                for (char c : maskedWord) {
                    if (c == '-') {
                        maskedLettersCount++;
                    }
                }
                if (maskedLettersCount == 0) {
                    renderGameWinMsg();
                    break;
                }

                System.out.print("Make your guess. Enter letter: ");
                char guessedLetter = scanner.next().charAt(0);

                int letterOccurrenceCount = 0;
                for (int i = 0; i < maskedWord.length; i++) {
                    if (secretWord[i] == guessedLetter) {
                        maskedWord[i] = guessedLetter;
                        letterOccurrenceCount++;
                    }
                }

                if (letterOccurrenceCount == 0) {
                    failedGuessesCount++;
                    System.out.printf("Your guess is wrong. There is no {%c} letter.\n\n%n", guessedLetter);
                } else {
                    System.out.printf("Your guess is correct, there is {%c} letter.\n\n%n", guessedLetter);
                }
            }
        }
    }
}
