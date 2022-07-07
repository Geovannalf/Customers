package com.example.customers.api

import com.example.customers.model.Customers
import retrofit2.Response

class Repository {
    suspend fun listCustomers(): Customers {
        return RetrofitInstance.api.listCustomers()
    }
}