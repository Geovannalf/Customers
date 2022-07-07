package com.example.customers.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customers.databinding.CardLayoutBinding
import com.example.customers.model.Customers

class CustomersAdapter : RecyclerView.Adapter<CustomersAdapter.CustomersViewHolder>() {

    var listCustomer = emptyList<Customers>()

    class CustomersViewHolder(val binding: CardLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomersViewHolder {
        return CustomersViewHolder(
            CardLayoutBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CustomersViewHolder, position: Int) {
        val customers = listCustomer[position]

        holder.binding.textStatus.text = customers.status
        holder.binding.textProfileImage.text = customers.profileImage
        holder.binding.textProfileLink.text = customers.profileLink
        holder.binding.textPhone.text = customers.phone
        holder.binding.textEmail.text = customers.email
        holder.binding.textName.text = customers.name
        holder.binding.textId.text = customers.id
    }

    override fun getItemCount(): Int {
        return listCustomer.size
    }

    fun setList(list: List<Customers>) {
        listCustomer = list.sortedByDescending { it.id }
        notifyDataSetChanged()

    }
}


