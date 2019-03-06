package kotlintutorial.com.kotlintutorial

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlintutorial.com.kotlintutorial.view.BottomNavBarActivity
import kotlintutorial.com.kotlintutorial.view.DrawerLayoutActivity
import kotlintutorial.com.kotlintutorial.view.RecycleviewActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview.setOnClickListener {
            val intent = Intent(this, RecycleviewActivity::class.java)
            startActivity(intent)
        }

        bottomnavbar.setOnClickListener {
            val intent = Intent(this, BottomNavBarActivity::class.java)
            startActivity(intent)
        }

        drawermenu.setOnClickListener {
            val intent = Intent(this, DrawerLayoutActivity::class.java)
            startActivity(intent)
        }
    }
}
