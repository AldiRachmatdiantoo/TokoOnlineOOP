package com.tokoonline.akun

class Keranjang {
    val listProduk = mutableListOf<String>()
    fun keranjang(){
        println("=====KERANJANG=====")
        for ((index, value) in listProduk.withIndex()){
            println("${index+1}.$value")
        }
        print("\npress any key to continue: ")
        readln()
    }

}