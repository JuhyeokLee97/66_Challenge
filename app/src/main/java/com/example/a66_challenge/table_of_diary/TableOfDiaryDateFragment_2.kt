package com.example.a66_challenge.table_of_diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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


    }
}