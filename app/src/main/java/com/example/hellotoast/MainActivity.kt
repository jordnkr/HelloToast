package com.example.hellotoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private var mCount = 0
    private lateinit var mShowCount: TextView
    private lateinit var zeroBtn: Button
    private lateinit var countBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mShowCount = findViewById(R.id.show_count)
        countBtn = findViewById(R.id.button_count)
        zeroBtn = findViewById(R.id.button_zero)
    }

    fun showToast(view: View) {
        val toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT)
        toast.show()
    }

    fun countUp(view: View) {
        if (view.isEnabled) {
            if (!zeroBtn.isEnabled) {
                zeroBtn.isEnabled = true
                zeroBtn.setTextColor((ContextCompat.getColor(this, R.color.white)))
            }

            if (Integer.valueOf(mShowCount.text.toString()) < 9) {
                mCount++
                mShowCount.text = mCount.toString()
            } else {
                view.isEnabled = false
                countBtn.setTextColor(ContextCompat.getColor(this, R.color.disabledGrey))
                mShowCount.text = getString(R.string.winning_message)
            }
        }
    }

    fun resetZero(view: View) {
        if (view.isEnabled) {
            view.isEnabled = false
            zeroBtn.setTextColor((ContextCompat.getColor(this, R.color.disabledGrey)))
            mCount = 0
            mShowCount.text = getString(R.string.count_initial_value)
        }
        if (!countBtn.isEnabled) {
            countBtn.isEnabled = true
            countBtn.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
    }
}