package com.example.a66_challenge.table_of_diary

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a66_challenge.MainActivity
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
        val intent = Intent(requireActivity(), MainActivity::class.java)
        binding.apply {
            btnDate1.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate2.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate3.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate4.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate5.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate6.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate7.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate8.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate9.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate10.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate11.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }

            btnDate12.setOnClickListener {
                intent.putExtra("date", "1")
                startActivity(intent)
            }
        }
    }

    private fun initViews() {
    }
}