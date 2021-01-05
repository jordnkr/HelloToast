package com.example.hellotoast

import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest : BaseTest() {
    @Test
    fun youWinTest() {
        val mainPage = MainPage()

        for (i in 0..9) {
            clickButton(mainPage.countBtn)
        }

        textMatches(mainPage.showCountText, "You Win!")
    }
}
