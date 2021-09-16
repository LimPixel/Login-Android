package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.bahasa -> {
                Toast.makeText(this, "Pengaturan Bahasa", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.tampilan -> {
                Toast.makeText(this, "Pengaturan Tampilan", Toast.LENGTH_SHORT).show()
                return true

            }

            R.id.Logout -> {
                Toast.makeText(this, "LogOut", Toast.LENGTH_SHORT).show()
                return  true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}