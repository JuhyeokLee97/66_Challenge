package com.example.a66_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.a66_challenge.canvas.fragment.*
import com.example.a66_challenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    val handler = Handler(Looper.getMainLooper())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        initSuccessStatusPercentText()
        initCanvas()
    }


    private fun initSuccessStatusPercentText() {
        binding.etSuccessPercentage.addTextChangedListener {
            handler.removeCallbacks(runnable)
            handler.postDelayed(runnable, 500)
        }
    }

    private val runnable = Runnable {
        binding.apply {
            var percentage = etSuccessPercentage.text.toString()
            if (!percentage.isNullOrEmpty()) {
                var percent = percentage.toInt()
                if (percent > 100) {
                    Toast.makeText(
                        this@MainActivity,
                        "100을 초과하였습니다. 다시 입력해주세요.",
                        Toast.LENGTH_SHORT
                    ).show()
                    etSuccessPercentage.setText("")
                }
                successStatusBar.progress = percent

            }
        }
    }

    private fun initCanvas() {
        val canvasFragment = CanvasFragment()
        supportFragmentManager.beginTransaction().replace(R.id.canvas_view, canvasFragment)
            .commit()
    }
}