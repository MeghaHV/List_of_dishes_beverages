package com.example.listofdishes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ListOfDishesBeverages(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    val ingredients: ArrayList<String>,
    val steps: ArrayList<String>,
    val description: String
)
