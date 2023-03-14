package com.example.mandi.data

data class Seller(
    val name: String,
    val loyalty_card_id: String?,
    val registered: Boolean,
    val village: String,
    val selling_price_per_kg: Double
)
