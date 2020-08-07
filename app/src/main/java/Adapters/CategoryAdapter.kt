package Adapters

import Model.Category
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val context= context
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View

        val holder:viewHolder
        if(convertView==null) {
            categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_item,null)  // getting the items from our data to present in the desired layout
            holder=viewHolder()

            holder.categoryImage=categoryView.findViewById(R.id.categoryImage)   //seperating images and text
            holder.categoryName=categoryView.findViewById(R.id.categoryText)
            //println("firsttime")
             categoryView.tag=holder

        }

        else
        {
            holder=convertView.tag as viewHolder
            categoryView=convertView

        }



//        categoryView=LayoutInflater.from(context).inflate(R.layout.category_list_item,null)  // getting the items from our data to present in the desired layout
//        val categoryImage: ImageView=categoryView.findViewById(R.id.categoryImage)   //seperating images and text
//        val categoryName: TextView=categoryView.findViewById(R.id.categoryText)

        val category= categories[position] // selecting the location

      holder.categoryName?.text=category.title //setting text

        val resourceId=context.resources.getIdentifier(category.image, "drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)// setting image
       // println(resourceId)

        return categoryView
        //TODO("Not yet implemented")
    }

    override fun getItem(position: Int): Any {

        return categories[position]

        //TODO("Not yet implemented")
    }

    override fun getItemId(position: Int): Long {
       return 0
        // TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        return categories.count()


        //TODO("Not yet implemented")
    }

    private class viewHolder {
        var categoryImage: ImageView?=null
        var categoryName: TextView?=null
    }
}
