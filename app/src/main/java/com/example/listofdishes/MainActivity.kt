package com.example.listofdishes


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listofdishes.adapter.ItemAdapter
import com.example.listofdishes.data.Datasource
import com.example.listofdishes.details.detailsActivity
import com.example.listofdishes.model.Dish
import com.example.listofdishes.model.ListOfDishesBeverages

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataset = DishDataSource.runBackgroundThread(applicationContext).get()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val itemAdapter = ItemAdapter(this,myDataset)
        recyclerView.adapter = itemAdapter
        val clickListener:ItemAdapter.ClickListener=object:ItemAdapter.ClickListener{
            override fun onItemClick(view: View, position:Int) {
                val dish=itemAdapter.getdish(position)
                launchDetailActivity(dish)
            }
        }
        recyclerView.setHasFixedSize(true)
        itemAdapter.setItemClickListener(clickListener)


        }

    private fun launchDetailActivity(dish: Dish){
        val intent= Intent(this,detailsActivity::class.java)
        intent.putExtra("ingredients",dish.ingredients)
        intent.putExtra("description",dish.description)
        intent.putExtra("image",dish.image)
        startActivity(intent)
    }
    }
