package com.example.oishireshipi

import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListRecipeAdapter(private val listRecipe: ArrayList<Recipe>) : RecyclerView.Adapter<ListRecipeAdapter.ListViewHolder>() {
   inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
       var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
       var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
       var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
       var btnMore: Button = itemView.findViewById(R.id.btn_set_more)
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_recipe, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val recipe = listRecipe[position]
        val context = holder.itemView.getContext()

        Glide.with(holder.itemView.context)
                .load(recipe.photo)
                .apply(RequestOptions().override(150, 220))
                .into(holder.imgPhoto)

        holder.tvName.text = recipe.name
        holder.tvDetail.text = recipe.detail
        holder.btnMore.setOnClickListener { Toast.makeText(holder.itemView.context, "Anda menambahkan " + listRecipe[holder.adapterPosition].name + " sebagai Favorite", Toast.LENGTH_SHORT).show() }

        holder.itemView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v:View) {

                val bundle = Bundle()
                bundle.putString("recipeNames", recipe.name)
                bundle.putString("recipeDetails", recipe.detail)
                bundle.putInt("recipeImages", recipe.photo)


                val move = Intent(context, PindahHalaman::class.java)
                move.putExtras(bundle)
                context.startActivity(move)
                Toast.makeText(holder.itemView.context, "" + listRecipe[holder.adapterPosition].name , Toast.LENGTH_SHORT).show()
            }
        })

    }


    override fun getItemCount(): Int {
        return listRecipe.size
    }
}