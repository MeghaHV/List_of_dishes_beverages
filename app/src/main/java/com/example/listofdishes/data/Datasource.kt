package com.example.listofdishes.data

import com.example.listofdishes.R
import com.example.listofdishes.model.ListOfDishesBeverages


class Datasource() {

    fun loadListOfDishesBeverages(): List<ListOfDishesBeverages> {
        val ingredients= arrayListOf<String>("Rice","Vegetables")
        val steps= arrayListOf<String>("Boil rice")
        return listOf<ListOfDishesBeverages>(
            ListOfDishesBeverages(R.string.title1, R.drawable.image01,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title2, R.drawable.image02,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title3, R.drawable.image03,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title4, R.drawable.image04,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title5, R.drawable.image05,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title6, R.drawable.image06,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title7, R.drawable.image07,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title8, R.drawable.image08,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title9, R.drawable.image09,ingredients,steps,"fried rice prepared"),
            ListOfDishesBeverages(R.string.title10, R.drawable.image010,ingredients,steps,"fried rice prepared")
        )
    }
}