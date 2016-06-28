package com.udacity.gradle.builditbigger.jokebackend;

import com.udacity.gradle.builditbigger.jokes.JokeTeller;

/** The object model for the data we are sending through endpoints */
public class MyJoke {

    public String getData() {
        JokeTeller jokeTeller = new JokeTeller();
        return jokeTeller.getRandomJoke();
    }
}