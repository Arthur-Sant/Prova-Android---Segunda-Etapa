package com.example.appprova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ProductSelected : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_selected)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        val imgProductSelected = findViewById<ImageView>(R.id.imgProductSelected)
        val tvProductSelectedName = findViewById<TextView>(R.id.tvProductSelectedName)
        val tvProductSelectedDescription = findViewById<TextView>(R.id.tvProductSelectedDescription)
        val tvProductSelectedPrince = findViewById<TextView>(R.id.tvProductSelectedPrince)

        val productImage = intent.getIntExtra("image", 0)
        val productName = intent.getStringExtra("name")
        val productDescription = intent.getStringExtra("description")
        val productPrince = intent.getDoubleExtra("prince", 0.0)

        imgProductSelected.setImageResource(productImage)
        tvProductSelectedName.text = productName
        tvProductSelectedDescription.text = productDescription
        tvProductSelectedPrince.text = "Valor: R$ $productPrince"

        btnBack.setOnClickListener {
            onBackPressed()
        }


    }

    override fun onBackPressed() {
        val backMainActivity = Intent(this, MainActivity::class.java)
        startActivity(backMainActivity)
        finishAffinity()
    }
}