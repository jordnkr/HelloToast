package com.example.hellotoast

import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule

open class BaseTest {
    @Rule @JvmField var mActivityTestRule = ActivityScenarioRule(MainActivity::class.java)
}