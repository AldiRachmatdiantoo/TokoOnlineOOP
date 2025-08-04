package com.tokoonline.akun

import com.tokoonline.toko.RincianKeranjang


class Keranjang {
    val listProduk = mutableMapOf<String, RincianKeranjang>()
    fun keranjang(){
        println("\n")
        println("=====KERANJANG=====")
        for ((index, entry) in listProduk.entries.withIndex()){
            println("${index+1}.${entry.value.produk}\nHarga: Rp.${entry.value.harga}\nJumlah: ${entry.value.jumlah}\n")
        }
        print("\npress any key to continue: ")
        readln()
    }

}
