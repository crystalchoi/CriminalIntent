package com.bignerdranch.android.criminalintent

import android.os.Bundle
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// 15장.. appBar 연습문제       val appCompatActivity = this as AppCompatActivity
//        val appBar = appCompatActivity.supportActionBar as Toolbar
////        appBar.setTitle("test")
    }
}
