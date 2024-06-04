package com.example.gp_tp.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.gp_tp.R



class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        // Acessar a view "next" do layout inflado
        val nextButton = view.findViewById<TextView>(R.id.next2)

        // Definir o OnClickListener para o botão "next"
        nextButton.setOnClickListener {
            // Acessar o ViewPager2 a partir da atividade
            val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
            // Mudar para o próximo item no ViewPager2
            viewPager?.currentItem = 2
        }
        return view
    }

}