package com.example.hellotoast.common

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId

fun clickButton(resourceId: Int) {
    onView(withId(resourceId)).perform(click())
}
