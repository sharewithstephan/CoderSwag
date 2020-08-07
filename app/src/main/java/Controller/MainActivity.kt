package Controller

import Adapters.CategoryAdapter
import Model.Category
import Services.DataServices
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   lateinit var adapter : CategoryAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        adapter= CategoryAdapter(this, DataServices.categories)
        catrgoryListView.adapter= adapter



        
//        catrgoryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category= DataServices.categories[i]
//            Toast.makeText(this,"You Clicked on the ${category.title} cell",Toast.LENGTH_SHORT).show()

       // }
    }
}