package com.example.a66_challenge

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
    }

    private fun initViewPager() {
        pagerFragmentStateAdapter = PagerFragmentStateAdapter(this)
        pagerFragmentStateAdapter.addFragment(TableOfDiaryDateFragment())
        pagerFragmentStateAdapter.addFragment(TableOfDiaryDateFragment_60())

        binding.viewPager.adapter = pagerFragmentStateAdapter
    }
}