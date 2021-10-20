package com.naqi.classifiedapp.fragments.testing

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.naqi.classifiedapp.R
import com.naqi.classifiedapp.activities.MainActivity
import com.naqi.classifiedapp.fragments.listing.ListingViewHolder
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4ClassRunner::class)
class UITesting {
    @get: Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)

    @get: Rule(order = 1)
    val activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)
    @Before
    fun init() {
        hiltRule.inject()
    }
    //visibility test
    @Test
    fun isProgressBarVisibleOnLaunch() {
        onView(withId(R.id.progress_bar)).check(matches(isDisplayed()))
    }
    @Test
    fun isListingVisibleOnLaunch() {
        onView(withId(R.id.listing_rv)).check(matches(isDisplayed()))
    }
    //click test
    @Test
    fun selectItemTest() {
        onView(withId(R.id.listing_rv)).perform(actionOnItemAtPosition<ListingViewHolder>(0, click()))
        onView(withId(R.id.itemName)).check(matches(withText("Notebook")))
        pressBack()
        onView(withId(R.id.listing_rv)).check(matches(isDisplayed()))
    }
}