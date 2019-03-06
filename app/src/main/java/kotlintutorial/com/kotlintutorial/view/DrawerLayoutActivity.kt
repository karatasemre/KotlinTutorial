package kotlintutorial.com.kotlintutorial.view

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlintutorial.com.kotlintutorial.R
import kotlintutorial.com.kotlintutorial.view.drawerNavFragment.HomeFragment
import kotlintutorial.com.kotlintutorial.view.drawerNavFragment.MoviesFragment
import kotlintutorial.com.kotlintutorial.view.drawerNavFragment.PhotosFragment
import kotlinx.android.synthetic.main.activity_drawerlayout.*
import kotlinx.android.synthetic.main.app_bar_main.*

class DrawerLayoutActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drawerlayout)

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        displayScreen(-1)

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.drawer, menu)
        return true
    }

    fun displayScreen(id: Int) {

        // val fragment =  when (id){

        when (id) {
            R.id.nav_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.relativelayout, HomeFragment()).commit()
            }

            R.id.nav_photos -> {
                supportFragmentManager.beginTransaction().replace(R.id.relativelayout, PhotosFragment()).commit()
            }

            R.id.nav_movies -> {
                supportFragmentManager.beginTransaction().replace(R.id.relativelayout, MoviesFragment()).commit()
            }

            R.id.nav_notifications -> {
                Toast.makeText(this, "Clicked Notifications", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_settings -> {
                Toast.makeText(this, "Clicked Settings", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_aboutUs -> {
                Toast.makeText(this, "Clicked About Us", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_privacyPolicy -> {
                Toast.makeText(this, "Clicked Privacy Policy", Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun onNavigationItemSelected(p0: MenuItem): Boolean {
        displayScreen(p0.itemId)

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}