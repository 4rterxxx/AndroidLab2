package com.example.androidlab2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = arrayOf(ImageAndText(R.string.google, R.drawable.google),
            ImageAndText(R.string.twitch, R.drawable.twitch),
            ImageAndText(R.string.youtube, R.drawable.youtube),
            ImageAndText(R.string.yandex, R.drawable.yandex),
            ImageAndText(R.string.amazon, R.drawable.amazon)
        )

        val customAdapter = CustomAdapter(dataset)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_id)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = customAdapter
    }
}