package matti.karl.model;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    // create an array of strings
    private String[] fortunes = {
            "Look no further.",
            "Replace the mundane with something exotic.",
            "Take a break today."
    };

    // create a random number generator
    private Random myRandom = new Random();

    @Override
    public String getFortune() {
        // pick a random string from the array
        int randomIndex = myRandom.nextInt(fortunes.length);

        return fortunes[randomIndex];
    }
}
