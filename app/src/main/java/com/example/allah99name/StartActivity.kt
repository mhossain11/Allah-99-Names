package com.example.allah99name

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allah99name.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //View binding
        binding = ActivityStartBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Bismillah to name_View going
        binding.btn.setOnClickListener {
            val intent = Intent(applicationContext,NameListActivity::class.java)
            startActivity(intent)
            finish()  // not save Stack Memory
        }


    }
}