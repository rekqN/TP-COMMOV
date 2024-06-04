package com.example.gp_tp.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.gp_tp.R


class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        // Acessar a view "next" do layout inflado
        val nextButton = view.findViewById<TextView>(R.id.finish)

        // Definir o OnClickListener para o botão "next"
        nextButton.setOnClickListener {

        }

        return view
    }

}