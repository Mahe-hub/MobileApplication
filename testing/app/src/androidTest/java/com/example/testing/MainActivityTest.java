package com.example.testing;

import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;


public class MainActivityTest {


    @Rule
    public ActivityScenarioRule<MainActivity>mActivitytest = new ActivityScenarioRule<MainActivity>(MainActivity.class);

    String mName = "Tony";

    @Before
    public  void setUp() throws  Exception {

    }

    @Test
    public void testUserInputScenario(){
        //INPUT VALUE IN EDITTEXT
        Espresso.onView(withId(R.id.input)).perform(typeText(mName));

        //Close soft keybad
        Espresso.closeSoftKeyboard();

        // perfom button click
        Espresso.onView(withId(R.id.change)).perform(click());

        // check the text
        Espresso.onView(withId(R.id.textviewChange)).check(matches(withText(mName)));
    }


    @After
    public  void setUpafter() throws  Exception {

    }

}
