package com.example.navigationcomponentdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_screen_one.*

class ScreenOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        screenOneBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screenOne_to_screenTwo)
        }
    }
}