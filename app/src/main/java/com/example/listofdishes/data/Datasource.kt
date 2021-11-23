package com.example.listofdishes.data

import com.example.listofdishes.R
import com.example.listofdishes.model.ListOfDishesBeverages


class Datasource() {

    fun loadListOfDishesBeverages(): List<ListOfDishesBeverages> {
        return listOf<ListOfDishesBeverages>(
            ListOfDishesBeverages(R.string.title1, R.drawable.image01,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title2, R.drawable.image02,R.string.ingredients1,R.string.description1),
            ListOfDishesBeverages(R.string.title3, R.drawable.image03,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title4, R.drawable.image04,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title5, R.drawable.image05,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title6, R.drawable.image06,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title7, R.drawable.image07,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title8, R.drawable.image08,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title9, R.drawable.image09,R.string.ingredients,R.string.description),
            ListOfDishesBeverages(R.string.title10, R.drawable.image010,R.string.ingredients,R.string.description)
        )
    }
}