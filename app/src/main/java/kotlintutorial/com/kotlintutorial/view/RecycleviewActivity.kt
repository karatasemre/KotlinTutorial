package kotlintutorial.com.kotlintutorial.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlintutorial.com.kotlintutorial.R
import kotlintutorial.com.kotlintutorial.adapter.CompanyAdapter
import kotlintutorial.com.kotlintutorial.data.Dummy
import kotlinx.android.synthetic.main.activity_recycleview.*

data class Company(val name: String = "", val imageUrl: String = "", val foundingYear: Int = 0)

class RecycleviewActivity : AppCompatActivity() {
    lateinit var list: MutableList<Company>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycleview)

        list = Dummy.getCompanies()

        recylerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        recylerView.adapter = CompanyAdapter(list)


        addItem.setOnClickListener {
            addItemOnList()
        }
    }

    fun addItemOnList() {
        list.add(0, Company("Emre", "https://www.geartechnology.com/blog/wp-content/uploads/2016/02/google_logo_2015_by_eduard2009-d9809xo-800x500_c.png", 2019))
        recylerView.adapter!!.notifyDataSetChanged();
    }
}
