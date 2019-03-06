package kotlintutorial.com.kotlintutorial.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.squareup.picasso.Picasso
import kotlintutorial.com.kotlintutorial.R
import kotlintutorial.com.kotlintutorial.view.Company
import kotlinx.android.synthetic.main.item_company.view.*

class CompanyAdapter(val companies: MutableList<Company>) : RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_company, parent, false)
        return CompanyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return companies.size
    }

    fun add(item: Company, position: Int) {
        companies.add(position, item)
        notifyItemInserted(position)
    }

    fun remove(item: Company) {
        val position = companies.indexOf(item)
        companies.removeAt(position)
        notifyItemRemoved(position)
    }

    fun toastMessage(holder: CompanyViewHolder, company: Company) {
        Toast.makeText(holder.itemView.context, "${company.name} is the best company in the world.", Toast.LENGTH_SHORT).show()
    }

    override fun onBindViewHolder(holder: CompanyViewHolder, position: Int) {
        val company = companies[position]
        holder.itemView.txtCompanyName.text = company.name
        holder.itemView.txtFoundingYear.text = company.foundingYear.toString()
        Picasso.get().load(company.imageUrl).into(holder.itemView.imgLogo)
        holder.itemView.setOnClickListener {
            toastMessage(holder, company)
        }
        holder.itemView.setOnLongClickListener {
            remove(company)
            return@setOnLongClickListener true
        }
    }


    class CompanyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}