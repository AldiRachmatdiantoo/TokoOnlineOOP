package com.tokoonline.toko
import checkFilterList
import com.tokoonline.akun.Keranjang

class ProdukKategori {

    fun produkKategori(list: MutableList<String>, keranjang: Keranjang){
        println("=====CARI PRODUK=====")
        val chooseKategori = checkFilterList("Pilih kategori: ", list)
    }
    fun buah(){}
    fun cemilan(){}
    fun makananBesar(){}
    fun sayuran(){}

}