package com.naqi.classifiedapp.fragments.testing

import androidx.core.os.bundleOf
import androidx.fragment.app.testing.launchFragment
import androidx.test.core.app.launchActivity
import com.naqi.classifiedapp.activities.MainActivity
import com.naqi.classifiedapp.activities.SplashActivity
import com.naqi.classifiedapp.fragments.item_details.ItemDetailFragment
import com.naqi.classifiedapp.fragments.listing.ListingFragment
import com.naqi.classifiedapp.utils.Constants
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
class InstrTesting {
    @get: Rule
    var hiltRule = HiltAndroidRule(this)

    @Before
    fun init() {
//        hiltRule.inject()
    }

    @Test
    fun someTest() {
        hiltRule.inject()
    }

    @Test
    fun mainActivityTest() {
        val scenerio = launchActivity<MainActivity>()
    }

    @Test
    fun mainSplashTest() {
        val scenerio = launchActivity<SplashActivity>()
    }

    @Test
    fun firstFragmentTest() {
        val scenerio = launchFragmentInHiltContainer<ListingFragment>()
    }

    @Test
    fun secondFragmentTest() {
        // The "fragmentArgs" arguments are optional.
        val fragmentArgs = bundleOf(Constants.ITEM_JSON_KEY to Constants.SAMPLE_JSON)
        val scenario = launchFragment<ItemDetailFragment>(fragmentArgs)
    }
}