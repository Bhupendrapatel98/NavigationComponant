package com.example.hunterapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

class RecipientFragment : Fragment() {

    lateinit var send:Button
    lateinit var cancel:Button
    lateinit var name:EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as AppCompatActivity?)!!.supportActionBar!!.show() //show Toolbar
        val view:View =  inflater.inflate(R.layout.fragment_recipient, container, false)

        send = view.findViewById(R.id.send)
        cancel = view.findViewById(R.id.cancel)
        name = view.findViewById(R.id.name)

        send.setOnClickListener{
            //navigate to other fragment with data
            var navDirections:NavDirections = RecipientFragmentDirections.actionRecipientFragmentToSpecifyAmountFragment(name.text.toString())
            Navigation.findNavController(view).navigate(navDirections)
        }

        cancel.setOnClickListener{
            Navigation.findNavController(view).navigateUp()
        }

        return  view
    }
}