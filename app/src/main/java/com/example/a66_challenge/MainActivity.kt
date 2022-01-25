package com.example.a66_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import com.example.a66_challenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        initToDoFragment()
    }

    private fun initToDoFragment() {
        val toDoFragment = ToDoFragment()
        supportFragmentManager.beginTransaction().replace(R.id.to_do_frame_layout, toDoFragment).commit()
    }

}