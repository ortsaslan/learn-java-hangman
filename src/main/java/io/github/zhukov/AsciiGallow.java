package io.github.zhukov;

class AsciiGallow {
    private static final String[] GALLOW_STATE_PICS = {
            """
  +---+
  |   |
      |
      |
      |
      |
=========""",
            """
  +---+
  |   |
  O   |
      |
      |
      |
=========""",
            """
  +---+
  |   |
  O   |
  |   |
      |
      |
=========""",
            """
  +---+
  |   |
  O   |
 /|   |
      |
      |
=========""",
            """
  +---+
  |   |
  O   |
 /|\\  |
      |
      |
=========""",
            """
  +---+
  |   |
  O   |
 /|\\  |
 /    |
      |
=========""",
            """
  +---+
  |   |
  O   |
 /|\\  |
 / \\  |
      |
========="""
    };

    static String[] getGallowStatePics() {
        return GALLOW_STATE_PICS;
    }
}
