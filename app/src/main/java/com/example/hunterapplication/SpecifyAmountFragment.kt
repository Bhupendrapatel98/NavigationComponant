package com.example.hunterapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class SpecifyAmountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater.inflate(R.layout.fragment_specify_amount, container, false)

        SpecifyAmountFragmentArgs.fromBundle(arguments!!).name
        Log.d("Receive Data", "onCreateView: "+SpecifyAmountFragmentArgs.fromBundle(arguments!!).name)

        return view;
    }

}