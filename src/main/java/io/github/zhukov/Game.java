package io.github.zhukov;

public class Game {
    private final int MAX_FAILS = AsciiGallow.getGallowStatePics().length;
    private final String[] GALLOW_STATE_PICS = AsciiGallow.getGallowStatePics();

    private void renderGameFailMsg() {
        System.out.println("You have reached maximum failed guesses. You LOSE!");
    }
    private void renderGameWinMsg() {
        System.out.println("You revealed the word. You WIN!");
    }

    void play() {

    }
}
