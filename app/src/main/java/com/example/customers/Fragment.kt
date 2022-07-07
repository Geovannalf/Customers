package com.example.customers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.customers.databinding.FragmentBinding
import com.example.customers.databinding.FragmentListBinding

class Fragment : Fragment() {
    private lateinit var binding: FragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBinding.inflate(layoutInflater, container, false)


        binding.buttonList.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_to_listFragment)
        }

        return binding.root


    }
}