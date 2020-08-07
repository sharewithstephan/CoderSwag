package Controller

import Utilities.EXTRA_CATEGORY
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.R

class products_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_activity)

        val categoryType=intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}