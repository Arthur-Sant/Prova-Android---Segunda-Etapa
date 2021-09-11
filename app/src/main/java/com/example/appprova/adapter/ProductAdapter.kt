package com.example.appprova.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.content.UriPermission
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.appprova.model.Product
import android.graphics.BitmapFactory
import android.net.Uri
import android.renderscript.Allocation
import com.example.appprova.R
import java.io.File

class ProductAdapter(
    private val productList: ArrayList<Product>,
    private val productSelected: ((product: Product) -> Unit)
) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>(){

    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val imgProduct: ImageView = view.findViewById(R.id.imgProduct)
        val tvProductName: TextView = view.findViewById(R.id.tvProductName)
        val tvProductDescription: TextView = view.findViewById(R.id.tvProductDescription)
        val tvProductPrince: TextView = view.findViewById(R.id.tvProductPrince)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.intem_lista, parent, false)
        return ProductViewHolder(view)
    }

    @SuppressLint("ResourceType")
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.apply {
            imgProduct.setImageResource(product.image)
            tvProductName.text = product.name
            tvProductDescription.text = product.description
            tvProductPrince.text = "Valor: R$ ${product.prince}"
            itemView.setOnClickListener {
                productSelected(product)
            }
        }
    }

    override fun getItemCount(): Int = productList.size
}