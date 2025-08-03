package com.tokoonline.akun

class Keranjang {
    val listProduk = mutableMapOf<String, Int>()
    fun keranjang(){
        println("\n")
        println("=====KERANJANG=====")
        for ((index, entry) in listProduk.entries.withIndex()){
            println("${index+1}.${entry.key}\nHarga: Rp.${entry.value}\n")
        }
        print("\npress any key to continue: ")
        readln()
    }

}