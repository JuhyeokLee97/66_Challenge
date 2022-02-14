package com.example.a66_challenge.canvas.fragment

import android.graphics.Bitmap
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a66_challenge.MyCanvasView
import com.example.a66_challenge.R

class CanvasFragment : Fragment() {
    private lateinit var myCanvasView: MyCanvasView
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myCanvasView = MyCanvasView(requireContext())
        myCanvasView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        myCanvasView.contentDescription = getString(R.string.canvasContentDescription)

        return myCanvasView
    }

    fun getBitmap(): Bitmap = myCanvasView.getBitmap()

    fun setToPen() {
        myCanvasView.setToPen()
    }

    fun setToEraser() {
        myCanvasView.setToEraser()
    }
}