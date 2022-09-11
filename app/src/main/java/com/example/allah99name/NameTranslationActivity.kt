package com.example.allah99name

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allah99name.databinding.ActivityNametranslationBinding

class NameTranslationActivity : AppCompatActivity() {
    lateinit var binding: ActivityNametranslationBinding
    var pass:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //View binding
        binding = ActivityNametranslationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //received data
        val translate = intent.getStringExtra("Text")
        val tital = intent.getStringExtra("Name")
        //val pass = intent.getStringExtra("pas")

        //set data
        binding.resultTV.text = translate
        binding.titelTv.text = tital

        //name_translation to name_View going
        binding.backbtn.setOnClickListener {
            finish()   // not save Stack Memory

        }
    }

}

