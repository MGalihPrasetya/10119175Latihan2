package com.galih.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.galih.latihan2.databinding.ActivityAlmostThereBinding

//27 April 2022
//10119175
//Mochamad Galih Prasetya
//IF-5

class AlmostThereActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAlmostThereBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAlmostThereBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        intentToVerifyAccount()
    }

    private fun intentToVerifyAccount() {
        binding.apply {
            btnVerify.setOnClickListener {
                val intent = Intent(this@AlmostThereActivity, VerifyAccountActivity::class.java)
                startActivity(intent)
            }
        }
    }
}