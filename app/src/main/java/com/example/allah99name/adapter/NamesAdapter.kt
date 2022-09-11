package com.example.allah99name.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.allah99name.OnclickListener
import com.example.allah99name.R
import com.example.allah99name.model.ItemModel

class NamesAdapter (val itemList:List<ItemModel>, val onclickListener: OnclickListener):RecyclerView.Adapter<NamesAdapter.ItemViewHolder>(){

    //Widget find
    class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val txt:TextView = itemView.findViewById(R.id.number)
        val names:TextView = itemView.findViewById(R.id.name)
        val arabic:TextView = itemView.findViewById(R.id.arabic_translate)
        val bangla:TextView = itemView.findViewById(R.id.bangla_translate)
        var btn:Button = itemView.findViewById(R.id.btn) //find btn


    }
    //Set layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return ItemViewHolder(itemLayout)
    }

    // widget position
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.txt.text=itemList.get(position).num.toString()
        holder.names.text=itemList.get(position).name.toString()
        holder.arabic.text=itemList.get(position).arabic_Trlt.toString()
        holder.bangla.text=itemList.get(position).bangla_Trlt.toString()

        holder.btn.setOnClickListener {      //set btn onclick in onBindViewHolder

            onclickListener.btnClick(position) //extend interface OnclickListener and call
        }

    }

    //Item Count
    override fun getItemCount(): Int {
        return itemList.size
    }
}