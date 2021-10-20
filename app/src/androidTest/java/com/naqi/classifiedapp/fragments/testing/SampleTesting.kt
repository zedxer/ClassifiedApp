package com.naqi.classifiedapp.fragments.testing

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.launchActivity
import com.naqi.classifiedapp.activities.MainActivity
import com.naqi.classifiedapp.fragments.listing.ListingFragment
import com.naqi.classifiedapp.fragments.listing.ListingViewModel_Factory
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

@HiltAndroidTest
class SampleTesting {
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
    fun mainActivityTest(){
        val scenerio = launchActivity<MainActivity>()
    }
    @Test
    fun firstFragmentTest(){
        val scenerio = launchFragmentInHiltContainer<ListingFragment>()
    }
}