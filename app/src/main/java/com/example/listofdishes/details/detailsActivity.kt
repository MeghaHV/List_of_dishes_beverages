package com.example.listofdishes.details

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.listofdishes.R

class detailsActivity : AppCompatActivity() {

    private lateinit var ingredientsTextView:TextView
    private lateinit var descriptionTextView:TextView
    private lateinit var recipeImageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        ingredientsTextView=findViewById(R.id.ingredients)
        descriptionTextView=findViewById(R.id.description)
        recipeImageView=findViewById(R.id.image)
        val extras: Bundle? = intent.extras
        if(extras!=null){
            val ingredients = extras.getString("ingredients", "")
            ingredientsTextView.setText(ingredients)
            val description = extras.getString("description", "")
            descriptionTextView.setText(description)
            val recipeImage = extras.getInt("image", 0)
            recipeImageView.setImageResource(R.drawable.image01)

        }

    }
}