package com.example.a66_challenge.table_of_diary

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.a66_challenge.MainActivity
import com.example.a66_challenge.R
import com.example.a66_challenge.databinding.TableOfDiaryDateBinding

class TableOfDiaryDateFragment : Fragment() {
    private lateinit var binding: TableOfDiaryDateBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TableOfDiaryDateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        setListener()
    }

    private fun setListener() {
        binding.apply {
            btnDate1.setOnClickListener { dateButtonClicked("1") }
            btnDate2.setOnClickListener { dateButtonClicked("2") }
            btnDate3.setOnClickListener { dateButtonClicked("3") }
            btnDate4.setOnClickListener { dateButtonClicked("4") }
            btnDate5.setOnClickListener { dateButtonClicked("5") }
            btnDate6.setOnClickListener { dateButtonClicked("6") }
            btnDate7.setOnClickListener { dateButtonClicked("7") }
            btnDate8.setOnClickListener { dateButtonClicked("8") }
            btnDate9.setOnClickListener { dateButtonClicked("9") }
            btnDate10.setOnClickListener { dateButtonClicked("10") }
            btnDate11.setOnClickListener { dateButtonClicked("11") }
            btnDate12.setOnClickListener { dateButtonClicked("12") }
            btnDate13.setOnClickListener { dateButtonClicked("13") }
            btnDate14.setOnClickListener { dateButtonClicked("14") }
            btnDate15.setOnClickListener { dateButtonClicked("15") }
            btnDate16.setOnClickListener { dateButtonClicked("16") }
            btnDate17.setOnClickListener { dateButtonClicked("17") }
            btnDate18.setOnClickListener { dateButtonClicked("18") }
            btnDate19.setOnClickListener { dateButtonClicked("19") }
            btnDate20.setOnClickListener { dateButtonClicked("20") }
            btnDate21.setOnClickListener { dateButtonClicked("21") }
            btnDate22.setOnClickListener { dateButtonClicked("22") }
            btnDate23.setOnClickListener { dateButtonClicked("23") }
            btnDate24.setOnClickListener { dateButtonClicked("24") }
            btnDate25.setOnClickListener { dateButtonClicked("25") }
            btnDate26.setOnClickListener { dateButtonClicked("26") }
            btnDate27.setOnClickListener { dateButtonClicked("27") }
            btnDate28.setOnClickListener { dateButtonClicked("28") }
            btnDate29.setOnClickListener { dateButtonClicked("29") }
            btnDate30.setOnClickListener { dateButtonClicked("30") }

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