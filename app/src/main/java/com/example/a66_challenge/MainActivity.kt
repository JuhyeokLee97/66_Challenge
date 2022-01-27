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
        initToDoCanvas()
        initReviewCanvas()
        initPromiseTimeValueCanvas()
        initPromisePlaceValueCanvas()
        initPromiseDoingValueCanvas()
        initDateCanvas()
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


    private fun initToDoCanvas() {
        val toDoFragment = ToDoFragment()
        supportFragmentManager.beginTransaction().replace(R.id.to_do_frame_layout, toDoFragment)
            .commit()
    }

    private fun initReviewCanvas() {
        val reviewFragment = ReviewFragment()
        supportFragmentManager.beginTransaction().replace(R.id.review_frame_layout, reviewFragment)
            .commit()
    }

    private fun initPromiseTimeValueCanvas() {
        val promiseTimeValueFragment = PromiseTimeValueFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.promise_time_value_frame_layout, promiseTimeValueFragment)
            .commit()
    }

    private fun initPromisePlaceValueCanvas() {
        val promisePlaceValueFragment = PromisePlaceValueFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.promise_place_value_frame_layout, promisePlaceValueFragment)
            .commit()
    }

    private fun initPromiseDoingValueCanvas() {
        val promiseDoingValueFragment = PromiseDoingValueFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.promise_doing_value_frame_layout, promiseDoingValueFragment)
            .commit()
    }

    private fun initDateCanvas() {
        val dateFragment = DateFragment()
        supportFragmentManager.beginTransaction().replace(R.id.date_frame_layout, dateFragment)
            .commit()
    }

}