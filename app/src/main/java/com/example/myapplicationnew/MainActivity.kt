package com.example.myapplicationnew

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplicationnew.databinding.AtivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: AtivityMainBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ativity_main)
        binding = AtivityMainBinding.inflate(layoutInflater)

        binding.button.setOnClickListener {
            binding.textView.text = "78786"
        }
    }
}