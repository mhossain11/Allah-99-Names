package com.example.allah99name

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

       Handler().postDelayed({   //splash screen
           val intent = Intent(this,StartActivity::class.java)
           startActivity(intent)
           finish()
       },3000)   // 3 second
    }
}