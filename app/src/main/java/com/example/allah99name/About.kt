package com.example.allah99name

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.allah99name.databinding.ActivityAboutBinding

class About : AppCompatActivity() {
    val TAG = "About"
    lateinit var binding :ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)
      val view=binding.root
        setContentView(view)

        binding.backbtnAbout.setOnClickListener {

            val intent= Intent(it.context,NameListActivity::class.java)
            startActivity(intent)
            finish()
            Log.e(TAG,"backbtn_End")
        }
    }

}