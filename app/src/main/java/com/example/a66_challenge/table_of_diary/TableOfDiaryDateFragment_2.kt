package com.example.a66_challenge.table_of_diary

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a66_challenge.MainActivity
import com.example.a66_challenge.databinding.TableOfDiaryDate2Binding

class TableOfDiaryDateFragment_2 : Fragment() {
    private lateinit var binding: TableOfDiaryDate2Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TableOfDiaryDate2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        setListener()
    }

    private fun setListener() {
        binding.apply {
            btnDate34.setOnClickListener { dateButtonClicked("34") }
            btnDate35.setOnClickListener { dateButtonClicked("35") }
            btnDate36.setOnClickListener { dateButtonClicked("36") }
            btnDate37.setOnClickListener { dateButtonClicked("37") }
            btnDate38.setOnClickListener { dateButtonClicked("38") }
            btnDate39.setOnClickListener { dateButtonClicked("39") }
            btnDate40.setOnClickListener { dateButtonClicked("40") }
            btnDate41.setOnClickListener { dateButtonClicked("41") }
            btnDate42.setOnClickListener { dateButtonClicked("42") }
            btnDate43.setOnClickListener { dateButtonClicked("43") }
            btnDate44.setOnClickListener { dateButtonClicked("44") }
            btnDate45.setOnClickListener { dateButtonClicked("45") }
            btnDate46.setOnClickListener { dateButtonClicked("46") }
            btnDate47.setOnClickListener { dateButtonClicked("47") }
            btnDate48.setOnClickListener { dateButtonClicked("48") }
            btnDate49.setOnClickListener { dateButtonClicked("49") }
            btnDate50.setOnClickListener { dateButtonClicked("50") }
            btnDate51.setOnClickListener { dateButtonClicked("51") }
            btnDate52.setOnClickListener { dateButtonClicked("52") }
            btnDate53.setOnClickListener { dateButtonClicked("53") }
            btnDate54.setOnClickListener { dateButtonClicked("54") }
            btnDate55.setOnClickListener { dateButtonClicked("55") }
            btnDate56.setOnClickListener { dateButtonClicked("56") }
            btnDate57.setOnClickListener { dateButtonClicked("57") }
            btnDate58.setOnClickListener { dateButtonClicked("58") }
            btnDate59.setOnClickListener { dateButtonClicked("59") }
            btnDate60.setOnClickListener { dateButtonClicked("60") }
            btnDate66.setOnClickListener { dateButtonClicked("66") }
            btnDate61.setOnClickListener { dateButtonClicked("61") }
            btnDate62.setOnClickListener { dateButtonClicked("62") }
            btnDate63.setOnClickListener { dateButtonClicked("63") }
            btnDate64.setOnClickListener { dateButtonClicked("64") }
            btnDate65.setOnClickListener { dateButtonClicked("65") }
            btnDate66.setOnClickListener { dateButtonClicked("66") }

        }
    }

    private fun initViews() {
    }

    private fun dateButtonClicked(date: String) {
        val intent = Intent(requireActivity(), MainActivity::class.java)
        intent.putExtra("date", date.toString())
        startActivity(intent)
    }
}