package com.example.dz1


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MyActivity: AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var  fab: FloatingActionButton

    private val adapter = MyAdapter()

    override fun onCreate (savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)

        recyclerView.adapter = adapter

        fab = findViewById(R.id.fab)
        fab.setOnClickListener{
            adapter.addItems(adapter.itemCount + 1)
        }
        if (savedInstanceState != null){
            val itemsCount = savedInstanceState.getInt("ITEMS_COUNT")
            val items = List(itemsCount) { it + 1 }
            adapter.setItems(items)
        }
        else {
        adapter.setItems(listOf())
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("ITEMS_COUNT", adapter.itemCount)

    }


}