package com.example.hellotoast

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

fun textMatches(resourceId: Int, expectedValue: String) {
    onView(withId(resourceId)).check(matches(withText(expectedValue)))


}