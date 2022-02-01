package com.example.a66_challenge.table_of_diary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a66_challenge.adapter.PagerFragmentStateAdapter
import com.example.a66_challenge.databinding.ActivityTableOfDiaryBinding

class TableOfDiaryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTableOfDiaryBinding
    private lateinit var pagerFragmentStateAdapter: PagerFragmentStateAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTableOfDiaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        initViewPager()
        initForwardButton()
        initBackButton()
    }

    private fun initViewPager() {
        pagerFragmentStateAdapter = PagerFragmentStateAdapter(this)
        pagerFragmentStateAdapter.addFragment(TableOfDiaryDateFragment())
        pagerFragmentStateAdapter.addFragment(TableOfDiaryDateFragment_2())

        binding.viewPager.adapter = pagerFragmentStateAdapter
    }

    private fun initForwardButton() {
        binding.apply {
            btnForward.setOnClickListener {
                var temp = viewPager.currentItem
                if (viewPager.currentItem != 1) viewPager.currentItem = 1
            }
        }
    }

    private fun initBackButton() {
        binding.apply {
            btnBack.setOnClickListener {
                var temp = viewPager.currentItem
                if (viewPager.currentItem != 0) viewPager.currentItem = 0
            }
        }
    }
}