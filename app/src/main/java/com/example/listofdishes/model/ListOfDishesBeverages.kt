package com.example.listofdishes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ListOfDishesBeverages(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val ingredients: Int,
    @StringRes val description: Int,
    @DrawableRes val image: Int
)
