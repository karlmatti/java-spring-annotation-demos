package matti.karl;

import java.lang.reflect.Array;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] quotes = {"Today is a blast!", "You're gonna slay that mada**kin day!", "It's your day!"};
        int rnd = new Random().nextInt(quotes.length);
        return quotes[rnd];
    }
}
