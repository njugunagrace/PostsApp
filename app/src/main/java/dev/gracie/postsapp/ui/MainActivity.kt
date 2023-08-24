package dev.gracie.postsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.gracie.postsapp.R
import dev.gracie.postsapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}



