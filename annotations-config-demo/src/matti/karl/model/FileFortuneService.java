package matti.karl.model;


import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class FileFortuneService implements FortuneService {
    private List<String> fortunes;

    private String fileName = "C:/Users/karlm/IdeaProjects/java-spring-demos/annotations-config-demo/src/matti/karl/data/fortunes.txt";
    // create a random number generator
    private Random myRandom = new Random();

    public FileFortuneService() {
        File theFile = new File(fileName);
        System.out.println("Reading fortunes from file: " + theFile);
        System.out.println("File exists: " + theFile.exists());
        // initialize array list
        fortunes = new ArrayList<>();
        // read fortunes from file
        try (BufferedReader br = new BufferedReader(
                new FileReader(theFile))) {

            String tempLine;

            while ((tempLine = br.readLine()) != null) {
                fortunes.add(tempLine);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public String getFortune() {
        // pick a random string from the array
        int rndIndex = myRandom.nextInt(fortunes.size());

        return fortunes.get(rndIndex);
    }
}
