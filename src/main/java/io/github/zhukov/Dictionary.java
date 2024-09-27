package io.github.zhukov;

import java.util.Random;

class Dictionary {
    private static final String[] WORDS = { "abbreviation", "academy", "activity", "analogue", "animal", "baseball", "brother",
            "business", "camera", "chasis", "company", "country", "football", "government", "hospital", "industry",
            "information", "language", "medicine", "mountain", "newspaper", "people", "picture", "program", "question",
            "science", "solution", "teacher", "technology", "television", "wheelchair", "watchdog", "warehouse",
            "youngster", "yoghurt", "zealot", "zenith" };

    static String getRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }
}
