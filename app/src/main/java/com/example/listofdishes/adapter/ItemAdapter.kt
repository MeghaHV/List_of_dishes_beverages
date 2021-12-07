package com.example.listofdishes.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageButton
import androidx.recyclerview.widget.RecyclerView
import com.example.listofdishes.MainActivity
import com.example.listofdishes.R
import com.example.listofdishes.details.detailsActivity
import com.example.listofdishes.model.Dish
import com.example.listofdishes.model.ListOfDishesBeverages


class ItemAdapter(private val context: Context,
                  private val dataset: ArrayList<Dish>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private lateinit var clickListener: ClickListener
    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = item.name
        holder.imageView.setImageResource(R.drawable.image01)
        holder.itemView.setOnClickListener{
            clickListener.onItemClick(it,position)
        }

    }
    override fun getItemCount() = dataset.size

    fun setItemClickListener(mClickListener: ClickListener){
        clickListener = mClickListener
    }

    interface ClickListener{
        fun onItemClick(view:View, position: Int)
    }

    fun getdish(position:Int): Dish{
        return dataset[position]
    }


}