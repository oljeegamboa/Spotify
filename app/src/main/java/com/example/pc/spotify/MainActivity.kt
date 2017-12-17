package com.example.pc.spotify

import android.content.res.Resources
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.ActionBar
import android.view.Gravity
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import disableMenuShiftMode
import android.widget.TextView
import android.widget.Toolbar
import kotlinx.android.synthetic.main.action_bar_new.*
import kotlinx.android.synthetic.main.song_list.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycleview = findViewById<RecyclerView>(R.id.recyclerView)



        recycleview.layoutManager = LinearLayoutManager(this, android.widget.LinearLayout.VERTICAL, false)

        val songs = ArrayList<Songs>()


        songs.add(Songs("Tibo - Tibo", "Moira Della Torre • Himig Handog 2017"))
        songs.add(Songs("Havana", "Camille Cabello, Young Thug • Havana"))
        songs.add(Songs("Young Dumb & Broke", "Khalid • American Teen"))
        songs.add(Songs("What Lovers Do (feat. SZA)", "Maroon 5, SZA • Red Pill Blues (Deluxe)"))
        songs.add(Songs("Perfect", "Ed Sheeran • ÷(Deluxe)"))
        songs.add(Songs("Super Far", "LANY • LANY"))
        songs.add(Songs("All Night", "The Vamps • All Night"))
        songs.add(Songs("Issues", "Julia Michaels • Issues"))
        songs.add(Songs("Sila", "Sud • Sila"))
        songs.add(Songs("Cold", "Maroon 5 • Cold"))
        songs.add(Songs("Just Hold On", "Steve Aoki • Just Hold On"))
        songs.add(Songs("The Cure", "Lady Gaga • The Cure"))

        val adapter = CustomAdapter(songs, applicationContext)

        recycleview.adapter = adapter

        val navView = findViewById<BottomNavigationView>(R.id.navigation) as BottomNavigationView
        disableMenuShiftMode(navView)

        getSupportActionBar()?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar()?.setCustomView(R.layout.action_bar_new);
        getSupportActionBar()?.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar()?.setDisplayShowHomeEnabled(true);

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.threedotmenu,menu)
        return true
    }




}
