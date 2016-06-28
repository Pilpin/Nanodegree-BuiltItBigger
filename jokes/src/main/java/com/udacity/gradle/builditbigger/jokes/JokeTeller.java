package com.udacity.gradle.builditbigger.jokes;

import java.util.ArrayList;
import java.util.Random;

public class JokeTeller {
    private ArrayList<String> jokes;

    public JokeTeller(){
        jokes = new ArrayList<String>();
        jokes.add("What happens to a frog's car when it breaks down ? It gets toad away.");
        jokes.add("I never wanted to believe that my Dad was stealing from his job as a road worker. But when I got home, all the signs were there.");
        jokes.add("When you die, you should have your brain donated to science. I hear they're trying to come up with the perfect vacuum.");
        jokes.add("I was driving in Manhattan. There's traffic, nobody's moving... The guy behind me is honking just at me. He kept yelling at me. I decided that I'm gonna argue with this guy, but " +
                "I'm gonna argue about something else. I'm not having his argument; I'm having mine. So, he's like, 'Go!' And I go, 'Well give me back my jacket!' And he stopped. I was like, 'Yeah, you got my jacket! Give it back! I said you could borrow it, not have it! You're stretching it out, you fat pig! Give it back, now!' He got back in his car, and he locked his doors.");
    }

    public String getRandomJoke(){
        Random rand = new Random();
        return jokes.get(rand.nextInt(jokes.size()));
    }
}
