package com.kotlinmovie.technicaltask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_passed -> Toast.makeText(
                applicationContext, "Товар сдал",
                Toast.LENGTH_LONG
            ).show()

            R.id.menu_no_passed -> {
                Toast.makeText(
                    applicationContext, "Выбери причину", Toast.LENGTH_LONG
                ).show()
                supportFragmentManager
                    .beginTransaction()
                    .addToBackStack("")
                    .add(R.id.fragment_container, BlankFragmentListError()).commit()


            }

            R.id.menu_passed_later -> Toast.makeText(
                applicationContext, "Сдам позже",
                Toast.LENGTH_LONG
            ).show()
        }
        return super.onOptionsItemSelected(item)
    }
}