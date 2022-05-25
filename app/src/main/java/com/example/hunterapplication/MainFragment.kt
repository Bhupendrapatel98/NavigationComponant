package com.example.hunterapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainFragment : Fragment() {

    lateinit var transcation: Button
    lateinit var receipent: Button
    lateinit var viewBalance: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide() //hide Toolbar
        val view:View =  inflater.inflate(R.layout.fragment_main, container, false)

        transcation = view.findViewById(R.id.transcation)
        receipent = view.findViewById(R.id.receipent)
        viewBalance = view.findViewById(R.id.viewBalance)

        transcation.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_transacationFragment)
        }

        receipent.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_recipientFragment)
        }


        viewBalance.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_viewBalanceFragment)
        }

        return  view
    }


}