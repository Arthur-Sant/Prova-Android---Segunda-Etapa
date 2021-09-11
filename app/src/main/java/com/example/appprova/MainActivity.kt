package com.example.appprova

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.appprova.adapter.ProductAdapter
import com.example.appprova.model.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Autor do projeto
//        nome: Arthur Santiago Aguiar
//        matricula: 22002324
//        numero de chamada: 7

        val rvProductList = findViewById<RecyclerView>(R.id.rvProductList)

        val productList = getData()

        val productAdapter = ProductAdapter(productList, fun(product: Product){
            val productSelected = Intent(this, ProductSelected::class.java)

            productSelected.putExtra("image", product.image)
            productSelected.putExtra("name", product.name)
            productSelected.putExtra("description", product.description)
            productSelected.putExtra("prince", product.prince)

            startActivity(productSelected)
        })

        rvProductList.apply {
            adapter = productAdapter
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            itemAnimator = DefaultItemAnimator()
        }
    }

    private fun getData(): ArrayList<Product> {
        val array = ArrayList<Product>()

        array.add(Product(
            2131492866,
            "arroz prato fino branco 5 kg",
            "o arroz prato fino já é um dos grandes consumidores da população brasileira. o grão polido, tradicional e de padrão superior já está presente no nosso cardápio diário.",
            25.98
        ))

        array.add(Product(
            2131492876,
            "óleo de girassol liza pet 900 ml",
            "óleo de girassol liza pet 900 ml",
            15.99
        ))

        array.add(Product(
            2131492873,
            "leite longa vida porto alegre integral 1 l",
            "o leite uht integral porto alegre, é homogeneizado e submetido a uma temperatura de 143 a 151ºc, durante 4 a 9 segundos, mediante um processo térmico de fluxo contínuo, imediatamente resfriado a uma temperatura inferior a 32ºc e envasado sob condições assépticas em embalagens estéreis e hermeticamente fechadas.",
            3.99
        ))

        array.add(Product(
            2131492872,
            "feijão roxo prolife 1kg",
            "feijão roxo prolife 1kg",
            8.99
        ))

        array.add(Product(
            2131492874,
            "massa com ovos santa amália ave maria pacote 500 g",
            "ave maria ovos 500g\n" +
                    "massa produzida com a sêmola de trigo e ovos possui o formato de pequenos tubos cortados. conhecida como boccolotti, surgiu nas cortes aristocráticas do sul da itália e hoje é muito usada em sopas para enriquecer caldos.",
            4.59
        ))

        array.add(Product(
            2131492867,
            "azeite italiano san frediano extra virgem 0,5 acidez vidro 250 ml",
            "azeite ital s-frediano 250ml-vd ext virgem",
            16.90
        ))

        array.add(Product(
            2131492869,
            "café em pó 3 corações tradicional 500g",
            "o sul de minas produz um excelente café. é nesta região que é plantada a base deste blend: café tradicional de sabor marcante, que faz jus ao berço ilustre e exibe boa definição de corpo, frescor, aroma e sabores maduros equilibrados.",
            13.99
        ))

        array.add(Product(
            2131492877,
            "refrigerante coca-cola sem açúcar 2l",
            "Refrigerante Coca-Cola Sem Açúcar 2L\n" +
                    "A Coca-Cola Sem Açúcar é um refrigerante que não contém calorias! Com certeza você já se perguntou: “Então, de onde vem aquele gostinho doce? ” A Coca-Cola Sem Açúcar é produzida especialmente com adoçantes para manter o delicioso sabor de Coca-Cola porém com 0% Açucar. Perfeita para matar sua sede a qualquer hora do dia!",
            7.99
        ))

        array.add(Product(
            2131492871,
            "detergente líquido limpol coco 500ml",
            "deterg liq limpol 500ml-fr coco",
            2.15
        ))

        array.add(Product(
            2131492875,
            "manteiga porto alegre com sal pote 500 g",
            "a manteiga porto alegre é o produto obtido exclusivamente pelo processo de bateção e malaxagem do creme de leite pasteurizado. a matéria gorda da manteiga deve ser composta exclusivamente de gordura láctea. ",
            17.99
        ))

        array.add(Product(
            2131492870,
            "cerveja brahma chopp lata 473ml",
            "criada por um suíço que procurava um sabor mais europeu em solo brasileiro em 1888, no rio de janeiro; brahma chopp é uma cerveja de cor clara e aparência cristalina. ela é leve e com aroma neutro, sabor encorpado mas com amargor suave.",
            3.59
        ))

        array.add(Product(
            2131492868,
            "batata palha visconti tradicional pacote 140 g",
            "batata palha visconti 140g-pc trad",
            5.69
        ))

        return array

    }
}