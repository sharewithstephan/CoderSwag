package Controller

import Adapters.CategoryAdapter
import Adapters.CategoryRecycleAdapter
import Model.Category
import Services.DataServices
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   lateinit var adapter : CategoryRecycleAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter= CategoryRecycleAdapter(this, DataServices.categories)
        catrgoryListView.adapter= adapter

        val layoutManager= LinearLayoutManager(this)  // setting the layout for recycler view
        catrgoryListView.layoutManager=layoutManager

        catrgoryListView.setHasFixedSize(true)  



        
//        catrgoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category= DataServices.categories[i]
//            Toast.makeText(this,"You Clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()

       // }
    }
}