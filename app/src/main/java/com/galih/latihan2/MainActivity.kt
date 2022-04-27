package com.galih.latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//27 April 2022
//10119175
//Mochamad Galih Prasetya
//IF-5

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }
}