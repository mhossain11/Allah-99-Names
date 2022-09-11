package com.example.allah99name

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.allah99name.adapter.NamesAdapter
import com.example.allah99name.databinding.ActivityNamelistBinding
import com.example.allah99name.model.ItemList

class NameListActivity : AppCompatActivity(), OnclickListener {
    lateinit var binding: ActivityNamelistBinding

    lateinit var nameTrlt: Array<String>
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //View binding
        binding = ActivityNamelistBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Adapter set
        val adapter = NamesAdapter(ItemList, this)
        val lm = LinearLayoutManager(applicationContext)
        binding.RvTV.adapter = adapter
        binding.RvTV.layoutManager = lm

        //Name Translate String resource
        nameTrlt = arrayOf(
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt),
            getString(R.string.allah_trlt)

            )

        //Custom Actionbar & drawer Toggle
        setSupportActionBar(binding.togolIc)
        toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.togolIc,
            R.string.open,
            R.string.close
        )

        //toggle icon color change
        toggle.drawerArrowDrawable.setColor(resources.getColor(R.color.white))

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        //menu button
        binding.navView.setNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.nav_home -> {
                    binding.drawerLayout.closeDrawer(GravityCompat.START)
                }

                R.id.nav_about -> {
                    val intent = Intent(this, About::class.java)
                    startActivity(intent)
                    finish()     // not save Stack Memory
                }
                R.id.nav_exit -> {
                    finish()
                    System.exit(0)
                }
            }
            true
        }
    }

    //menu Item
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item)) {

            return true
        }

        return super.onOptionsItemSelected(item)
    }



    // name_view to name_translation going & Data pass
    override fun btnClick(position: Int) {
        val intent = Intent(this, NameTranslationActivity::class.java)
        intent.putExtra("Name", ItemList[position].arabic_Trlt)
        intent.putExtra("Text", nameTrlt[position])
        startActivity(intent)


    }
}
