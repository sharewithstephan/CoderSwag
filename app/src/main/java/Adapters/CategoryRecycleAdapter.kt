package Adapters

import Model.Category
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R

class CategoryRecycleAdapter(val context: Context, val Categories: List<Category>, val itemClick: (Category)->Unit ): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val  view= LayoutInflater.from(context).inflate(R.layout.category_list_item, parent,false)
        return Holder(view,itemClick)

    }

    override fun getItemCount(): Int {
        return Categories.count()

        //TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {

        holder?.bindCategory(Categories[position],context)
    }

    inner class Holder(itemView: View,val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView)
    {
       val categortImage= itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName=itemView?.findViewById<TextView>(R.id.categoryText)

        fun bindCategory(category: Category,context: Context)
        {
            categoryName?.text=category.title
            val resourcid=context.resources.getIdentifier(category.image,"drawable",context.packageName)
            categortImage?.setImageResource(resourcid)

            itemView.setOnClickListener { itemClick(category) }
        }
    }
}