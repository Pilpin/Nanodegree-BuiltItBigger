package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class GetJokeAsyncTest {
    public String joke;

    @Before
    public void getJoke(){
        GetJokeAsyncTask jokeAsyncTask = new GetJokeAsyncTask(null);
        joke = jokeAsyncTask.doInBackground();
    }

    @Test
    public void testDoInBackground() {
        Assert.assertTrue("Joke is an empty string", joke.length() > 0);
        Log.i("GCETest", joke);
        Assert.assertFalse("Joke is not working properly : " + joke, joke.contains("failed to connect to"));
    }
}
