package com.example.customers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.customers.adapter.CustomersAdapter
import com.example.customers.databinding.FragmentListBinding

class ListFragment : Fragment() {
    private lateinit var binding: FragmentListBinding
    private val mainViewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)

        val customersAdapter = CustomersAdapter()

        binding.recyclerCustomers.layoutManager = LinearLayoutManager(context)
        binding.recyclerCustomers.adapter = customersAdapter
        binding.recyclerCustomers.setHasFixedSize(true)

        binding.floatingBack.setOnClickListener() {
            findNavController().navigate(R.id.action_listFragment_to_fragment)
        }


        return binding.root
    }
}