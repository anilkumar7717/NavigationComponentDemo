package com.example.navigationcomponentdemo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.navigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_screen_three.*
import kotlinx.android.synthetic.main.fragment_screen_two.*

class ScreenThree : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_screen_three,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        screenThreeBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screenThree_to_screenOne)
        }
    }
}