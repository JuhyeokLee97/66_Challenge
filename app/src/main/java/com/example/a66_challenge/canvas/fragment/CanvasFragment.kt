package com.example.a66_challenge.canvas.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a66_challenge.MyCanvasView
import com.example.a66_challenge.R

class CanvasFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val myCanvasView = MyCanvasView(requireContext())
        myCanvasView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)

        return myCanvasView
    }
}