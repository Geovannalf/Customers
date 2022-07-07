package com.example.customers.api

import com.example.customers.adapter.CustomersAdapter
import com.example.customers.model.Customers
import retrofit2.Response
import retrofit2.http.GET

interface apiService {
    @GET("service.json")
    suspend fun listCustomers(): Customers
}