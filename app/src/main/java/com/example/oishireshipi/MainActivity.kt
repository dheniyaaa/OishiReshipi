package com.example.oishireshipi

import android.content.ClipData
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.net.Uri
import android.os.Parcel
import android.os.Parcelable
import android.telecom.Call
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.MenuItemHoverListener
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import org.w3c.dom.Text

class MainActivity() : AppCompatActivity(), MenuItem.OnMenuItemClickListener{
    private lateinit var rvRecipe: RecyclerView
    private var list: ArrayList<Recipe> = arrayListOf()
    private var title: String = "Oishi Reshipi"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)



        rvRecipe = findViewById(R.id.rv_recipes)
        rvRecipe.setHasFixedSize(true)

        list.addAll(RecipeData.listData)
        showRecyclerlist()


    }


    private fun showRecyclerlist() {
        rvRecipe.layoutManager = LinearLayoutManager(this)
        val listRecipeAdapter = ListRecipeAdapter(list)
        rvRecipe.adapter = listRecipeAdapter
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)


    }

    override fun onMenuItemClick(item: MenuItem?): Boolean {
        return when (item?.itemId) {
            R.id.about -> {
                val moveAbout = Intent(this@MainActivity, about::class.java)
                startActivity(moveAbout)
                true
            }
            else -> false
        }
    }

}



