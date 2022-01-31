package com.example.a66_challenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a66_challenge.databinding.ActivitySplashScreenBinding
import com.example.a66_challenge.table_of_diary.TableOfDiaryActivity

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.root.postDelayed({
            val intent = Intent(this, TableOfDiaryActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
//        binding.root.postDelayed({ 2000 }){
//            val intent = Intent(this, TableOfDiaryActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
    }
}