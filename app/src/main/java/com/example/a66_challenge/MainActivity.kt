package com.example.a66_challenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import androidx.room.Room
import com.example.a66_challenge.canvas.fragment.*
import com.example.a66_challenge.databinding.ActivityMainBinding
import com.example.a66_challenge.db.AppDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var canvasFragment: CanvasFragment
    private lateinit var db: AppDatabase
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initDB()
        initViews()
        setListeners()
    }

    private fun initDB() {
        db = Room.databaseBuilder(this, AppDatabase::class.java, "db-challenge").build()
    }

    private fun initViews() {
        getSavedBitmap()
        initDateText()
        initSuccessStatusPercentText()
        initCanvas()
        saveDrawBitmap()
    }

    private fun setListeners() {
        setListenerToPencilButton()
        setListenerToEraserButton()
    }

    private fun setListenerToPencilButton() {
        binding.btnPencil.setOnClickListener {
            canvasFragment.setToPen()
        }
    }

    private fun setListenerToEraserButton() {
        binding.btnEraser.setOnClickListener{
            canvasFragment.setToEraser()
        }
    }

    private fun initDateText() {
        binding.tvDate.text = intent.getStringExtra("date")
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
                        "100??? ?????????????????????. ?????? ??????????????????.",
                        Toast.LENGTH_SHORT
                    ).show()
                    etSuccessPercentage.setText("")
                }
                successStatusBar.progress = percent

            }
        }
    }

    private fun initCanvas() {
        canvasFragment = CanvasFragment()
        supportFragmentManager.beginTransaction().replace(R.id.canvas_view, canvasFragment)
            .commit()
    }

    private fun saveDrawBitmap() {
        binding.btnDrawBitmap.setOnClickListener {
            var id = binding.tvDate.text.toString()
            var bitmap = canvasFragment.getBitmap()
            binding.ivBitmap.setImageBitmap(bitmap)

            Thread {
                db.challengeDao().insert(Challenge(id, bitmap))
            }.start()
        }
    }

    private fun getSavedBitmap() {
        var id = intent.getStringExtra("date")
        Thread{
            db.challengeDao().getChallenge(id!!)?.let {
                binding.ivBitmap.setImageBitmap(it.bitmap)
            }
        }.start()


    }
}